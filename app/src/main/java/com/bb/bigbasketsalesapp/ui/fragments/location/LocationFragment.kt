package com.bb.bigbasketsalesapp.ui.fragments.location

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentLocationBinding
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.NotificationListAdapter
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.bitmapFromVector
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import javax.inject.Inject


class LocationFragment : Fragment(R.layout.fragment_location), View.OnClickListener {


    private lateinit var mapFragment: SupportMapFragment
    private lateinit var mMap: GoogleMap

    private lateinit var binding: FragmentLocationBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    @Inject
    lateinit var notificationListAdapter: NotificationListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_location, container, false)
            binding = FragmentLocationBinding.bind(currentView!!)
            init()
            setMap()
            setObserver()
            setRecyclerView()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
    }


    private fun setObserver() {
    }

    private fun setRecyclerView() {

    }

    @SuppressLint("MissingPermission")
    private fun setMap() {
        mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync { googleMap ->
            mMap = googleMap
            val lat = 21.1686663
            val long = 72.8633633
            val latLong = LatLng(lat, long)
            val cameraPosition = CameraPosition.Builder().target(latLong).zoom(13f).build()
            mMap.addMarker(MarkerOptions().position(latLong))?.setIcon(bitmapFromVector(requireContext(), R.drawable.location_marker))
            mMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))
        }
    }
    private fun setOnClickListener() {
        with(binding) {
            backArrow.setOnClickListener(this@LocationFragment)
            confirmLocation.setOnClickListener(this@LocationFragment)
        }
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.backArrow -> {
                findNavController().popBackStack()
            }

            R.id.confirmLocation -> {
                findNavController().navigate(R.id.addressFragment)
            }

        }
    }
}