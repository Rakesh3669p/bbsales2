package com.bb.bigbasketsalesapp.ui.fragments.customersList

import android.app.AlertDialog
import android.os.Bundle
import android.view.*
import android.widget.AbsListView
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentCustomersListBinding
import com.bb.bigbasketsalesapp.ui.fragments.customersList.adapter.CustomerListAdapter
import com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.AppLoader
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class CustomersListFragment : Fragment(R.layout.fragment_customers_list), View.OnClickListener {

    private var customerDeletePosition: Int = 0

    private lateinit var binding: FragmentCustomersListBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    @Inject
    lateinit var customerListAdapter: CustomerListAdapter


    private val mainViewModel: MainViewModel by viewModels()

    private lateinit var appLoader: AppLoader

    var customerData: MutableList<CustomerData> = ArrayList()

    private var pageNo = 1
    private var pageSize = 15
    private var searchKeyword = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_customers_list, container, false)
            binding = FragmentCustomersListBinding.bind(currentView!!)
            init()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        appLoader = AppLoader(requireContext())
        mainViewModel.getCustomerList(
            pageNo = pageNo.toString(),
            pageSize = pageSize.toString(),
            searchKeyword
        )
    }


    private fun setObserver() {
        mainViewModel.customerList.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    binding.bottomLoader.isVisible = false
                    if (response.data?.Output == "Success") {

                        isLoading = response.data.List.isEmpty()

                        if (pageNo == 1) {
                            if (response.data.TotalCount > 0) {
                                binding.customerListTitle.text =
                                    "Customer List (${response.data.TotalCount})"
                            }
                            customerData.clear()

                        }

                        customerData.addAll(response.data.List)
                        binding.customersListRv.isVisible = customerData.isNotEmpty()
                        if (pageNo == 1) {
                            binding.noData.isVisible = response.data.List.isEmpty()
                            setCustomers()
                        } else {
                            customerListAdapter.differ.submitList(customerData)
                            customerListAdapter.notifyDataSetChanged()
                        }
                    }
                }
                is Resource.Loading -> {
                    if (pageNo == 1) {
                        appLoader.show()
                    } else {
                        binding.bottomLoader.isVisible = true
                    }
                }
                is Resource.Error -> {
                    binding.bottomLoader.isVisible = false
                    appLoader.dismiss()
                }
            }
        }

        mainViewModel.customerDelete.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.Output == "Success") {
                        customerData.removeAt(customerDeletePosition)
                        customerListAdapter.differ.submitList(customerData)
                        customerListAdapter.notifyDataSetChanged()
                        if (customerData.isEmpty()) binding.noData.isVisible = true
                        session.customerRemoved = true
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

    private fun setCustomers() {
        customerListAdapter.differ.submitList(customerData)
        binding.customersListRv.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = customerListAdapter
        }.addOnScrollListener(scrollListener)
        customerListAdapter.notifyDataSetChanged()
    }


    private fun setOnClickListener() {
        with(binding) {
            backArrow.setOnClickListener(this@CustomersListFragment)
            addCustomers.setOnClickListener(this@CustomersListFragment)
            search.doOnTextChanged { text, _, _, _ ->
                if (text?.length!! > 2) {
                    pageNo = 1
                    searchKeyword = text.toString()
                    mainViewModel.getCustomerList(
                        pageNo = pageNo.toString(),
                        pageSize = pageSize.toString(),
                        searchKeyword
                    )
                } else if (text.isEmpty()) {
                    pageNo = 1
                    searchKeyword = text.toString()
                    mainViewModel.getCustomerList(
                        pageNo = pageNo.toString(),
                        pageSize = pageSize.toString(),
                        searchKeyword
                    )
                }
            }
        }

        customerListAdapter.setOnEditCustomerClickListener {
            val bundle = Bundle()
            bundle.putString("from", "edit")
            bundle.putString("customerId", it.Customer_Id.toString())
            bundle.putString("userId", it.UserId.toString())
            findNavController().navigate(R.id.editCustomerFragment, bundle)
        }

        customerListAdapter.setOnfollowUpClickListener {
            val bundle = Bundle().apply {
                putString("customerName", it.CustomerName)
                putString("customerImage", it.CustomerPhoto)
                putString("customerCode", it.CustomerCode)
                putString("customerState", it.State)
                putString("customerCity", it.City)
                putString("organisationId", it.OrganisationId.toString())
                putString("enquiryId", it.EnquiryID.toString())
            }
            findNavController().navigate(R.id.followUpListFragment, bundle)

        }

        customerListAdapter.setOnDeleteCustomerClickListener { it, position ->
            showAlertMessage(it, position)


        }

    }

    private fun showAlertMessage(it: CustomerData, position: Int) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(context)
        builder.setMessage("Are you sure want to delete customer?")
        builder.setCancelable(true)

        builder.setPositiveButton("Yes") { dialog, _ ->
            mainViewModel.deleteCustomer(it.Customer_Id.toString())
            customerDeletePosition = position
            dialog.cancel()
        }

        builder.setNegativeButton("No") { dialog, _ ->
            dialog.cancel()
        }

        val alert11: AlertDialog = builder.create()
        alert11.show()
    }


    var isLoading = false
    var isScrolling = false


    private val scrollListener = object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)

            if (dy > 0) {

                val recycleLayoutManager =
                    binding.customersListRv.layoutManager as LinearLayoutManager
                if (!isLoading) {
                    if (recycleLayoutManager != null && recycleLayoutManager.findLastCompletelyVisibleItemPosition() == customerListAdapter.itemCount - 2) {
                        pageNo++
                        mainViewModel.getCustomerList(
                            pageNo.toString(),
                            pageSize = "15",
                            searchKeyword
                        )
                        isLoading = true
                    }
                }
            }
        }

        override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
            if (newState == AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL) {
                isScrolling = true
            }
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.backArrow -> {
                findNavController().popBackStack()
            }
            R.id.addCustomers -> {
                findNavController().navigate(R.id.addCustomerFragment)
            }
        }
    }
}