package com.bb.bigbasketsalesapp.ui.fragments.manageCustomers

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.data.BBSalesRepository
import com.bb.bigbasketsalesapp.databinding.FragmentAddCustomerBinding
import com.bb.bigbasketsalesapp.locationPicker.AddressData
import com.bb.bigbasketsalesapp.locationPicker.PlacePickerActivity
import com.bb.bigbasketsalesapp.ui.MainActivity
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.NotificationListAdapter
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.*
import com.doctorsplaza.app.utils.Resource
import com.github.dhaval2404.imagepicker.ImagePicker
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.model.LatLng
import com.google.gson.JsonObject
import com.sucho.placepicker.Constants
import com.sucho.placepicker.MapType
import com.sucho.placepicker.PlacePicker
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class AddCustomerFragment : Fragment(R.layout.fragment_add_customer), View.OnClickListener {

    private lateinit var addressData: AddressData
    private lateinit var binding: FragmentAddCustomerBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    @Inject
    lateinit var notificationListAdapter: NotificationListAdapter

    private val mainViewModel: MainViewModel by viewModels()
    val repository = BBSalesRepository()
    private lateinit var appLoader: AppLoader
    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.mmm", Locale.getDefault())

    private var UPLOAD_STORE_BOARD_REQUEST_CODE = 51
    private var UPLOAD_CR_REQUEST_CODE = 52
    private var UPLOAD_VAT_REQUEST_CODE = 53
    private var UPLOAD_MENU_REQUEST_CODE = 54

    private var uploadedStoreBoardFile = ""
    private var uploadedCRFile = ""
    private var uploadedVATFile = ""
    private var uploadedMenuFile = ""

    private var street = ""
    private var city = ""
    private var district = ""
    private var state = ""
    private var pincode = ""
    private var country = ""
    private var countryCode = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        activity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_add_customer, container, false)
            binding = FragmentAddCustomerBinding.bind(currentView!!)
            init()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        appLoader = AppLoader(requireContext())
    }


    private fun setObserver() {

        addressFormData.observe(requireActivity()) {
            street = it.street
            city = it.city
            district = it.district
            state = it.state
            pincode = it.pincode
        }

        mainViewModel.saveCustomerDetails.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.Output == "Success") {
                        session.customerAdded = true
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            updateCurrentLocation()
                        }

                        if (arguments?.getString("from").toString() == "Home") {
                            findNavController().navigate(R.id.action_addCustomerFragment_to_customersListFragment2)
                        } else {

                            findNavController().navigate(R.id.action_addCustomerFragment_to_customersListFragment)
                        }
                    } else {
                        showToast(response.data?.Output.toString())
                    }
                }
                is Resource.Loading -> {
                    appLoader.show()
                }
                is Resource.Error -> {
                    appLoader.dismiss()
                }
            }
        }

    }

    @SuppressLint("MissingPermission")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun updateCurrentLocation() {
        val client = LocationServices.getFusedLocationProviderClient(requireActivity())
        val locationManager: LocationManager =
            requireActivity().getSystemService(Context.LOCATION_SERVICE) as LocationManager
        if (locationManager.isProviderEnabled(
                LocationManager.GPS_PROVIDER
            )
            || locationManager.isProviderEnabled(
                LocationManager.NETWORK_PROVIDER
            )
        ) {
            // When location service is enabled
            // Get last location
            client.lastLocation.addOnCompleteListener {
                val location = it.result

                updateLocation(location)
            }
        }
    }

    @OptIn(DelicateCoroutinesApi::class)
    private fun updateLocation(location: Location) {
        /*val currentTime = Date()
        val accessTime = simpleDateFormat.format(currentTime)
        val languageIdentification = FirebaseNaturalLanguage.getInstance().languageIdentification
        val lang = languageIdentification.identifyPossibleLanguages(accessTime)
        lang.addOnSuccessListener {
            val languageIdentified: String = it[0].languageCode
            if (languageIdentified != "en") {
                val options = FirebaseTranslatorOptions.Builder()
                    .setSourceLanguage(FirebaseTranslateLanguage.AR)
                    .setTargetLanguage(FirebaseTranslateLanguage.EN)
                    .build()
                val englishGermanTranslator =
                    FirebaseNaturalLanguage.getInstance().getTranslator(options)
                val languageTranslated = englishGermanTranslator.translate(accessTime)
                languageTranslated.addOnSuccessListener { lang ->

                    val translatedTime = lang
                    val jsonObject = JsonObject().apply {
                        addProperty("UserLocationsID", "0")
                        addProperty("OrganisationID", session.organisationId)
                        addProperty("SalesmanID", session.userId)
                        addProperty("Latitude", session.latitude)
                        addProperty("Longitude", session.longitude)
                        addProperty("AccessTime", translatedTime)
                    }

                    GlobalScope.launch {
                        repository.updateLocation(jsonObject)
                    }

                }
            } else {
                val jsonObject = JsonObject().apply {
                    addProperty("UserLocationsID", "0")
                    addProperty("OrganisationID", session.organisationId)
                    addProperty("SalesmanID", session.userId)
                    addProperty("Latitude", session.latitude)
                    addProperty("Longitude", session.longitude)
                    addProperty("AccessTime", accessTime)
                }

                GlobalScope.launch {
                    repository.updateLocation(jsonObject)
                }

            }
        }*/

    }

    private fun setOnClickListener() {
        with(binding) {
            backArrow.setOnClickListener(this@AddCustomerFragment)
            submitBtn.setOnClickListener(this@AddCustomerFragment)
            addLocation.setOnClickListener(this@AddCustomerFragment)
            uploadStoreBoard.setOnClickListener(this@AddCustomerFragment)
            uploadCr.setOnClickListener(this@AddCustomerFragment)
            uploadVat.setOnClickListener(this@AddCustomerFragment)
            uploadMenu.setOnClickListener(this@AddCustomerFragment)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.backArrow -> {
                findNavController().popBackStack()
            }
            R.id.submitBtn -> {
                validateAndSaveCustomer()
            }
            R.id.uploadStoreBoard -> {

                pickAndUploadImage(UPLOAD_STORE_BOARD_REQUEST_CODE)
            }

            R.id.uploadCr -> {
                pickAndUploadImage(UPLOAD_CR_REQUEST_CODE)
            }
            R.id.uploadVat -> {
                pickAndUploadImage(UPLOAD_VAT_REQUEST_CODE)
            }
            R.id.uploadMenu -> {
                pickAndUploadImage(UPLOAD_MENU_REQUEST_CODE)
            }


            R.id.addLocation -> {
                Intent(requireActivity(), PlacePickerActivity::class.java)
                val intent = PlacePicker.IntentBuilder()
                    .setLatLong(session.latitude.toDouble(), session.longitude.toDouble())
//                    .setLatLong(25.2281188,55.1760848)
                    .showLatLong(true)
                    .setMapType(MapType.NORMAL)

                    .build(requireActivity())
                launchLocationActivity.launch(intent)
            }
        }
    }

    private fun validateAndSaveCustomer() {

        if (!isPermissionsGiven(requireContext().applicationContext)) {
            (activity as MainActivity).checkLocationEnabled()
            return
        }

        val organisationName = binding.organisationName.text.toString()
        val customerName = binding.customerName.text.toString()
        val crNumber = binding.crNumber.text.toString()
        val vatNumber = binding.vatNumber.text.toString()

        if (organisationName.isEmpty()) {
            showToast("please enter Organisation Name")
        } else if (customerName.isEmpty()) {
            showToast("please enter Customer Name")
        } else if (crNumber.isEmpty()) {
            showToast("please enter Cr Number")
        } else if (vatNumber.isEmpty()) {
            showToast("please enter Vat Number")
        } else if (street.isEmpty() || city.isEmpty() || country.isEmpty() || pincode.isEmpty()) {
            showToast("please Select Location")
        } else {

            val jsonObject = JsonObject()
            jsonObject.addProperty("Customer_Id", "0")
            jsonObject.addProperty("CustomerName", organisationName)
            jsonObject.addProperty("emailid", "")
            jsonObject.addProperty("CustomerStatus", "")
            jsonObject.addProperty("GSTNomber", "")
            jsonObject.addProperty("CustomerPOCName", customerName)
            jsonObject.addProperty("DivisionId", session.divisionId)
            jsonObject.addProperty("Street", street)
            jsonObject.addProperty("City", city)
            jsonObject.addProperty("Country", country)
            jsonObject.addProperty("State", state)
            jsonObject.addProperty("PinCode", pincode)
            jsonObject.addProperty("DistrictName", district)
            jsonObject.addProperty("Customer_Type_Id", "")
            jsonObject.addProperty("CustomerCode", "")
            jsonObject.addProperty("IsNDPApplicable", "")
            jsonObject.addProperty("AuthorityApproval", "")
            jsonObject.addProperty("ActiveFlag", "")
            jsonObject.addProperty("BranchId", session.branchId)
            jsonObject.addProperty("UserId", session.userId)
            jsonObject.addProperty("OrganisationId", session.organisationId)
            jsonObject.addProperty("IndustryID", "")
            jsonObject.addProperty("SourceID", "")
            jsonObject.addProperty("HowToJoin", "")
            jsonObject.addProperty("HowToServeUrself", "")
            jsonObject.addProperty("Typology", "")
            jsonObject.addProperty("HowIsStoreFront", "")
            jsonObject.addProperty("StoreInterior", "")
            jsonObject.addProperty("Ambience", "")
            jsonObject.addProperty("MainNeeds", "")
            jsonObject.addProperty("Competitors", "")
            jsonObject.addProperty("BusinessType", "")
            jsonObject.addProperty("NoOfSeats", "")
            jsonObject.addProperty("TurnOver", "")
            jsonObject.addProperty("StoreFile", uploadedStoreBoardFile)
            jsonObject.addProperty("CRFile", uploadedCRFile)
            jsonObject.addProperty("VATFile", uploadedVATFile)
            jsonObject.addProperty("MenuFile", uploadedMenuFile)
            jsonObject.addProperty("crno", crNumber)
            jsonObject.addProperty("vatno", vatNumber)
            jsonObject.addProperty("mobileno1", "")
            jsonObject.addProperty("mobileno2", "")
            jsonObject.addProperty("landline", "")
            jsonObject.addProperty("Need", "")
            jsonObject.addProperty("Quantity", "")
            if (this::addressData.isInitialized) {
                jsonObject.addProperty("Latitude", addressData.latitude)
                jsonObject.addProperty("Longitude", addressData.longitude)
            }

            mainViewModel.saveCustomerDetails(jsonObject)
        }
    }

    private fun pickAndUploadImage(pickerCode: Int) {
        ImagePicker.with(this)
            .crop(16f, 9f)
            .compress(512)
            .maxResultSize(720, 720)
            .start(pickerCode)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (resultCode) {
            Activity.RESULT_OK -> {
                when (requestCode) {
                    UPLOAD_STORE_BOARD_REQUEST_CODE -> {
                        val uri: Uri = data?.data!!

                        uploadedStoreBoardFile = encodeImage(requireActivity(), uri).toString()
                        binding.uploadStoreBoard.setCompoundDrawablesWithIntrinsicBounds(
                            R.drawable.ic_check_icon,
                            0,
                            0,
                            0
                        );
                        binding.uploadStoreBoard.text = "Store Board Uploaded"
                    }

                    UPLOAD_CR_REQUEST_CODE -> {
                        val uri: Uri = data?.data!!

                        uploadedCRFile = encodeImage(requireActivity(), uri).toString()
                        binding.uploadCr.setCompoundDrawablesWithIntrinsicBounds(
                            R.drawable.ic_check_icon,
                            0,
                            0,
                            0
                        );
                        binding.uploadCr.text = "CR Uploaded"
                    }

                    UPLOAD_VAT_REQUEST_CODE -> {
                        val uri: Uri = data?.data!!

                        uploadedVATFile = encodeImage(requireActivity(), uri).toString()
                        binding.uploadVat.setCompoundDrawablesWithIntrinsicBounds(
                            R.drawable.ic_check_icon,
                            0,
                            0,
                            0
                        );
                        binding.uploadVat.text = "VAT Uploaded"
                    }

                    UPLOAD_MENU_REQUEST_CODE -> {
                        val uri: Uri = data?.data!!

                        uploadedMenuFile = encodeImage(requireActivity(), uri).toString()
                        binding.uploadMenu.setCompoundDrawablesWithIntrinsicBounds(
                            R.drawable.ic_check_icon,
                            0,
                            0,
                            0
                        );
                        binding.uploadMenu.text = "Menu Uploaded"
                    }

                }
            }

            ImagePicker.RESULT_ERROR -> {
                showToast(ImagePicker.getError(data))
            }
            else -> {
                showToast("Task Cancelled")
            }
        }
    }


    private val launchLocationActivity = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent = result.data!!
                addressData = data.getParcelableExtra(Constants.ADDRESS_INTENT)!!
                binding.addLocation.text = addressData.addressList?.get(0)!!.getAddressLine(0)
                val bundle = Bundle().apply {
                    putString("street", addressData.addressList?.get(0)?.featureName)
                    putString("city", addressData.addressList?.get(0)?.locality)
                    putString("district", addressData.addressList?.get(0)?.subAdminArea)
                    putString("state", addressData.addressList?.get(0)?.adminArea)
                    putString("pincode", addressData.addressList?.get(0)?.postalCode)
                }

                val coordinates = LatLng(
                    addressData.latitude,
                    addressData.longitude
                ) // Get the coordinates from your place
                val geocoder = Geocoder(requireContext(), Locale.getDefault())
                val addresses = geocoder.getFromLocation(
                    coordinates.latitude,
                    coordinates.longitude,
                    1
                ) // Only retrieve 1 address
                val address = addresses[0]
                country = address.countryName
                countryCode = address.countryCode

                findNavController().navigate(R.id.addressFragment, bundle)

            }
        }

    override fun onResume() {
        super.onResume()
        setObserver()
    }
}
