package com.bb.bigbasketsalesapp.ui.fragments.revenue

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentRevenueBinding
import com.bb.bigbasketsalesapp.ui.fragments.revenue.adapter.RevenueAdapter
import com.bb.bigbasketsalesapp.ui.fragments.revenue.model.RevenueModel
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.AppLoader
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.params
import com.bb.bigbasketsalesapp.utils.showToast
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class RevenueFragment : Fragment(R.layout.fragment_revenue), View.OnClickListener {

    private lateinit var binding: FragmentRevenueBinding
    private lateinit var params: MutableMap<String, String>

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    @Inject
    lateinit var revenueAdapter: RevenueAdapter

    lateinit var appLoader: AppLoader

    private val mainViewModel: MainViewModel by viewModels()

    private var monthFormat = SimpleDateFormat("MM", Locale.getDefault())
    private var yearFormat = SimpleDateFormat("yyyy", Locale.getDefault())
    private val currentDateTime = Date()
    private var selectedYear = ""
    private var selectedMonth = ""
    private var setFirstTime = false
    private var searchKey = ""
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_revenue, container, false)
            binding = FragmentRevenueBinding.bind(currentView!!)
            setSpinners()
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
        binding.loader.isVisible = true
        callApi()
    }

    private fun callApi() {
        appLoader.show()
        params = HashMap()

        if (session.currentLanguageCode == "ar") {
            translateLang(selectedMonth)
        } else {
            params["month"] = selectedMonth
            params["year"] = selectedYear
            params["search"] = searchKey
            mainViewModel.revenueList(params)
        }

    }

    private fun setSpinners() {

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
                        selectedMonth = if (position.toString().length == 1) {
                            "0$position"
                        } else {
                            position.toString()
                        }
                       callApi()
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
                        callApi()
                    }
                }
            }

    }


    private fun setObserver() {
        mainViewModel.revenueList.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    binding.search.clearFocus()
                    setFirstTime = true
                    if (response.data?.httpcode == 200) {
                        setRevenueData(response.data)
                    } else {
                        showToast(response.data?.message.toString())
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

    private fun setRevenueData(revenueModel: RevenueModel?) {
        if (revenueModel!!.data.isEmpty()) {
            binding.loader.isVisible = true
            binding.noDataMsg.isVisible = true
        } else {
            binding.loader.isVisible = false
            binding.noDataMsg.isVisible = false
            binding.totalRevenue.text = "${revenueModel.total} SAR"
            revenueAdapter.differ.submitList(revenueModel.data)
            binding.revenueList.apply {
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(requireContext())
                adapter = revenueAdapter
            }
        }
    }


    private fun setOnClickListener() {
        with(binding) {
            backArrow.setOnClickListener(this@RevenueFragment)
            search.doOnTextChanged { text, _, _, _ ->
                if (text?.length!! > 2) {
                    searchKey = text.toString()
                    callApi()
                } else if (text.isEmpty()) {
                    searchKey = text.toString()
                    if(setFirstTime){

                    callApi()
                    }
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

    private fun translateLang(language: String) {

        mainViewModel.getLang(language)
            mainViewModel.translatedString.observe(viewLifecycleOwner) { response ->
                when (response) {
                    is Resource.Success -> {
                        if(response.data.toString().length >2&&!params.containsKey("year")){
                            params["year"]= response.data.toString()
                        }else if(response.data.toString().length <= 2&&!params.containsKey("month")){
                            params["month"]= response.data.toString()
                            translateLang(selectedYear)

                        }

                        if (params.containsKey("month") && params.containsKey("year")) {
                            params["search"] = searchKey
                            mainViewModel.revenueList(params)

                        }
                    }
                    is Resource.Loading -> {

                    }
                    is Resource.Error -> {
                    }
                }

            }
    }

}