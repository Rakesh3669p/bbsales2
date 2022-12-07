package com.bb.bigbasketsalesapp.ui.fragments.productList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentProductListBinding
import com.bb.bigbasketsalesapp.ui.fragments.productList.adapter.ProductListAdapter
import com.bb.bigbasketsalesapp.ui.fragments.productList.model.Product
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.AppLoader
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.showToast
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ProductListFragment : Fragment(R.layout.fragment_product_list), View.OnClickListener {

    private var productList: ArrayList<Product> = ArrayList()
    private lateinit var binding: FragmentProductListBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    @Inject
    lateinit var productListAdapter: ProductListAdapter

    private val mainViewModel: MainViewModel by viewModels()

    private lateinit var appLoader: AppLoader

    private val searchKey = ""

    private var pageNo = 1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_product_list, container, false)
            binding = FragmentProductListBinding.bind(currentView!!)
            init()
            setObserver()

            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        appLoader = AppLoader(requireContext())
        mainViewModel.productList(pageNo = pageNo.toString(), searchKey)
    }


    private fun setObserver() {
        mainViewModel.productList.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.httpcode == 200) {
                        binding.loadMore.isVisible = false
                        isLoading = response.data.data.products.isEmpty()
                        if (response.data.data.products.isNotEmpty()) {
                            binding.noDataMsg.isVisible = false
                            if (pageNo == 1) productList.clear()
                            productList.addAll(response.data.data.products)
                            if (pageNo == 1) {
                                setProductsRv(productList)
                            } else {
                                productListAdapter.differ.submitList(productList)
                                productListAdapter.notifyItemInserted(productListAdapter.itemCount-1)

                            }
                        } else {
                            if (productList.isEmpty()) {
                                binding.noDataMsg.isVisible = true
                            }
                        }
                    } else {
                        showToast(response.data?.status.toString())
                    }
                }
                is Resource.Loading -> {
                    if (pageNo == 1)
                        appLoader.show()
                    else binding.loadMore.isVisible = true
                }
                is Resource.Error -> {
                    appLoader.dismiss()
                    binding.loadMore.isVisible = false
                }
            }
        }
    }

    private fun setProductsRv(products: List<Product>) {
        productListAdapter.differ.submitList(products)
        binding.productList.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(requireContext(), 2)
            adapter = productListAdapter
        }.addOnScrollListener(scrollListener)
    }

    var isLoading = false
    var isScrolling = false


    private val scrollListener = object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)
            if (dy > 0) {
                val recycleLayoutManager = binding.productList.layoutManager as LinearLayoutManager
                if (!isLoading) {
                    if (recycleLayoutManager != null && recycleLayoutManager.findLastCompletelyVisibleItemPosition() == productListAdapter.itemCount - 1) {
                        pageNo++
                        mainViewModel.productList(pageNo.toString(), searchKey)
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

    private fun setOnClickListener() {
        with(binding) {
            backArrow.setOnClickListener(this@ProductListFragment)
            search.doOnTextChanged { text, _, _, _ ->
                if (text?.length!! > 2) {
                    pageNo=1
                    mainViewModel.productList(pageNo = pageNo.toString(), text.toString())
                } else if (text.isEmpty()) {
                    pageNo=1
                    mainViewModel.productList(pageNo = pageNo.toString(), "")
                }

            }
        }
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.backArrow -> {
                findNavController().popBackStack()
            }
        }
    }

}