package com.bb.bigbasketsalesapp.ui.fragments.home

import android.app.ProgressDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentHomeBinding
import com.bb.bigbasketsalesapp.ui.fragments.commonModel.TileData
import com.bb.bigbasketsalesapp.ui.fragments.profile.model.GetUserProfileData
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.*
import com.bumptech.glide.Glide
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home), View.OnClickListener {

    private lateinit var binding: FragmentHomeBinding

    lateinit var downloadLoader:DownloadLoader

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    private val mainViewModel: MainViewModel by viewModels()

    private lateinit var appLoader: AppLoader

    private var selectedMonthYear = "2022"
    private var selectedYear = ""
    private var selectedMonth = ""
    private var monthFormat = SimpleDateFormat("MM", Locale.getDefault())
    private var yearFormat = SimpleDateFormat("yyyy", Locale.getDefault())
    private val currentDateTime = Date()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_home, container, false)
            binding = FragmentHomeBinding.bind(currentView!!)
            init()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        downloadLoader = DownloadLoader(requireContext())
        hideKeyboard(requireActivity())
        appLoader = AppLoader(requireContext())
        appLoader.show()
        mainViewModel.getUserProfile()
        selectedMonth = monthFormat.format(currentDateTime)
        selectedYear = yearFormat.format(currentDateTime)
        selectedMonthYear = "$selectedMonth-$selectedYear"
        mainViewModel.getUserProfile()
        checkLanguageAndHitApi()
        binding.loader.isVisible = true
        binding.notificationAvailable.isVisible = session.notificationCount>0||session.messageCount>0

    }


    private fun setObserver() {
        mainViewModel.tilesData.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    binding.loader.isVisible = false
                    if (response.data?.Output == "Success") {
                        setSalesAchievementTargetsData(response.data.Data)
                    }
                }

                is Resource.Loading -> {
                    binding.loader.isVisible = true
                }

                is Resource.Error -> {
                    binding.loader.isVisible = true
                    appLoader.dismiss()
                }
            }
        }


        mainViewModel.getUserProfile.observe(viewLifecycleOwner) { response ->
            when (response) {

                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.Output == "Success") {
                        setUserData(response.data.Data)
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

    private fun setUserData(data: GetUserProfileData) {
        with(binding) {
            userName.text = data.EmployeeName
            if (data.EmployeePhoto != null) {
                Glide.with(requireContext()).applyDefaultRequestOptions(noImage()).load(
                    getBase64Image(data.EmployeePhoto)
                ).into(userProfile)
            }
        }
    }


    private fun setSalesAchievementTargetsData(salesAchievementsAndTargetsData: TileData) {

        with(binding) {
            val monthlyRevenuePercent =
                salesAchievementsAndTargetsData.TotalRevenue / salesAchievementsAndTargetsData.TotalRevenueTarget * 100
            monthlyRevenueProgress.progress = monthlyRevenuePercent.toInt()

            val customerRevenuePercent =
                salesAchievementsAndTargetsData.RevenuePerCustomer / salesAchievementsAndTargetsData.RevenuePerCustomerTarget * 100
            customerRevenueProgress.progress = customerRevenuePercent.toInt()

            val newCustomerRevenuePercent =
                salesAchievementsAndTargetsData.CustomerOnboarded.toDouble() / salesAchievementsAndTargetsData.CustomerOnboardTarget.toDouble() * 100
            newCustomersProgress.progress = newCustomerRevenuePercent.toInt()

            val noOfShopsPercent =
                salesAchievementsAndTargetsData.NoofShopvisitsdone.toDouble() / salesAchievementsAndTargetsData.ShopVisitTarget.toDouble() * 100
            noOfShopsProgress.progress = noOfShopsPercent.toInt()

            totalRevenueMonthly.text = salesAchievementsAndTargetsData.TotalRevenue.toString()
            customerRevenue.text = salesAchievementsAndTargetsData.RevenuePerCustomer.toString()

            newCustomer.text = salesAchievementsAndTargetsData.CustomerOnboarded.toString()
            totalNewCustomers.text = "/ ${salesAchievementsAndTargetsData.CustomerOnboardTarget}"

            noOfShops.text = salesAchievementsAndTargetsData.NoofShopvisitsdone.toString()
            totalNoOfShops.text = "/ ${salesAchievementsAndTargetsData.ShopVisitTarget}"
        }
    }


    private fun setOnClickListener() {
        with(binding) {
            monthlyRevenueBg.setOnClickListener(this@HomeFragment)
            customerRevenueBg.setOnClickListener(this@HomeFragment)
            newCustomersBg.setOnClickListener(this@HomeFragment)
            noOfShopsBg.setOnClickListener(this@HomeFragment)

            productsBg.setOnClickListener(this@HomeFragment)
            statsBg.setOnClickListener(this@HomeFragment)
            offersBg.setOnClickListener(this@HomeFragment)
            searchBg.setOnClickListener(this@HomeFragment)
            addCustomer.setOnClickListener(this@HomeFragment)
            userProfile.setOnClickListener(this@HomeFragment)
            notification.setOnClickListener(this@HomeFragment)
        }
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.monthlyRevenueBg -> {
                findNavController().navigate(R.id.revenueFragment)
            }
            R.id.customerRevenueBg -> {
                findNavController().navigate(R.id.revenueFragment)
            }
            R.id.newCustomersBg -> {
                findNavController().navigate(R.id.targetVsSalesFragment)
            }
            R.id.noOfShopsBg -> {
                findNavController().navigate(R.id.targetVsSalesFragment)
            }
            R.id.productsBg -> {
                findNavController().navigate(R.id.productListFragment)
            }
            R.id.statsBg -> {
                findNavController().navigate(R.id.statisticsFragment)
            }
            R.id.offersBg -> {
                findNavController().navigate(R.id.offersFragment)
            }
            R.id.searchBg -> {
                findNavController().navigate(R.id.customersListFragment)
            }
            R.id.addCustomer -> {
                val bundle = Bundle().apply {
                    putString("from", "Home")
                }
                findNavController().navigate(R.id.addCustomerFragment, bundle)
            }

            R.id.userProfile -> {
                findNavController().navigate(R.id.profileFragment)
            }
            R.id.notification -> {
                findNavController().navigate(R.id.notificationsMessagesFragment)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        if (session.customerAdded || session.customerRemoved) {
            session.customerAdded = false
            session.customerRemoved = false
            checkLanguageAndHitApi()
            setObserver()
        }
    }
    private fun checkLanguageAndHitApi() {
        session.currentLanguageCode = Locale.getDefault().language
        if (session.currentLanguageCode == "ar") {
            mainViewModel.downloadLang()
            mainViewModel.downloadLanguage.observe(viewLifecycleOwner){response->
                when(response){
                    is Resource.Success->{
                        downloadLoader.dismiss()

                        mainViewModel.getLang(selectedMonthYear)
                        mainViewModel.translatedString.observe(viewLifecycleOwner) { response ->
                            when (response) {
                                is Resource.Success -> {
                                    appLoader.dismiss()
                                    mainViewModel.getTilesData(response.data.toString())
                                }
                                is Resource.Loading -> {

                                }
                                is Resource.Error -> {
//                                    showToast(response.message.toString())
                                }
                            }

                        }
                    }

                    is Resource.Loading->{
                        downloadLoader.show()
                    }
                    is Resource.Error->{
                        downloadLoader.dismiss()
                    }

                }
            }

        } else {
            mainViewModel.getTilesData(selectedMonthYear)
        }
    }

}