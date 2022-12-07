package com.bb.bigbasketsalesapp.ui.fragments.manageCustomers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentAddCustomerBinding
import com.bb.bigbasketsalesapp.databinding.FragmentAddressBinding
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.AddressDataModel
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.NotificationListAdapter
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.addressFormData
import javax.inject.Inject


class AddressFragment : Fragment(R.layout.fragment_address), View.OnClickListener {

    private lateinit var binding: FragmentAddressBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    @Inject
    lateinit var notificationListAdapter: NotificationListAdapter

    private var street = ""
    private var city = ""
    private var district = ""
    private var state = ""
    private var pincode = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_address, container, false)
            binding = FragmentAddressBinding.bind(currentView!!)
            init()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        if (arguments?.getString("street").toString().isNotEmpty()) {
            street = arguments?.getString("street").toString()
            city = arguments?.getString("city").toString()
            district = arguments?.getString("district").toString()
            state = arguments?.getString("state").toString()
            pincode = arguments?.getString("pincode").toString()
            setAddressData()
        }
    }

    private fun setAddressData() {
        binding.streetName.setText(street)
        binding.city.setText(city)
        binding.district.setText(district)
        binding.state.setText(state)
        binding.zipcode.setText(pincode)
    }

    private fun setOnClickListener() {
        with(binding) {
            submitBtn.setOnClickListener(this@AddressFragment)
            backArrow.setOnClickListener(this@AddressFragment)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.submitBtn -> {
                setAddressDataAndNavigate()

            }
            R.id.backArrow -> {
                findNavController().popBackStack()
            }
        }
    }

    private fun setAddressDataAndNavigate() {
        street = binding.streetName.text.toString()
        city = binding.city.text.toString()
        district = binding.district.text.toString()
        state = binding.state.text.toString()
        pincode = binding.zipcode.text.toString()
        val addressData = AddressDataModel(
            street = street,
            city = city,
            district = district,
            state = state,
            pincode = pincode
        )
        addressFormData.postValue(addressData)
        findNavController().popBackStack()
    }

}