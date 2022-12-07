package com.bb.bigbasketsalesapp.ui.fragments.manageCustomers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentEditCustomerBinding
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.adapter.EditCustomerFormAdapter
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.CustomerData
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.NotificationListAdapter
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.AppLoader
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.basicForm
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class EditCustomerFragment : Fragment(R.layout.fragment_edit_customer),View.OnClickListener {

    private lateinit var binding: FragmentEditCustomerBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    @Inject
    lateinit var notificationListAdapter: NotificationListAdapter

    private lateinit var appLoader: AppLoader

    private val mainViewModel: MainViewModel by viewModels()

    lateinit var customerData:CustomerData

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            activity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)

            currentView = inflater.inflate(R.layout.fragment_edit_customer, container, false)
            binding = FragmentEditCustomerBinding.bind(currentView!!)
            init()

            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        appLoader = AppLoader(requireContext())
        if(arguments?.getString("from").toString()=="edit"){
            val customerId = arguments?.getString("customerId").toString()
            val userId = arguments?.getString("userId").toString()
            mainViewModel.getCustomerDetails(customerId,userId)
        }else{
            customerData = CustomerData()
            setTabLayoutAndViewPager(customerData)
        }
    }

    private fun setTabLayoutAndViewPager(data: CustomerData) {
        val fragmentManager = childFragmentManager
        val notificationMessageAdapter = EditCustomerFormAdapter(fragmentManager, lifecycle,data)
        binding.viewPager.adapter = notificationMessageAdapter
        binding.viewPager.isSaveEnabled = false
        binding.viewPager.isUserInputEnabled = false
        binding.viewPager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                if (position == 0) {
                    binding.basicDetailsTab.setTextColor(
                        ContextCompat.getColor(
                            requireContext(),
                            R.color.blue
                        ))

                    binding.businessDetailsTab.setTextColor(
                        ContextCompat.getColor(
                            requireContext(),
                            R.color.black
                        ))

                } else if (position == 1) {

                    binding.basicDetailsTab.setTextColor(
                        ContextCompat.getColor(
                            requireContext(),
                            R.color.black
                        ))

                    binding.businessDetailsTab.setTextColor(
                        ContextCompat.getColor(
                            requireContext(),
                            R.color.blue
                        ))
                }
            }
        })

    }


    private fun setObserver() {
        basicForm.observe(viewLifecycleOwner){
            if(it==1){
                binding.viewPager.currentItem = 1
                basicForm.postValue(0)
            }else if(it==2){
                binding.viewPager.currentItem = 0
                basicForm.postValue(0)
            }
        }

        mainViewModel.customerDetails.observe(viewLifecycleOwner){response->
            when(response){
                is Resource.Success->{
                    appLoader.dismiss()
                    if(response.data?.Output == "Success"){
                        setTabLayoutAndViewPager(response.data.Data)
                    }
                }
                is Resource.Loading->{
                    appLoader.show()
                }
                is Resource.Error->{
                    appLoader.dismiss()
                }
            }

        }

    }


    private fun setOnClickListener() {
        with(binding) {
            backArrow.setOnClickListener(this@EditCustomerFragment)
        }
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.backArrow->{
                if(binding.viewPager.currentItem == 1){
                    binding.viewPager.currentItem = 0
                }else {
                    findNavController().popBackStack()
                }
            }
        }
    }

}