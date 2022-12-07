package com.bb.bigbasketsalesapp.ui

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.content.IntentSender
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.data.BBSalesRepository
import com.bb.bigbasketsalesapp.databinding.ActivityMainBinding
import com.bb.bigbasketsalesapp.service.LocationUpdateService
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.*
import com.doctorsplaza.app.utils.Resource
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.location.*
import com.google.gson.JsonObject
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import pub.devrel.easypermissions.AppSettingsDialog
import pub.devrel.easypermissions.EasyPermissions
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


@RequiresApi(Build.VERSION_CODES.O)
@AndroidEntryPoint
class MainActivity : AppCompatActivity(), EasyPermissions.PermissionCallbacks {

    private lateinit var alertDialog: AlertDialog.Builder

    companion object {
        var mainHandler: Handler? = null
    }

    private lateinit var binding: ActivityMainBinding

    private lateinit var navController: NavController

    private lateinit var locationRequest: LocationRequest

    private var permissionToRequest = mutableListOf<String>()

    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    @Inject
    lateinit var session: SessionManager

    private val repository = BBSalesRepository()

    private val mainViewModel: MainViewModel by viewModels()

    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.mmm", Locale.getDefault())
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_BigBasketSalesApp)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = findNavController(R.id.navHostFragment)
        init()
    }

    private fun startLocationUpdates() {
        startService(Intent(this, LocationUpdateService::class.java))
        mainHandler = Handler(Looper.getMainLooper())
        mainHandler?.post(object : Runnable {
            override fun run() {
                getLocation()
                mainHandler?.postDelayed(this, 3600000)
            }
        })
    }


    private fun init() {

        checkLanguage()
        fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(applicationContext)
        locationRequest = LocationRequest.create()
        locationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        locationRequest.interval = 5000
        locationRequest.fastestInterval = 100
        locationRequest.numUpdates = 1

        if (session.locationDialogSeen) {
            checkLocationEnabled()

        } else {
            showLocationAccessDialog()
        }

    }

    private fun showLocationAccessDialog() {
        alertDialog = AlertDialog.Builder(this)
            .setTitle("Background Location Acess")
            .setMessage("BBSalesApp collects location data to enable tracking your trips to work and calculate distance travelled even when app is closed or not in use\n\nAlert: The background location permission is mandatory for using the app")
            .setNegativeButton("Deny"){_,_->
                session.locationDialogSeen = false
                finishAffinity()
            }
            .setPositiveButton("Approve") { _, _ ->
                session.locationDialogSeen = true
                checkLocationEnabled()
            }.setIcon(R.drawable.location_marker)
            alertDialog.show()
    }

    private fun checkLanguage() {
        mainViewModel.getNotificationMessageCount()

        mainViewModel.getNotificationMessageCount.observe(
            this
        ) { response ->
            when (response) {
                is Resource.Success -> {
                    if (response.data?.Output == "Success") {
                        session.notificationCount = response.data.NotificationCount
                        session.messageCount = response.data.ChatCount
                    }
                }
                is Resource.Loading -> {}
                is Resource.Error -> {}
            }
        }


        val currentTime = Date()
        val accessTime = simpleDateFormat.format(currentTime)
        session.currentLanguageCode = Locale.getDefault().language
        if (session.currentLanguageCode == "ar") {
            mainViewModel.getLang(accessTime)
            mainViewModel.translatedString.observe(this) { response ->
                when (response) {
                    is Resource.Success -> {
                        hitUpdateLocationApi(response.data.toString())
                    }
                    is Resource.Loading -> {

                    }
                    is Resource.Error -> {
                    }
                }
            }
        } else {
            hitUpdateLocationApi(accessTime)
        }
    }


    private val resolutionForResult =
        registerForActivityResult(ActivityResultContracts.StartIntentSenderForResult()) { activityResult ->
            session.isLocationEnabled = activityResult.resultCode == Activity.RESULT_OK
            checkLocationEnabled()
        }

    fun checkLocationEnabled() {
        if (isPermissionsGiven(applicationContext)) {
            startLocationUpdates()

            if (!isLocationEnabled(applicationContext)) {
                enableLocation()
            } else {
                getLocation()
            }

        } else {
            requestPermission()
        }
    }


    @SuppressLint("MissingPermission")
    fun getLocation() {
        val locationCallback = object : LocationCallback() {
            override fun onLocationResult(p0: LocationResult) {
                super.onLocationResult(p0)
                val locations = p0.locations
                session.latitude = locations[0].latitude.toString()
                session.longitude = locations[0].longitude.toString()
                checkLanguage()
            }
        }

        fusedLocationProviderClient.lastLocation.addOnCompleteListener { task ->
            if (task.isSuccessful && task.result != null) {
                val location = task.result
                session.latitude = location!!.latitude.toString()
                session.longitude = location.longitude.toString()
                checkLanguage()
            } else {
                fusedLocationProviderClient.requestLocationUpdates(
                    locationRequest,
                    locationCallback,
                    Looper.getMainLooper()
                )
            }
        }
    }

    @OptIn(DelicateCoroutinesApi::class)
    private fun hitUpdateLocationApi(accessTime: String) {
        val jsonObject = JsonObject().apply {
            addProperty("UserLocationsID", "0")
            addProperty("OrganisationID", session.organisationId)
            addProperty("SalesmanID", session.userId)
            addProperty("Latitude", session.latitude)
            addProperty("Longitude", session.longitude)
            addProperty("AccessTime", accessTime)
        }

        GlobalScope.launch { repository.updateLocation(jsonObject) }
    }

    private fun requestPermission() {
        permissionToRequest.add(Manifest.permission.ACCESS_FINE_LOCATION)
        permissionToRequest.add(Manifest.permission.ACCESS_COARSE_LOCATION)
        permissionToRequest.add(Manifest.permission.READ_EXTERNAL_STORAGE)
        ActivityCompat.requestPermissions(this, permissionToRequest.toTypedArray(), 0)

    }

    private fun enableLocation() {
        val builder = LocationSettingsRequest.Builder().addLocationRequest(locationRequest)
        builder.setAlwaysShow(true)
        val result = LocationServices.getSettingsClient(applicationContext)
            .checkLocationSettings(builder.build())

        result.addOnCompleteListener { task ->
            try {
                task.getResult(ApiException::class.java)
            } catch (e: ApiException) {
                when (e.statusCode) {
                    LocationSettingsStatusCodes.RESOLUTION_REQUIRED -> {
                        try {
                            val intentSenderRequest =
                                IntentSenderRequest.Builder(e.status.resolution!!).build()
                            resolutionForResult.launch(intentSenderRequest)

                        } catch (ex: IntentSender.SendIntentException) {
                            ex.printStackTrace()
                        }
                    }
                    LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE -> {
                    }
                }
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<out String>, grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (!isPermissionsGiven(applicationContext)) {
            EasyPermissions.onRequestPermissionsResult(
                requestCode,
                permissions,
                grantResults,
                this
            )
        } else {
            checkLocationEnabled()
        }
    }

    override fun onPermissionsGranted(requestCode: Int, perms: MutableList<String>) {
        checkLanguage()
    }

    override fun onPermissionsDenied(requestCode: Int, perms: MutableList<String>) {
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            AppSettingsDialog.Builder(this).build().show()
        } else {
            checkLocationEnabled()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (resultCode) {

            Activity.RESULT_OK -> {
                if (REQUEST_CODE_LOCATION == requestCode) {
                    session.isLocationEnabled = true
                    checkLocationEnabled()
                    checkLanguage()
                }
            }

            Activity.RESULT_CANCELED -> {
                if (REQUEST_CODE_LOCATION == requestCode) {
                    session.isLocationEnabled = false
                    checkLocationEnabled()
                    checkLanguage()
                }
            }
        }
    }


    override fun onResume() {

        if (session.locationDialogSeen) {
            checkLocationEnabled()
        }

        hideKeyboard(this@MainActivity)
        super.onResume()
    }

}