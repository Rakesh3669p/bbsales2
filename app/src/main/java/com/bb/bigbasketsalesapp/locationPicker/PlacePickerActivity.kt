package com.bb.bigbasketsalesapp.locationPicker

import android.content.Intent
import android.content.res.ColorStateList
import android.location.Address
import android.location.Geocoder
import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.OvershootInterpolator
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.utils.widget.ImageFilterView
import androidx.core.content.ContextCompat
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.ActivityPlacePickerBinding
import com.google.android.gms.common.api.Status
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.AutocompleteSupportFragment
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener
import com.google.android.material.button.MaterialButton
import com.sucho.placepicker.Constants
import com.sucho.placepicker.MapType
import java.util.*


class PlacePickerActivity : AppCompatActivity(), OnMapReadyCallback {

  companion object {
    private const val TAG = "PlacePickerActivity"
  }

  private lateinit var binding:ActivityPlacePickerBinding

  private lateinit var map: GoogleMap
  private lateinit var placeAutocomplete: AutocompleteSupportFragment


  private var googleApiKey: String = "AIzaSyD6dYxu1qeyLFAQJ9aqaQQTs5rifQkraz0"
  private var searchBarEnable: Boolean = false

  private lateinit var markerImage: ImageView
  private lateinit var markerShadowImage: ImageView
  private lateinit var myLocationFab: ImageFilterView
  private lateinit var placeAddressTextView: TextView
  private lateinit var infoLayout: FrameLayout
//  private lateinit var placeProgressBar: ProgressBar
  private lateinit var confirmLocation: MaterialButton

  private var latitude = Constants.DEFAULT_LATITUDE
  private var longitude = Constants.DEFAULT_LONGITUDE
  private var initLatitude = Constants.DEFAULT_LATITUDE
  private var initLongitude = Constants.DEFAULT_LONGITUDE
  private var showLatLong = true
  private var zoom = Constants.DEFAULT_ZOOM
  private var addressRequired: Boolean = true
  private var shortAddress = ""
  private var fullAddress = ""
  private var hideMarkerShadow = false
  private var markerDrawableRes: Int = -1
  private var markerColorRes: Int = -1
  private var fabColorRes: Int = -1
  private var primaryTextColorRes: Int = -1
  private var secondaryTextColorRes: Int = -1
  private var bottomViewColorRes: Int = -1
  private var mapRawResourceStyleRes: Int = -1
  private var addresses: List<Address>? = null
  private var mapType: MapType = MapType.NORMAL
  private var onlyCoordinates: Boolean = false
  private var hideLocationButton: Boolean = false
  private var disableMarkerAnimation: Boolean = false

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityPlacePickerBinding.inflate(layoutInflater)
    setContentView(binding.root)
    getIntentData()

    if (searchBarEnable) {
      showSearchBar()
    }

    // Obtain the SupportMapFragment and get notified when the map is ready to be used.
    val mapFragment =  supportFragmentManager.findFragmentById(R.id.maps) as SupportMapFragment
    mapFragment.getMapAsync(this)
    bindViews()


    confirmLocation.setOnClickListener {

        if (addresses != null) {
          val addressData = AddressData(latitude, longitude, addresses)
          val returnIntent = Intent()
          returnIntent.putExtra(Constants.ADDRESS_INTENT, addressData)
          setResult(RESULT_OK, returnIntent)
          finish()
        } else {
          if (!addressRequired) {
            sendOnlyCoordinates()
          }
        }
    }

    myLocationFab.setOnClickListener {
      if(this::map.isInitialized) {
        map.animateCamera(
          CameraUpdateFactory.newLatLngZoom(
            LatLng(initLatitude, initLongitude),
            zoom
          )
        )
      }
    }

    binding.backArrow.setOnClickListener { onBackPressed() }
    setIntentCustomization()
  }

  private fun showSearchBar() {
    if (!Places.isInitialized()) {
      Places.initialize(applicationContext, googleApiKey)
    }


    placeAutocomplete.setPlaceFields(
      listOf(
        Place.Field.ID,
        Place.Field.NAME,
        Place.Field.LAT_LNG,
        Place.Field.ADDRESS,
        Place.Field.ADDRESS_COMPONENTS,

      )
    )
    placeAutocomplete.setOnPlaceSelectedListener(object : PlaceSelectionListener {
      override fun onPlaceSelected(place: Place) {
        latitude = place.latLng!!.latitude
        longitude = place.latLng!!.longitude

        setAddress(latitude, longitude)


        map.clear()
        map.setOnMapLoadedCallback {
          setPlaceDetails(latitude, longitude, shortAddress, fullAddress)
          map.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(latitude, longitude), zoom))
        }
      }

      override fun onError(error: Status) {
        Log.d(TAG, error.toString())
      }
    })
  }

  private fun bindViews() {
    markerImage = findViewById(R.id.marker_image_view)
    markerShadowImage = findViewById(R.id.marker_shadow_image_view)
    myLocationFab = findViewById(R.id.my_location_button)
    confirmLocation = findViewById(R.id.confirmLocation)
    placeAddressTextView = findViewById(R.id.address)
//    placeProgressBar = findViewById(R.id.progress_bar_place)
  }

  private fun sendOnlyCoordinates() {
    val addressData = AddressData(latitude, longitude, null)
    val returnIntent = Intent()
    returnIntent.putExtra(Constants.ADDRESS_INTENT, addressData)
    setResult(RESULT_OK, returnIntent)
    finish()
  }

  private fun getIntentData() {
    latitude = intent.getDoubleExtra(Constants.INITIAL_LATITUDE_INTENT, Constants.DEFAULT_LATITUDE)
    longitude = intent.getDoubleExtra(
      Constants.INITIAL_LONGITUDE_INTENT,
      Constants.DEFAULT_LONGITUDE
    )
    initLatitude = latitude
    initLongitude = longitude
    showLatLong = intent.getBooleanExtra(Constants.SHOW_LAT_LONG_INTENT, false)
    addressRequired = intent.getBooleanExtra(Constants.ADDRESS_REQUIRED_INTENT, true)
    hideMarkerShadow = intent.getBooleanExtra(Constants.HIDE_MARKER_SHADOW_INTENT, false)
    zoom = intent.getFloatExtra(Constants.INITIAL_ZOOM_INTENT, Constants.DEFAULT_ZOOM)
    markerDrawableRes = intent.getIntExtra(Constants.MARKER_DRAWABLE_RES_INTENT, -1)
    markerColorRes = intent.getIntExtra(Constants.MARKER_COLOR_RES_INTENT, -1)
    fabColorRes = intent.getIntExtra(Constants.FAB_COLOR_RES_INTENT, -1)
    primaryTextColorRes = intent.getIntExtra(Constants.PRIMARY_TEXT_COLOR_RES_INTENT, -1)
    secondaryTextColorRes = intent.getIntExtra(Constants.SECONDARY_TEXT_COLOR_RES_INTENT, -1)
    bottomViewColorRes = intent.getIntExtra(Constants.BOTTOM_VIEW_COLOR_RES_INTENT, -1)
    mapRawResourceStyleRes = intent.getIntExtra(Constants.MAP_RAW_STYLE_RES_INTENT, -1)
    mapType = intent.getSerializableExtra(Constants.MAP_TYPE_INTENT) as MapType
    onlyCoordinates = intent.getBooleanExtra(Constants.ONLY_COORDINATES_INTENT, false)
    googleApiKey = "AIzaSyD6dYxu1qeyLFAQJ9aqaQQTs5rifQkraz0"
    searchBarEnable = intent.getBooleanExtra(Constants.SEARCH_BAR_ENABLE, false)
    hideLocationButton = intent.getBooleanExtra(Constants.HIDE_LOCATION_BUTTON, false)
    disableMarkerAnimation = intent.getBooleanExtra(Constants.DISABLE_MARKER_ANIMATION, false)
  }

  private fun setIntentCustomization() {
//    markerShadowImage.visibility = if (hideMarkerShadow) View.GONE else View.VISIBLE
    if (markerColorRes != -1) {
      markerImage.setColorFilter(ContextCompat.getColor(this, markerColorRes))
    }
    if (markerDrawableRes != -1) {
      markerImage.setImageDrawable(ContextCompat.getDrawable(this, markerDrawableRes))
    }
    if (fabColorRes != -1) {
      myLocationFab.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this, fabColorRes))
    }

    if (secondaryTextColorRes != -1) {
      placeAddressTextView.setTextColor(ContextCompat.getColor(this, secondaryTextColorRes))
    }
    if (bottomViewColorRes !=-1) {
        infoLayout.setBackgroundColor(ContextCompat.getColor(this, bottomViewColorRes))
    }
    myLocationFab.visibility = if(hideLocationButton) View.INVISIBLE else View.VISIBLE
  }

  override fun onMapReady(googleMap: GoogleMap) {
    map = googleMap

    map.setOnCameraMoveStartedListener {
      if (markerImage.translationY == 0f && !disableMarkerAnimation) {
        markerImage.animate()
            .translationY(-75f)
            .setInterpolator(OvershootInterpolator())
            .setDuration(250)
            .start()
      }
    }

    map.setOnCameraIdleListener {
      if(!disableMarkerAnimation) {
        markerImage.animate()
          .translationY(0f)
          .setInterpolator(OvershootInterpolator())
          .setDuration(250)
          .start()
      }

      showLoadingBottomDetails()
      val latLng = map.cameraPosition.target
      latitude = latLng.latitude
      longitude = latLng.longitude
      AsyncTask.execute {
        getAddressForLocation()
        runOnUiThread { setPlaceDetails(latitude, longitude, shortAddress, fullAddress) }
      }
    }
    map.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(latitude, longitude), zoom))
    if (mapRawResourceStyleRes != -1) {
      map.setMapStyle(MapStyleOptions.loadRawResourceStyle(this, mapRawResourceStyleRes))
    }
    map.isBuildingsEnabled = true
    map.isIndoorEnabled = true
    map.animateCamera( CameraUpdateFactory.zoomTo( 19.0f ) )
    map.mapType = when(mapType) {
      MapType.NORMAL -> GoogleMap.MAP_TYPE_NORMAL
      MapType.SATELLITE -> GoogleMap.MAP_TYPE_SATELLITE
      MapType.HYBRID -> GoogleMap.MAP_TYPE_HYBRID
      MapType.TERRAIN -> GoogleMap.MAP_TYPE_TERRAIN
      MapType.NONE -> GoogleMap.MAP_TYPE_NONE
      else -> GoogleMap.MAP_TYPE_NORMAL
    }
  }

  private fun showLoadingBottomDetails() {
    placeAddressTextView.text = ""
//    placeProgressBar.visibility = View.VISIBLE
  }

  private fun setPlaceDetails(
    latitude: Double,
    longitude: Double,
    shortAddress: String,
    fullAddress: String
  ) {

    if (latitude == -1.0 || longitude == -1.0) {
      placeAddressTextView.text = ""
//      placeProgressBar.visibility = View.VISIBLE
      return
    }
//    placeProgressBar.visibility = View.INVISIBLE

    placeAddressTextView.text = fullAddress
  }

  private fun getAddressForLocation() {
    setAddress(latitude, longitude)
  }

  private fun setAddress(
    latitude: Double,
    longitude: Double
  ) {
    val geoCoder = Geocoder(this, Locale.getDefault())
    try {
      val addresses = geoCoder.getFromLocation(latitude, longitude, 1)
      this.addresses = addresses
      return if (addresses != null && addresses.size != 0) {
        fullAddress = addresses[0].getAddressLine(
            0
        ) // If any additional address line present than only, check with max available address lines by getMaxAddressLineIndex()
        shortAddress = generateFinalAddress(fullAddress).trim()
      } else {
        shortAddress = ""
        fullAddress = ""
      }
    } catch (e: Exception) {
      //Time Out in getting address
      e.message?.let { Log.e(TAG, it) }
      shortAddress = ""
      fullAddress = ""
      addresses = null
    }
  }

  private fun generateFinalAddress(
    address: String
  ): String {
    val s = address.split(",")
    return if (s.size >= 3) s[1] + "," + s[2] else if (s.size == 2) s[1] else s[0]
  }
}
