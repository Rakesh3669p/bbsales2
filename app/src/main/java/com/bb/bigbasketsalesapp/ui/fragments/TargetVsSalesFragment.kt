package com.bb.bigbasketsalesapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentTargetVsSalesBinding
import com.bb.bigbasketsalesapp.ui.fragments.commonModel.TileData
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.AppLoader
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.showToast
import com.doctorsplaza.app.utils.Resource
import com.google.android.gms.tasks.Continuation
import com.google.android.gms.tasks.Task
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
class TargetVsSalesFragment : Fragment(R.layout.fragment_target_vs_sales), View.OnClickListener {

    private lateinit var binding: FragmentTargetVsSalesBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    private val mainViewModel: MainViewModel by viewModels()

    private lateinit var appLoader: AppLoader

    private var selectedMonthYear = "2022"

    private var monthFormat = SimpleDateFormat("MM", Locale.getDefault())
    private var yearFormat = SimpleDateFormat("yyyy", Locale.getDefault())
    private val currentDateTime = Date()
    private var selectedYear = ""
    private var selectedMonth = ""
    private var setFirstTime = false


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_target_vs_sales, container, false)
            binding = FragmentTargetVsSalesBinding.bind(currentView!!)
            setSpinner()
            init()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }

    private fun setSpinner() {

        val monthAdapter = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.month_list,
            R.layout.spinner_text
        )
        monthAdapter.setDropDownViewResource(R.layout.spinner_text)
        binding.monthSpinner.adapter = monthAdapter

        binding.monthSpinner.setSelection(monthFormat.format(currentDateTime).toInt())
        binding.monthSpinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) {}
                override fun onItemSelected(
                    p0: AdapterView<*>?,
                    p1: View?,
                    position: Int,
                    p3: Long
                ) {
                    if (setFirstTime) {
                        selectedMonth = position.toString()
                        selectedMonthYear = "$selectedMonth-$selectedYear"

                        checkLanguageAndHitApi()

                    }
                }
            }


        val yearAdapter = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.year_list,
            R.layout.spinner_text
        )
        yearAdapter.setDropDownViewResource(R.layout.spinner_text)

        val yearList = requireContext().resources.getStringArray(R.array.year_list)
        val year = yearFormat.format(currentDateTime)
        binding.yearSpinner.adapter = yearAdapter
        yearList.forEachIndexed { position, it ->
            if (it == year) {
                binding.yearSpinner.setSelection(position)
            }
            binding.yearSpinner.setSelection(3)
        }
        binding.yearSpinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) {}
                override fun onItemSelected(
                    p0: AdapterView<*>?,
                    p1: View?,
                    position: Int,
                    p3: Long
                ) {
                    if (setFirstTime) {
                        selectedYear = yearList[position]
                        selectedMonthYear = "$selectedMonth-$selectedYear"

                        checkLanguageAndHitApi()

                    }
                }
            }
    }


    private fun init() {
        appLoader = AppLoader(requireContext())
        selectedMonth = monthFormat.format(currentDateTime)
        selectedYear = yearFormat.format(currentDateTime)
        selectedMonthYear = "$selectedMonth-$selectedYear"
        binding.loader.isVisible = true
        appLoader.show()

        checkLanguageAndHitApi()

    }

    private fun checkLanguageAndHitApi() {
        if (session.currentLanguageCode == "en") {
            mainViewModel.getTilesData(selectedMonthYear)
        } else {
            mainViewModel.getLang(selectedMonthYear)
            mainViewModel.translatedString.observe(viewLifecycleOwner) { response ->
                when (response) {
                    is Resource.Success -> {
                        mainViewModel.getTilesData(response.data.toString())

                    }
                    is Resource.Loading -> {

                    }
                    is Resource.Error -> {
                    }
                }

            }
        }
    }


    private fun setObserver() {
        mainViewModel.tilesData.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    setFirstTime = true
                    binding.loader.isVisible = false
                    binding.errorMessage.isVisible = false

                    if (response.data?.Output == "Success") {
                        setSalesAchievementTargetsData(response.data.Data)
                    } else {
                        binding.noStatsMessage.isVisible = true
                    }
                }
                is Resource.Loading -> {
                    binding.loader.isVisible = true
                    binding.errorMessage.isVisible = false
                }
                is Resource.Error -> {
                    binding.loader.isVisible = true
                    binding.errorMessage.isVisible = true
                    appLoader.dismiss()
                }
            }
        }
    }


    private fun setSalesAchievementTargetsData(salesAchievementsAndTargetsData: TileData) {
        with(binding) {

            totalRevenueMonthly.text =
                "${salesAchievementsAndTargetsData.TotalRevenue} / ${salesAchievementsAndTargetsData.TotalRevenueTarget}"

            customerRevenue.text =
                "${salesAchievementsAndTargetsData.RevenuePerCustomer} / ${salesAchievementsAndTargetsData.RevenuePerCustomerTarget}"

            newCustomer.text = salesAchievementsAndTargetsData.CustomerOnboarded.toString()
            totalNewCustomers.text = "/ ${salesAchievementsAndTargetsData.CustomerOnboardTarget}"

            noOfShops.text = salesAchievementsAndTargetsData.NoofShopvisitsdone.toString()
            totalNoOfShops.text = "/ ${salesAchievementsAndTargetsData.ShopVisitTarget}"
        }
    }

    private fun setOnClickListener() {
        with(binding) {
            backArrow.setOnClickListener(this@TargetVsSalesFragment)
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