package com.bb.bigbasketsalesapp.ui.fragments.profile

import android.content.Intent
import android.os.Bundle
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentProfileBinding
import com.bb.bigbasketsalesapp.ui.fragments.profile.model.GetUserProfileData
import com.bb.bigbasketsalesapp.ui.loginSignUp.LoginSignupActivity
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.*
import com.bumptech.glide.Glide
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import java.lang.Exception
import javax.inject.Inject

@AndroidEntryPoint
class ProfileFragment : Fragment(R.layout.fragment_profile), View.OnClickListener {

    private lateinit var binding: FragmentProfileBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    private val mainViewModel:MainViewModel by viewModels()

    private lateinit var appLoader:AppLoader

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_profile, container, false)
            binding = FragmentProfileBinding.bind(currentView!!)
            init()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        hideKeyboard(requireActivity())
        appLoader = AppLoader(requireContext())
        mainViewModel.getUserProfile()
        binding.userDetailsGrp.makeInvisible()
    }


    private fun setObserver() {
        mainViewModel.getUserProfile.observe(viewLifecycleOwner){response->
            when(response){
                is Resource.Success->{
                    appLoader.dismiss()
                    binding.userDetailsGrp.isVisible = true
                    if(response.data?.Output =="Success"){
                        setUserData(response.data.Data)
                    }else{
                        requireContext().showToast(response.data?.Message.toString())
                    }
                }
                is Resource.Loading->{
                    appLoader.show()
                    binding.userDetailsGrp.makeInvisible()
                }
                is Resource.Error->{
                    binding.userDetailsGrp.makeInvisible()
                    appLoader.dismiss()
                    requireContext().showToast(response.message.toString())
                }
            }
        }

        mainViewModel.logOut.observe(viewLifecycleOwner){response->
            when (response){
                is Resource.Success->{
                    appLoader.dismiss()
                    if(response.data?.Output == "Success"){
                        showToast("Logged Out")
                        session.isLogin = false
                        startActivity(Intent(requireContext(),LoginSignupActivity::class.java))
                        requireActivity().finish()
                    }else{
                        showToast(response.data?.Output.toString())
                    }
                }
                is Resource.Loading->{
                    appLoader.show()
                }
                is Resource.Error->{
                    appLoader.dismiss()
                    showToast(response.message.toString())
                }
            }

        }
    }

    private fun setUserData(data: GetUserProfileData) {
        with(binding){
            val imageByteArray: ByteArray? = try {
                if(data.EmployeePhoto!=null){
                    Base64.decode(data.EmployeePhoto, Base64.DEFAULT)
                }else{
                    Base64.decode("", Base64.DEFAULT)
                }
            }catch (e:Exception){
                null
            }

                Glide.with(requireContext()).applyDefaultRequestOptions(noImage()).load(imageByteArray).into(profileImage)

            userName.text = data.EmployeeName
            userDesignation.text = data.DesignationName
            userMobile.text= data.MobileNo.toString()
            userEmail.text = data.EmailId.toString()
            session.employeeId = data.Employee_Id
            session.roleId = data.RoleId
        }
    }


    private fun setOnClickListener() {
        with(binding) {
            profileEdit.setOnClickListener(this@ProfileFragment)
            userChangePassword.setOnClickListener(this@ProfileFragment)
            logout.setOnClickListener(this@ProfileFragment)
            backArrow.setOnClickListener(this@ProfileFragment)
        }
    }

    private fun callLogout() {
        params["UserLogId"] =session.userId.toString()
        params["User_Id"] =session.userId.toString()
        params["OrganizationID"] =session.organisationId.toString()
        params["Division_Id"] =session.divisionId.toString()
        params["Branch_Id"] =session.branchId.toString()
        mainViewModel.logOut(params)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.backArrow -> {
                findNavController().popBackStack()
            }
            R.id.profileEdit -> {
                findNavController().navigate(R.id.editProfileFragment)
            }
            R.id.userChangePassword -> {
                findNavController().navigate(R.id.changePasswordLogin)
            } 
            R.id.logout -> {
                callLogout()

            }
        }
    }


}