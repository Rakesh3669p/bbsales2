package com.bb.bigbasketsalesapp.ui.fragments.offers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentChangePasswordLoginBinding
import com.bb.bigbasketsalesapp.databinding.FragmentOffersBinding
import com.bb.bigbasketsalesapp.ui.fragments.offers.adapter.OffersAdapter
import com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferData
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.AppLoader
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.showToast
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OffersFragment : Fragment(R.layout.fragment_offers), View.OnClickListener {

    private lateinit var binding: FragmentOffersBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    @Inject
    lateinit var offersAdapter: OffersAdapter

    lateinit var appLoader: AppLoader

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_offers, container, false)
            binding = FragmentOffersBinding.bind(currentView!!)
            init()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        appLoader = AppLoader(requireContext())
        mainViewModel.offerList("")
    }


    private fun setObserver() {
        mainViewModel.offerList.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.httpcode == 200) {

                        if (response.data.data.isNotEmpty()) {
                            binding.noDataMsg.isVisible = false
                            setOfferRv(response.data.data)
                        } else {
                            binding.noDataMsg.isVisible = true
                        }

                    } else {
                        showToast(response.data?.status.toString())
                    }
                }
                is Resource.Loading -> {
                    appLoader.show()
                }
                is Resource.Error -> {
                    showToast(response.message.toString())
                    appLoader.dismiss()
                }
            }
        }
    }

    private fun setOfferRv(data: List<OfferData>) {
        offersAdapter.differ.submitList(data)
        binding.offerList.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = offersAdapter
        }
    }


    private fun setOnClickListener() {
        with(binding) {
            backArrow.setOnClickListener(this@OffersFragment)
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