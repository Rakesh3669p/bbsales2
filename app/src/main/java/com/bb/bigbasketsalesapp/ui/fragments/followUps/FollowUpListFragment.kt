package com.bb.bigbasketsalesapp.ui.fragments.followUps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentFollowUpListBinding
import com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData
import com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter.FollowUpAdapter
import com.bb.bigbasketsalesapp.ui.fragments.followUps.model.Follow
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.*
import com.bumptech.glide.Glide
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FollowUpListFragment : Fragment(R.layout.fragment_follow_up_list), View.OnClickListener {

    private lateinit var customerData: CustomerData
    private lateinit var binding: FragmentFollowUpListBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    @Inject
    lateinit var followUpAdapter: FollowUpAdapter

    private val mainViewModel: MainViewModel by viewModels()

    lateinit var appLoader: AppLoader

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
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_follow_up_list, container, false)
            binding = FragmentFollowUpListBinding.bind(currentView!!)
            init()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        appLoader = AppLoader(requireContext())
        customerName = arguments?.getString("customerName").toString()
        customerImage = arguments?.getString("customerImage").toString()
        customerCode = arguments?.getString("customerCode").toString()
        customerState = arguments?.getString("customerState").toString()
        customerCity = arguments?.getString("customerCity").toString()
        organisationId = arguments?.getString("organisationId").toString()
        enquiryId = arguments?.getString("enquiryId").toString()
        setTopData()
        mainViewModel.followUpList(organisationId, enquiryId)
    }

    private fun setTopData() {
        with(binding){
            followUpName.text = customerName
            followUpCode.text = "#${customerCode}"
            revenueCity.text = "(${customerCity})"
            Glide.with(requireContext()).applyDefaultRequestOptions(noImage()).load(getBase64Image(customerImage)).into(followUpImage)
        }
    }


    private fun setObserver() {
        mainViewModel.followUpList.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.Output == "Success") {
                        if (response.data.Data.FollowList.isNotEmpty()) {
                            binding.noDataMsg.isVisible = false
                            setFollowUps(response.data.Data.FollowList)
                        } else {
                            binding.noDataMsg.isVisible = true
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
                    showToast(response.message.toString())
                }

            }
        }
    }

    private fun setFollowUps(data: List<Follow>) {


        followUpAdapter.differ.submitList(data)
        binding.followUpRv.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = followUpAdapter
        }
    }


    private fun setOnClickListener() {
        with(binding) {
            backArrow.setOnClickListener(this@FollowUpListFragment)
            addFollowUps.setOnClickListener(this@FollowUpListFragment)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.backArrow -> {
                findNavController().popBackStack()
            }
            R.id.addFollowUps -> {
                val bundle = Bundle().apply {
                    putString("customerName",customerName)
                    putString("customerImage",customerImage)
                    putString("customerCode",customerCode)
                    putString("customerState",customerState)
                    putString("customerCity",customerCity)
                    putString("organisationId",organisationId)
                    putString("enquiryId",enquiryId)

                }
                findNavController().navigate(R.id.addFollowUpsFragment,bundle)
            }
        }
    }
}