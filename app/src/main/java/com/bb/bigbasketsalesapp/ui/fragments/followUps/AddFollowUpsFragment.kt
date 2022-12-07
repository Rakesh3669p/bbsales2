package com.bb.bigbasketsalesapp.ui.fragments.followUps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentAddFollowUpsBinding
import com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter.FollowUpAdapter
import com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter.FollowUpCouponAdapter
import com.bb.bigbasketsalesapp.ui.fragments.followUps.model.FollowStatusModelItem
import com.bb.bigbasketsalesapp.ui.fragments.followUps.model.FollowUpsDropdownModel
import com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferData
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.AppLoader
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.showToast
import com.doctorsplaza.app.utils.Resource
import com.google.gson.JsonObject
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

@AndroidEntryPoint
class AddFollowUpsFragment : Fragment(R.layout.fragment_add_follow_ups), View.OnClickListener {

    private var offerList: MutableList<OfferData> = ArrayList()
    private var selectedFollowUpStatus: Int = 0
    private var selectedMediumId: Int = 0
    private lateinit var binding: FragmentAddFollowUpsBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    @Inject
    lateinit var followUpAdapter: FollowUpAdapter

    @Inject
    lateinit var followUpCouponAdapter: FollowUpCouponAdapter

    private lateinit var appLoader: AppLoader

    private val mainViewModel: MainViewModel by viewModels()

    private var couponId: String = ""

    var currentDate = ""

    var currentTime = ""

    val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    val timeFormat = SimpleDateFormat("hh:mm a", Locale.getDefault())

    private var customerName: String = ""
    private var customerImage: String = ""
    private var customerCode: String = ""
    private var organisationId: String = ""
    private var enquiryId: String = ""
    private var customerState: String = ""
    private var customerCity: String = ""


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        activity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)

        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_add_follow_ups, container, false)
            binding = FragmentAddFollowUpsBinding.bind(currentView!!)
            init()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        appLoader = AppLoader(requireContext())
        mainViewModel.followUpDropDown(session.organisationId.toString())
        mainViewModel.offerList("")
        customerName = arguments?.getString("customerName").toString()
        customerImage = arguments?.getString("customerImage").toString()
        customerCode = arguments?.getString("customerCode").toString()
        customerState = arguments?.getString("customerState").toString()
        customerCity = arguments?.getString("customerCity").toString()
        organisationId = arguments?.getString("organisationId").toString()
        enquiryId = arguments?.getString("enquiryId").toString()
        binding.loader.isVisible = true
        currentDate = dateFormat.format(Date())
        currentTime = timeFormat.format(Date())
    }


    private fun setObserver() {
        mainViewModel.followUpDropDown.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    setFollowUpsDropDown(response.data!!)
                }
                is Resource.Loading -> {
                    appLoader.show()
                }
                is Resource.Error -> {
                    appLoader.dismiss()
                }
            }
        }

        mainViewModel.offerList.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    binding.loader.isVisible = false
                    appLoader.dismiss()
                    if (response.data?.httpcode == 200) {
                        offerList.clear()
                        offerList.addAll(response.data.data)
                        setOfferList(offerList)
                    } else {
                        showToast(response.data?.message.toString())
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

        mainViewModel.addFollowUps.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.Output == "Success") {
                        val bundle = Bundle().apply {
                            putString("customerName",customerName)
                            putString("customerImage",customerImage)
                            putString("customerCode",customerCode)
                            putString("customerState",customerState)
                            putString("customerCity",customerCity)
                            putString("organisationId",organisationId)
                            putString("enquiryId",enquiryId)
                        }
                        findNavController().navigate(R.id.action_addFollowUpsFragment_to_followUpListFragment,bundle)
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

    private fun setOfferList(data: List<OfferData>) {
        followUpCouponAdapter.differ.submitList(data)
        binding.followUpsOfferRv.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = followUpCouponAdapter
        }
    }

    private fun setFollowUpsDropDown(data: FollowUpsDropdownModel) {
        val adapter =
            ArrayAdapter(requireContext(), R.layout.spinner_text_products, data)
        adapter.setDropDownViewResource(R.layout.spinner_text)
        binding.followUpSpinner.adapter = adapter


        binding.followUpSpinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) {}
                override fun onItemSelected(
                    p0: AdapterView<*>?,
                    p1: View?,
                    position: Int,
                    p3: Long
                ) {
                    val followupMediumData =
                        binding.followUpSpinner.selectedItem as FollowStatusModelItem
                    selectedFollowUpStatus = followupMediumData.FollowUpStatusID
                }
            }
    }


    private fun setOnClickListener() {
        with(binding) {
            backArrow.setOnClickListener(this@AddFollowUpsFragment)
            submit.setOnClickListener(this@AddFollowUpsFragment)
        }

        binding.search.doOnTextChanged { text, start, before, count ->
            if (text?.length!! > 2) {
                mainViewModel.offerList(text.toString().trim())
            } else {
                if (text.isEmpty()) {
                    mainViewModel.offerList("")
                }
            }
        }

        followUpCouponAdapter.setOnApplyClickListener { it, position ->
            if (!it.isApplied) {
                it.isApplied = true
                if (couponId.isNotEmpty()) {
                    showToast("Already one coupon applied")
                } else {
                    couponId = it.coupon_id.toString()
                }

                followUpCouponAdapter.notifyItemChanged(position)
            }
        }

        followUpCouponAdapter.setOnRemoveCouponClickListener { it, position ->
            couponId = ""
            it.isApplied = false
            followUpCouponAdapter.notifyItemChanged(position)
        }
    }


    private fun addFollowUps() {
        val remarks = binding.remarkEdt.text.toString()
        val jsonObject = JsonObject()

        jsonObject.addProperty("FollowUpDate", currentDate)
        jsonObject.addProperty("FollowUpTime", currentTime.uppercase())
        jsonObject.addProperty("MediumID", 29)
        jsonObject.addProperty("AddedBy", session.userId)
        jsonObject.addProperty("CreatedOn", currentDate)
        jsonObject.addProperty("CreatedBy", session.userId)
        jsonObject.addProperty("OrganisationID", session.organisationId)
        jsonObject.addProperty("EnquiryID", enquiryId)
        jsonObject.addProperty("FollowUpStatusID", selectedFollowUpStatus)
        jsonObject.addProperty("LanguageID", 71)
        jsonObject.addProperty("CouponID", couponId)
        jsonObject.addProperty("Remarks", remarks)
        mainViewModel.addFollowUp(jsonObject)
    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.backArrow -> {
                findNavController().popBackStack()
            }

            R.id.submit -> {
                addFollowUps()
            }
        }
    }
}