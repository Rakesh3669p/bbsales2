package com.bb.bigbasketsalesapp.ui.fragments.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentEditProfileBinding
import com.bb.bigbasketsalesapp.ui.fragments.profile.model.GetUserProfileData
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.AppLoader
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.showToast
import com.doctorsplaza.app.utils.Resource
import com.google.gson.JsonObject
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class EditProfileFragment : Fragment(R.layout.fragment_edit_profile), View.OnClickListener {

    private lateinit var userData: GetUserProfileData

    private lateinit var binding: FragmentEditProfileBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    lateinit var appLoader: AppLoader

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_edit_profile, container, false)
            binding = FragmentEditProfileBinding.bind(currentView!!)
            init()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        appLoader = AppLoader(requireContext())
        mainViewModel.getUserProfile()

    }


    private fun setObserver() {
        mainViewModel.getUserProfile.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.Output == "Success") {
                        userData = response.data.Data
                        setProfileData(userData)
                    } else {
                        showToast("Something went wrong try again later...")
                        findNavController().popBackStack()
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
        mainViewModel.updateUserProfile.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.Output == "Success") {
                        findNavController().navigate(R.id.action_editProfileFragment_to_profileFragment)
                    } else {
                        showToast(response.data?.Output.toString())
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

    private fun setProfileData(data: GetUserProfileData) {
        with(binding) {
            userName.setText(data.EmployeeName)
            userDesignation.setText(data.DesignationName)
            userEmail.setText(data.EmailId.toString())
            userPhone.setText(data.MobileNo.toString())
        }

    }


    private fun setOnClickListener() {
        with(binding) {
            backArrow.setOnClickListener(this@EditProfileFragment)
            save.setOnClickListener(this@EditProfileFragment)
        }
    }

    private fun updateUserData() {

        val userName = binding.userName.text.toString()
        val userEmail = binding.userEmail.text.toString()
        val userPhone = binding.userPhone.text.toString()

        val jsonObject = JsonObject()
        jsonObject.addProperty("Employee_Id", userData.Employee_Id)

        if (userName.isNotEmpty()) {
            jsonObject.addProperty("EmployeeName", userName)
        } else {
            jsonObject.addProperty("EmployeeName", userData.EmployeeName)
        }

        jsonObject.addProperty("EmployeeCode", userData.Employeecode)
        jsonObject.addProperty("Gender", userData.Gender)
        if (userPhone.isNotEmpty()) {
            jsonObject.addProperty("MobileNo", userPhone)
        } else {
            jsonObject.addProperty("MobileNo", userData.MobileNo)
        }
        jsonObject.addProperty("DOB", userData.DOB)

        if (userEmail.isNotEmpty()) {
            jsonObject.addProperty("EmailId", userEmail)

        } else {
            jsonObject.addProperty("EmailId", userData.EmailId.toString())
        }

        jsonObject.addProperty("DOJ", userData.DOJ)
        jsonObject.addProperty("active_status", userData.ActionStatus.toString())
        jsonObject.addProperty("BloodGroup", userData.BloodGroup)
        jsonObject.addProperty("FileName", userData.toString())

        mainViewModel.updateUserProfile(jsonObject)


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.backArrow -> {
                findNavController().popBackStack()
            }
            R.id.save -> {
                updateUserData()
            }
        }
    }


}