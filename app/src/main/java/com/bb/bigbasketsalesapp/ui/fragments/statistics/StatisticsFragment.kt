package com.bb.bigbasketsalesapp.ui.fragments.statistics

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentStatisticsBinding
import com.bb.bigbasketsalesapp.ui.fragments.commonModel.TileData
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.AppLoader
import com.bb.bigbasketsalesapp.utils.ChartData
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.graphUtils.ClaimsXAxisValueFormatter
import com.bb.bigbasketsalesapp.utils.showToast
import com.doctorsplaza.app.utils.Resource
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList


@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics), View.OnClickListener {

    private lateinit var binding: FragmentStatisticsBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    private val mainViewModel: MainViewModel by viewModels()

    private lateinit var appLoader: AppLoader

    private var selectedMonthYear = "2022"
    private var monthYearFormat = SimpleDateFormat("MM-yyyy", Locale.getDefault())
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
            currentView = inflater.inflate(R.layout.fragment_statistics, container, false)
            binding = FragmentStatisticsBinding.bind(currentView!!)
            setSpinner()
            init()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }

    private fun init() {
        appLoader = AppLoader(requireContext())
        selectedMonth = monthFormat.format(currentDateTime)
        selectedYear = yearFormat.format(currentDateTime)
        selectedMonthYear = "$selectedMonth-$selectedMonthYear"
        appLoader.show()
        checkLanguageAndHitApi()
//        mainViewModel.getTilesData(selectedMonthYear)
        binding.loader.isVisible = true
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
//                        mainViewModel.getTilesData(selectedMonthYear)
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
//                        mainViewModel.getTilesData(selectedMonthYear)
                    }
                }
            }



    }

    private fun setObserver() {
        mainViewModel.tilesData.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    binding.loader.isVisible = false
                    binding.errorMessage.isVisible = false
                    setFirstTime = true

                    if (response.data?.Output == "Success") {
                        setSalesAchievementTargetsData(response.data.Data)
                    } else {
                        binding.loader.isVisible = true
                        binding.noStatsMessage.isVisible = true
                    }
                }
                is Resource.Loading -> {
                    binding.loader.isVisible = true
                    binding.errorMessage.isVisible = false
                    appLoader.show()
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

            totalRevenueMonthly.text = salesAchievementsAndTargetsData.TotalRevenue.toString()
            customerRevenue.text = salesAchievementsAndTargetsData.RevenuePerCustomer.toString()

            newCustomer.text = salesAchievementsAndTargetsData.CustomerOnboarded.toString()
            totalNewCustomers.text = "/ ${salesAchievementsAndTargetsData.CustomerOnboardTarget}"

            noOfShops.text = salesAchievementsAndTargetsData.NoofShopvisitsdone.toString()
            totalNoOfShops.text = "/ ${salesAchievementsAndTargetsData.ShopVisitTarget}"

            val newCustomerRevenuePercent =
                salesAchievementsAndTargetsData.CustomerOnboarded.toDouble() / salesAchievementsAndTargetsData.CustomerOnboardTarget.toDouble() * 100

            onBoardProgress.progress = 0F
            onBoardProgress.progress = newCustomerRevenuePercent.toInt().toFloat()

            onBoardedProgressPercent.text = "${newCustomerRevenuePercent.toInt()}%"
        }
        setChartData(salesAchievementsAndTargetsData)
    }


    private fun setChartData(salesAchievementsAndTargetsData: TileData) {

        val lineEntry = ArrayList<Entry>()
        val chartData: MutableList<ChartData> = ArrayList()

        salesAchievementsAndTargetsData.Dashboard.SalesXaxisdata.forEachIndexed { index, salesXaxisdata ->
            if (index + 1 <= salesAchievementsAndTargetsData.Dashboard.SalesYaxisdata.size) {
                chartData.add(
                    ChartData(
                        index.toFloat(),
                        salesAchievementsAndTargetsData.Dashboard.SalesYaxisdata.reversed()[index].YAmount.toFloat()
                    )
                )
            } else {
                if (index == salesAchievementsAndTargetsData.Dashboard.SalesXaxisdata.size - 1) {
                   /* chartData.add(
                        ChartData(
                            index.toFloat(),
                            0F
                        )
                    )*/
                } else {
                    chartData.add(ChartData(index.toFloat(), 0F))
                }
            }
        }




        val sdf = SimpleDateFormat("dd/MM/yyyy",Locale.getDefault())
        chartData.forEach {

            lineEntry.add(Entry(it.xValue, it.yValue))
        }


        val dateList: MutableList<String> = ArrayList()
//        val date = sdf.parse(it.Xdata)
//        if(date<=Date())
        salesAchievementsAndTargetsData.Dashboard.SalesXaxisdata.forEach {

            dateList.add(it.Xdata)
        }

        binding.onBoardingCharChart.axisLeft.axisMinimum = 1f
        binding.onBoardingCharChart.axisRight.axisMinimum = 1f

        binding.onBoardingCharChart.axisLeft.setDrawZeroLine(false)
        binding.onBoardingCharChart.axisRight.setDrawZeroLine(false)

        binding.onBoardingCharChart.xAxis.valueFormatter = ClaimsXAxisValueFormatter(dateList)
        binding.onBoardingCharChart.xAxis.granularity = 1f
        binding.onBoardingCharChart.xAxis.spaceMax = 0.5f

        val lineDataset = LineDataSet(lineEntry, "")
        lineDataset.color = ContextCompat.getColor(requireContext(), R.color.white)

        lineDataset.circleRadius = 0f
        lineDataset.setDrawFilled(false)
        lineDataset.setDrawCircles(false)
        lineDataset.setDrawValues(false)
        lineDataset.lineWidth = 2F
        lineDataset.color = ContextCompat.getColor(requireContext(), R.color.white)


        val data = LineData(lineDataset)
        binding.onBoardingCharChart.data = data
        binding.onBoardingCharChart.animateXY(500, 500)

        val leftAxis: YAxis = binding.onBoardingCharChart.axisRight
        leftAxis.isEnabled = true
        binding.onBoardingCharChart.setDrawGridBackground(false)
        val xAxis: XAxis = binding.onBoardingCharChart.xAxis
        xAxis.setDrawAxisLine(false)

        binding.onBoardingCharChart.description.isEnabled = false
        binding.onBoardingCharChart.xAxis.setDrawGridLines(false)
        binding.onBoardingCharChart.axisLeft.setDrawLabels(true)
        binding.onBoardingCharChart.axisRight.isEnabled = false
        binding.onBoardingCharChart.axisLeft.setDrawAxisLine(false)
        binding.onBoardingCharChart.xAxis.textColor = Color.WHITE
        binding.onBoardingCharChart.axisLeft.textColor = Color.WHITE
        binding.onBoardingCharChart.legend.isEnabled = false
        binding.onBoardingCharChart.xAxis.position = XAxis.XAxisPosition.BOTTOM

    }

    private fun setOnClickListener() {
        with(binding) {
            backArrow.setOnClickListener(this@StatisticsFragment)
        }
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.backArrow -> {
                findNavController().popBackStack()
            }
        }
    }

    private fun checkLanguageAndHitApi() {
        if(session.currentLanguageCode == "en"){
            mainViewModel.getTilesData(selectedMonthYear)

        }else{

            mainViewModel.getLang(selectedMonthYear)
            mainViewModel.translatedString.observe(viewLifecycleOwner) { response ->
                when (response) {
                    is Resource.Success -> { mainViewModel.getTilesData(response.data.toString()) }
                    is Resource.Loading -> {}
                    is Resource.Error -> {}
                }

            }
        }

    }
}