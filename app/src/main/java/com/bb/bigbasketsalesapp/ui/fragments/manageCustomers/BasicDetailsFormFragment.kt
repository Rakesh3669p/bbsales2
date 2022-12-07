package com.bb.bigbasketsalesapp.ui.fragments.manageCustomers

import android.app.Activity
import android.content.Intent
import android.location.Geocoder
import android.net.Uri
import android.os.Bundle
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentBasicDetailsFormBinding
import com.bb.bigbasketsalesapp.locationPicker.AddressData
import com.bb.bigbasketsalesapp.locationPicker.PlacePickerActivity
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.CustomerData
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.*
import com.bumptech.glide.Glide
import com.github.dhaval2404.imagepicker.ImagePicker
import com.google.android.gms.maps.model.LatLng
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.sucho.placepicker.Constants
import com.sucho.placepicker.MapType
import com.sucho.placepicker.PlacePicker
import dagger.hilt.android.AndroidEntryPoint
import java.io.File
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
class BasicDetailsFormFragment(val data: CustomerData) :
    Fragment(R.layout.fragment_basic_details_form),
    View.OnClickListener {

    private var countryCode: String? = ""
    private var selectedBusinessType: String = ""
    private lateinit var binding: FragmentBasicDetailsFormBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    private lateinit var appLoader: AppLoader

    private val mainViewModel: MainViewModel by viewModels()

    private lateinit var customerData: CustomerData

    private var businessType = ""

    private var UPLOAD_STORE_BOARD_REQUEST_CODE = 51
    private var UPLOAD_CR_REQUEST_CODE = 52
    private var UPLOAD_VAT_REQUEST_CODE = 53
    private var UPLOAD_MENU_REQUEST_CODE = 54

    private var uploadedStoreBoardFile = ""
    private var uploadedCRFile = ""
    private var uploadedVATFile = ""
    private var uploadedMenuFile = ""


    private var cusLatitude = 0.0
    private var cusLongitude = 0.0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_basic_details_form, container, false)
            binding = FragmentBasicDetailsFormBinding.bind(currentView!!)
            init()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        appLoader = AppLoader(requireContext())
        customerData = data
        if (customerData.Customer_Id != 0) {
            setFormData()
        }
    }

    private fun setFormData() {
        with(binding) {
            organisationName.setText(customerData.CustomerName)
            customerName.setText(customerData.CustomerPOCName)
            crNumber.setText(customerData.CRNo)
            vatNumber.setText(customerData.VATNo)
            streetName.setText(customerData.Street)
            city.setText(customerData.City)
            district.setText(customerData.DistrictName)
            state.setText(customerData.StateName)
            zipcode.setText(customerData.PINCode)
            mobile1.setText(customerData.MobileNo1)
            mobile2.setText(customerData.MobileNo2)
            officeTelephone.setText(customerData.Landline)
            email.setText(customerData.EmailID)

            cusLatitude = customerData.Latitude?.toDouble() ?: 0.0
            cusLongitude = customerData.Longitude?.toDouble() ?: 0.0

            uploadedStoreBoardFile = customerData.StoreFile.toString()
            uploadedCRFile = customerData.CRFile.toString()
            uploadedVATFile = customerData.VATFile.toString()
            uploadedMenuFile = customerData.MenuFile.toString()

            if (checkValidBase64(customerData.StoreFile.toString()) == null) {
                binding.storeBoard.isVisible = false
                binding.uploadStoreBoard.isVisible = true
            } else {
                Glide.with(requireContext())
                    .load(checkValidBase64(customerData.StoreFile.toString())).into(storeBoard)
                binding.storeBoard.isVisible = true
                binding.uploadStoreBoard.isVisible = false
            }


            if (checkValidBase64(customerData.CRFile.toString()) == null) {
                binding.crNumberImg.isVisible = false
                binding.uploadCr.isVisible = true
            } else {
                Glide.with(requireContext()).load(checkValidBase64(customerData.CRFile.toString()))
                    .into(crNumberImg)
                binding.crNumberImg.isVisible = true
                binding.uploadCr.isVisible = false
            }


            if (checkValidBase64(customerData.MenuFile.toString()) == null) {
                binding.menuImg.isVisible = false
                binding.uploadMenu.isVisible = true
            } else {
                Glide.with(requireContext())
                    .load(checkValidBase64(customerData.MenuFile.toString()))
                    .into(menuImg)
                binding.menuImg.isVisible = true
                binding.uploadMenu.isVisible = false
            }



            if (checkValidBase64(customerData.VATFile.toString()) == null) {
                binding.vatNumberImg.isVisible = false
                binding.uploadVat.isVisible = true
            } else {
                Glide.with(requireContext()).load(checkValidBase64(customerData.VATFile.toString()))
                    .into(vatNumberImg)
                binding.vatNumberImg.isVisible = true
                binding.uploadVat.isVisible = false

            }



            if (customerData.BusinessType!!.isEmpty() || customerData.BusinessType == "Individual") {
                individualRadioButton.isChecked = true
                chainRadioButton.isChecked = false
            } else if (customerData.BusinessType!!.isEmpty() || customerData.BusinessType == "Chain") {
                individualRadioButton.isChecked = false
                chainRadioButton.isChecked = true
            }
        }

        selectedBusinessType = customerData.BusinessType.toString()
        if (customerData.BusinessType.toString().lowercase() == "individual") {
            binding.individualRadioButton.isChecked = true
            binding.chainRadioButton.isChecked = false
        } else if (customerData.BusinessType.toString().lowercase() == "chain") {
            binding.individualRadioButton.isChecked = false
            binding.chainRadioButton.isChecked = true
        }
    }


    private fun checkValidBase64(imageFile: String): ByteArray? {
        return try {
            if (imageFile != "null" && imageFile.isNotEmpty()) {
                Base64.decode(imageFile, Base64.DEFAULT)
            } else {
                null
            }
        } catch (e: Exception) {
            null
        }
    }

    private fun setObserver() {
    }


    private fun setOnClickListener() {
        with(binding) {
            next.setOnClickListener(this@BasicDetailsFormFragment)
            storeBoard.setOnClickListener(this@BasicDetailsFormFragment)
            crNumberImg.setOnClickListener(this@BasicDetailsFormFragment)
            vatNumberImg.setOnClickListener(this@BasicDetailsFormFragment)
            menuImg.setOnClickListener(this@BasicDetailsFormFragment)
            uploadVat.setOnClickListener(this@BasicDetailsFormFragment)
            uploadCr.setOnClickListener(this@BasicDetailsFormFragment)
            uploadMenu.setOnClickListener(this@BasicDetailsFormFragment)
            uploadStoreBoard.setOnClickListener(this@BasicDetailsFormFragment)
            individualRadioButton.setOnClickListener(this@BasicDetailsFormFragment)
            chainRadioButton.setOnClickListener(this@BasicDetailsFormFragment)
            addLocation.setOnClickListener(this@BasicDetailsFormFragment)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.next -> {
                validateAndSubmitBasicForm()
            }

            R.id.individualRadioButton -> {
                binding.individualRadioButton.isChecked = true
                binding.chainRadioButton.isChecked = false
                selectedBusinessType = "Individual"
            }

            R.id.chainRadioButton -> {
                binding.individualRadioButton.isChecked = false
                binding.chainRadioButton.isChecked = true
                selectedBusinessType = "Chain"
            }


            R.id.crNumberImg -> {
                pickAndUploadImage(UPLOAD_CR_REQUEST_CODE)
            }

            R.id.vatNumberImg -> {
                pickAndUploadImage(UPLOAD_VAT_REQUEST_CODE)
            }

            R.id.storeBoard -> {
                pickAndUploadImage(UPLOAD_STORE_BOARD_REQUEST_CODE)
            }

            R.id.menuImg -> {
                pickAndUploadImage(UPLOAD_MENU_REQUEST_CODE)
            }

            R.id.uploadCr -> {
                pickAndUploadImage(UPLOAD_CR_REQUEST_CODE)
            }

            R.id.uploadVat -> {
                pickAndUploadImage(UPLOAD_VAT_REQUEST_CODE)
            }

            R.id.uploadStoreBoard -> {
                pickAndUploadImage(UPLOAD_STORE_BOARD_REQUEST_CODE)
            }

            R.id.uploadMenu -> {
                pickAndUploadImage(UPLOAD_MENU_REQUEST_CODE)
            }

            R.id.addLocation -> {

                if (cusLatitude == 0.0 || cusLongitude == 0.0) {
                    cusLatitude = session.latitude.toDouble()
                    cusLongitude = session.longitude.toDouble()
                }

                Intent(requireActivity(), PlacePickerActivity::class.java)
                val intent = PlacePicker.IntentBuilder()
                    .setLatLong(cusLatitude, cusLongitude)
                    .showLatLong(true)
                    .setMapType(MapType.NORMAL)
                    .build(requireActivity())
                launchLocationActivity.launch(intent)
            }
        }
    }


    private fun validateAndSubmitBasicForm() {
        val organisationName = binding.organisationName.text.toString()
        val customerName = binding.customerName.text.toString()
        val crNumber = binding.crNumber.text.toString()
        val vatNumber = binding.vatNumber.text.toString()
        val streetName = binding.streetName.text.toString()
        val city = binding.city.text.toString()
        val district = binding.district.text.toString()
        val state = binding.state.text.toString()
        val zipcode = binding.zipcode.text.toString()
        val mobile1 = binding.mobile1.text.toString()
        val mobile2 = binding.mobile2.text.toString()
        val officeTelephone = binding.officeTelephone.text.toString()
        val email = binding.email.text.toString()


        when {
            organisationName.isEmpty() -> {
                requireContext().showToast("please enter organisation name")
            }

            crNumber.isEmpty() -> {
                requireContext().showToast("please enter cr number")
            }
            vatNumber.isEmpty() -> {
                requireContext().showToast("please enter vat number")
            }
            streetName.isEmpty() -> {
                requireContext().showToast("please enter street name")
            }
            city.isEmpty() -> {
                requireContext().showToast("please enter city")
            }
            district.isEmpty() -> {
                requireContext().showToast("please enter district")
            }
            state.isEmpty() -> {
                requireContext().showToast("please enter state")
            }
            zipcode.isEmpty() -> {
                requireContext().showToast("please enter zipcode")
            }
            email.isNotEmpty() && !email.isValidEmail() -> {
                requireContext().showToast("please enter a valid email address")

            }

            else -> {
                val jsonObject = JsonObject()
                jsonObject.addProperty("Customer_Id", data.Customer_Id)
                jsonObject.addProperty("CustomerName", organisationName)
                jsonObject.addProperty("CustomerPOCName", customerName)
                jsonObject.addProperty("crno", crNumber)
                jsonObject.addProperty("vatno", vatNumber)
                jsonObject.addProperty("mobileno1", mobile1)
                jsonObject.addProperty("mobileno2", mobile2)
                jsonObject.addProperty("landline", officeTelephone)
                jsonObject.addProperty("emailid", email)
                jsonObject.addProperty("CustomerStatus", data.CustomerStatus)
                jsonObject.addProperty("GSTNomber", data.GSTNomber)
                jsonObject.addProperty("DivisionId", session.divisionId)
                jsonObject.addProperty("Street", streetName)
                jsonObject.addProperty("City", city)
                jsonObject.addProperty("Country", data.Country)
                jsonObject.addProperty("State", state)
                jsonObject.addProperty("StoreFile", uploadedStoreBoardFile)
                jsonObject.addProperty("VATFile", uploadedVATFile)
                jsonObject.addProperty("CRFile", uploadedCRFile)
                jsonObject.addProperty("MenuFile", uploadedMenuFile)
                jsonObject.addProperty("BusinessType", selectedBusinessType)
                jsonObject.addProperty("PinCode", zipcode)
                jsonObject.addProperty("DistrictName", district)

                val gson = Gson()
                session.businessFormData = gson.toJson(jsonObject)
                basicForm.postValue(1)
            }


        }

    }

    private fun pickAndUploadImage(pickerCode: Int) {
        ImagePicker.with(this)
            .crop(16f, 9f)
            .compress(512)
            .maxResultSize(720, 720)
            .start(pickerCode)
    }


    private val launchLocationActivity =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent = result.data!!
                val addressData = data.getParcelableExtra<AddressData>(Constants.ADDRESS_INTENT)
                binding.addLocation.text = addressData!!.addressList?.get(0)!!.getAddressLine(0)

                binding.streetName.setText(addressData.addressList?.get(0)?.featureName)
                binding.city.setText(addressData.addressList?.get(0)?.locality)
                binding.district.setText(addressData.addressList?.get(0)?.subAdminArea)
                binding.state.setText(addressData.addressList?.get(0)?.adminArea)
                binding.zipcode.setText(addressData.addressList?.get(0)?.postalCode)

                val coordinates = LatLng(addressData.latitude, addressData.longitude)
                val geocoder = Geocoder(requireContext(), Locale.getDefault())
                val addresses =
                    geocoder.getFromLocation(coordinates.latitude, coordinates.longitude, 1)
                val address = addresses[0]
                countryCode = address.countryCode
            }
        }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (resultCode) {
            Activity.RESULT_OK -> {
                when (requestCode) {
                    UPLOAD_STORE_BOARD_REQUEST_CODE -> {
                        val uri: Uri = data?.data!!

                        uploadedStoreBoardFile = encodeImage(requireActivity(), uri).toString()
                        binding.storeBoard.setImageURI(uri)
                        binding.storeBoard.isVisible = true
                        binding.uploadStoreBoard.isVisible = false
                    }

                    UPLOAD_CR_REQUEST_CODE -> {
                        val uri: Uri = data?.data!!
                        uploadedCRFile = encodeImage(requireActivity(), uri).toString()
                        binding.crNumberImg.setImageURI(uri)
                        binding.crNumberImg.isVisible = true
                        binding.uploadCr.isVisible = false

                    }

                    UPLOAD_VAT_REQUEST_CODE -> {
                        val uri: Uri = data?.data!!
                        uploadedVATFile = encodeImage(requireActivity(), uri).toString()
                        binding.vatNumberImg.setImageURI(uri)
                        binding.vatNumberImg.isVisible = true
                        binding.uploadVat.isVisible = false

                    }

                    UPLOAD_MENU_REQUEST_CODE -> {
                        val uri: Uri = data?.data!!
                        uploadedMenuFile = encodeImage(requireActivity(), uri).toString()
                        binding.menuImg.setImageURI(uri)
                        binding.menuImg.isVisible = true
                        binding.uploadMenu.isVisible = false

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

}