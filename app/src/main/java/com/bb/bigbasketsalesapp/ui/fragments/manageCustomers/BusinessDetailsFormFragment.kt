package com.bb.bigbasketsalesapp.ui.fragments.manageCustomers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.navigation.fragment.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentBusinessDetailsFormBinding
import com.bb.bigbasketsalesapp.ui.fragments.commonModel.EnquiryStatusViewData
import com.bb.bigbasketsalesapp.ui.fragments.commonModel.EnquiryTypeViewData
import com.bb.bigbasketsalesapp.ui.fragments.commonModel.IndustryViewData
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.CustomerData
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.EnquiryData
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.NotificationListAdapter
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.AppLoader
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.basicForm
import com.bb.bigbasketsalesapp.utils.showToast
import com.doctorsplaza.app.utils.Resource
import com.google.gson.Gson
import com.google.gson.JsonObject
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
class BusinessDetailsFormFragment(val data: CustomerData) :
    Fragment(R.layout.fragment_business_details_form), View.OnClickListener {

    private var selectedRestaurantId: String? = ""
    private var selectedEnquiryType: String? = ""
    private var selectedEnquiryStatus: String? = ""
    private lateinit var binding: FragmentBusinessDetailsFormBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    @Inject
    lateinit var notificationListAdapter: NotificationListAdapter

    private lateinit var appLoader: AppLoader

    private val mainViewModel: MainViewModel by viewModels()

    private lateinit var customerData: CustomerData

    private lateinit var enquiryData: EnquiryData
    var jsonObject: JsonObject = JsonObject()

    private var customerUpdated = false
    private var enquiryUpdated = false

    private var formSubmitted = MutableLiveData<Boolean>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView =
                inflater.inflate(R.layout.fragment_business_details_form, container, false)
            binding = FragmentBusinessDetailsFormBinding.bind(currentView!!)
            init()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        appLoader = AppLoader(requireContext())
        val gson = Gson()
        jsonObject = gson.fromJson(session.businessFormData, JsonObject::class.java)

        customerData = data
        if (customerData.Customer_Id != 0) {
            setFormData()
            mainViewModel.getEnquiryDetails(customerData.Customer_Id.toString())
//            mainViewModel.getEnquiryDetails(data.Customer_Id.toString())
        }
        mainViewModel.getIndustryListDropDown()
//        mainViewModel.getEnquiryTypeListDropDown()
//        mainViewModel.getEnquiryStatusListDropDown()

    }

    private fun setFormData() {

        with(binding) {
            selectedRestaurantId = customerData.IndustryID.toString()

            mainNeeds.setText(customerData.MainNeeds.toString())
            howToJoinYou.setText(customerData.HowToJoin)
            howToServerYourself.setText(customerData.HowToServeUrself)
            turnover.setText(customerData.TurnOver.toString())
            typology.setText(customerData.Typology)
            numberOfSeats.setText(customerData.NoOfSeats.toString())
            howIsStoreFront.setText(customerData.HowIsStoreFront)
            storeInterior.setText(customerData.StoreInterior)
            ambience.setText(customerData.Ambience)
            competitorsDomain.setText(customerData.Competitors)
            need.setText(customerData.Need)
            qty.setText(customerData.Quantity.toString())

        }
    }


    private fun setObserver() {
        mainViewModel.enquiryDetails.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.Output == "Success") {
                        with(binding) {
                            enquiryData = response.data.Data
                            //Other Details
                            businessValue.setText(enquiryData.ProjBusinessValue.toString())
                            expectedBusinessPerMonth.setText(enquiryData.ExpectedBusinessPerMonth)
                            remarkEdt.setText(enquiryData.Remarks)

//                            enquiryType.setText(response.data.Data.EnquiryType)
//                            enquiryStatus.setText(response.data.Data.EnquiryStatus)
                        }
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


        mainViewModel.getIndustryListDropDown.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    setRestaurantSpinner(response.data?.IndustryViewModel!!)
                }
                is Resource.Loading -> {
                    appLoader.show()
                }
                is Resource.Error -> {
                    appLoader.dismiss()
                }
            }
        }


        mainViewModel.getEnquiryTypeListDropDown.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    setEnquiryTypeSpinner(response.data?.EnquiryTypeViewModel!!)
                }
                is Resource.Loading -> {
                    appLoader.show()
                }
                is Resource.Error -> {
                    appLoader.dismiss()
                }
            }
        }


        mainViewModel.getEnquiryStatusListDropDown.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    setEnquiryStatusSpinner(response.data?.EnquiryStatusViewModel!!)
                }
                is Resource.Loading -> {
                    appLoader.show()
                }
                is Resource.Error -> {
                    appLoader.dismiss()
                }
            }
        }

        mainViewModel.updateCustomer.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    showToast(response.data?.Output.toString())
                    if (response.data?.Output == "Success") {
                        findNavController().navigate(R.id.action_editCustomerFragment_to_customersListFragment)
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

        mainViewModel.updateEnquiry.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.Output == "Success") {
                        enquiryUpdated = true
                        formSubmitted.postValue(customerUpdated && enquiryUpdated)
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

        formSubmitted.observe(viewLifecycleOwner) {
            if (it) {
                findNavController().navigate(R.id.action_editCustomerFragment_to_customersListFragment)
            }
        }
    }


    private fun setRestaurantSpinner(data: List<IndustryViewData>) {
        val adapter = ArrayAdapter(requireContext(), R.layout.spinner_text, data)
        adapter.setDropDownViewResource(R.layout.spinner_text)
        binding.restaurantSpinner.adapter = adapter

        data.forEachIndexed { index, it ->
            if (selectedRestaurantId == it.IndustryID.toString()) {
                binding.restaurantSpinner.setSelection(index)
            }
        }

        binding.restaurantSpinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) {}
                override fun onItemSelected(
                    p0: AdapterView<*>?,
                    p1: View?,
                    position: Int,
                    p3: Long
                ) {
                    val restaurantData = binding.restaurantSpinner.selectedItem as IndustryViewData
                    selectedRestaurantId = restaurantData.IndustryID.toString()
                }
            }
    }

    private fun setEnquiryTypeSpinner(data: List<EnquiryTypeViewData>) {
        val adapter = ArrayAdapter(requireContext(), R.layout.spinner_text, data)
        adapter.setDropDownViewResource(R.layout.spinner_text)
        binding.enquiryTypeSpinner.adapter = adapter
        binding.enquiryTypeSpinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) {}
                override fun onItemSelected(
                    p0: AdapterView<*>?,
                    p1: View?,
                    position: Int,
                    p3: Long
                ) {
                    val enquiryTypeViewData =
                        binding.enquiryTypeSpinner.selectedItem as EnquiryTypeViewData
                    selectedEnquiryType = enquiryTypeViewData.EnquiryTypeID.toString()
                }
            }
    }

    private fun setEnquiryStatusSpinner(data: List<EnquiryStatusViewData>) {
        val adapter = ArrayAdapter(requireContext(), R.layout.spinner_text, data)
        adapter.setDropDownViewResource(R.layout.spinner_text)
        binding.enquiryStatusSpinner.adapter = adapter
        binding.enquiryStatusSpinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) {}
                override fun onItemSelected(
                    p0: AdapterView<*>?,
                    p1: View?,
                    position: Int,
                    p3: Long
                ) {
                    val enquiryStatusViewData =
                        binding.enquiryStatusSpinner.selectedItem as EnquiryStatusViewData
                    selectedEnquiryStatus = enquiryStatusViewData.EnquiryStatusID.toString()
                }
            }
    }

    private fun setOnClickListener() {
        with(binding) {
            previous.setOnClickListener(this@BusinessDetailsFormFragment)
            submit.setOnClickListener(this@BusinessDetailsFormFragment)
        }
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.previous -> {
                basicForm.postValue(2)
            }

            R.id.submit -> {
                validateFormAndUpdateData()
            }
        }
    }

    private fun validateFormAndUpdateData() {

        val howToJoinYou = binding.howToJoinYou.text.toString()
        val howToServerYourself = binding.howToServerYourself.text.toString()
        val turnover = binding.turnover.text.toString()
        val typology = binding.typology.text.toString()
        val numberOfSeats = binding.numberOfSeats.text.toString()
        val howIsStoreFront = binding.howIsStoreFront.text.toString()
        val storeInterior = binding.storeInterior.text.toString()
        val ambience = binding.ambience.text.toString()
        val competitorsDomain = binding.competitorsDomain.text.toString()
        val need = binding.need.text.toString()
        val qty = binding.qty.text.toString()



        jsonObject.addProperty("Customer_Type_Id", data.Customer_Type_Id)
        jsonObject.addProperty("CustomerCode", data.CustomerCode)
        jsonObject.addProperty("IsNDPApplicable", data.IsNDPApplicable)
        jsonObject.addProperty("AuthorityApproval", data.AuthorityApproval)
        jsonObject.addProperty("ActiveFlag", data.ActiveFlag.toString())
        jsonObject.addProperty("BranchId", data.BranchId)
        jsonObject.addProperty("UserId", session.userId)
        jsonObject.addProperty("OrganisationId", session.organisationId)
        jsonObject.addProperty("IndustryID", selectedRestaurantId)
        jsonObject.addProperty("SourceID", data.SourceID)
        jsonObject.addProperty("HowToJoin", howToJoinYou)
        jsonObject.addProperty("HowToServeUrself", howToServerYourself)
        jsonObject.addProperty("Typology", typology)
        jsonObject.addProperty("HowIsStoreFront", howIsStoreFront)
        jsonObject.addProperty("StoreInterior", storeInterior)
        jsonObject.addProperty("Ambience", ambience)
        jsonObject.addProperty("MainNeeds", need)
        jsonObject.addProperty("Competitors", competitorsDomain)
        jsonObject.addProperty("NoOfSeats", numberOfSeats)
        jsonObject.addProperty("TurnOver", turnover)
        jsonObject.addProperty("Need", need)
        jsonObject.addProperty("Quantity", qty)
        jsonObject.addProperty("Latitude", session.latitude)
        jsonObject.addProperty("Longitude", session.longitude)



        mainViewModel.updateCustomerDetails(jsonObject)

        /*val businessValue = binding.businessValue.text.toString()
        val expectedBusinessPerMonth = binding.expectedBusinessPerMonth.text.toString()
        val remarkEdt = binding.remarkEdt.text.toString()

        val otherEnquiryJson = JsonObject()
        if (this::enquiryData.isInitialized) {
            otherEnquiryJson.addProperty("enquiryno", enquiryData.EnquiryNo)
            otherEnquiryJson.addProperty("enquirytypeid", selectedEnquiryType)
            otherEnquiryJson.addProperty("enquirystatusid", selectedEnquiryStatus)
            otherEnquiryJson.addProperty("customerid", customerData.Customer_Id)
            otherEnquiryJson.addProperty("dbaname", enquiryData.DBAName)
            otherEnquiryJson.addProperty("dbaemail", enquiryData.DBAEmail)
            otherEnquiryJson.addProperty("DBAMobileNo", enquiryData.DBAMobileNo)
            otherEnquiryJson.addProperty("IndustryID", enquiryData.IndustryID)
            otherEnquiryJson.addProperty("WebsiteName", enquiryData.WebsiteName)
            otherEnquiryJson.addProperty("CountryID", enquiryData.CountryID)
            otherEnquiryJson.addProperty("StateID", enquiryData.StateID)
            otherEnquiryJson.addProperty("DitstrictID", enquiryData.DitstrictID)
            otherEnquiryJson.addProperty("City", enquiryData.City)
            otherEnquiryJson.addProperty("StreetName", enquiryData.StreetName)
            otherEnquiryJson.addProperty("SourceID", enquiryData.SourceID)

            *//*   if (enquiryData.ZipCode != null) {
                otherEnquiryJson.addProperty("ZipCode", enquiryData.ZipCode.toString())
            }

            otherEnquiryJson.addProperty("ProjBusinessValue", businessValue)
            otherEnquiryJson.addProperty("AssignTo", enquiryData.AssignTo)
            otherEnquiryJson.addProperty("CreatedBy", session.userId)
            otherEnquiryJson.addProperty("CreatedDate", enquiryData.CreatedDate)
            otherEnquiryJson.addProperty("OrganisationID", session.organisationId)
            otherEnquiryJson.addProperty("DivisionID", session.divisionId)
            otherEnquiryJson.addProperty("BranchID", session.branchId)
            otherEnquiryJson.addProperty("EnquiryDetails", remarkEdt)
            otherEnquiryJson.addProperty("BestTimeToContact", enquiryData.BestTimeToContact)
            val dateParse = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
            val parseDate = dateParse.parse(enquiryData.FollowupDate)
            val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            val formattedDate = dateFormat.format(parseDate)
            otherEnquiryJson.addProperty("FollowupDate", formattedDate)
            otherEnquiryJson.addProperty("expectedBusinessPerMonth", expectedBusinessPerMonth)
        } else {
            otherEnquiryJson.addProperty("enquiryno", "0")
            otherEnquiryJson.addProperty("enquirytypeid", selectedEnquiryType)
            otherEnquiryJson.addProperty("enquirystatusid", selectedEnquiryStatus)
            otherEnquiryJson.addProperty("customerid", customerData.Customer_Id)
            otherEnquiryJson.addProperty("ProjBusinessValue", businessValue)
            otherEnquiryJson.addProperty("CreatedBy", session.userId)
            otherEnquiryJson.addProperty("OrganisationID", session.organisationId)
            otherEnquiryJson.addProperty("DivisionID", session.divisionId)
            otherEnquiryJson.addProperty("BranchID", session.branchId)
            otherEnquiryJson.addProperty("EnquiryDetails", remarkEdt)

            val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            val formattedDate = dateFormat.format(Date())

            otherEnquiryJson.addProperty("FollowupDate", formattedDate)
            otherEnquiryJson.addProperty("expectedBusinessPerMonth", expectedBusinessPerMonth)
        }*//*



            mainViewModel.updateEnquiryDetails(otherEnquiryJson)
        }*/
    }
}