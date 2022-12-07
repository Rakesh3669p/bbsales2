package com.bb.bigbasketsalesapp.ui.loginSignUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.isDigitsOnly
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentForgotPasswordBinding
import com.bb.bigbasketsalesapp.databinding.FragmentLoginBinding
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.AppLoader
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.isValidEmail
import com.bb.bigbasketsalesapp.utils.showToast
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ForgotPasswordFragment : Fragment(R.layout.fragment_forgot_password),View.OnClickListener {
    private lateinit var binding: FragmentForgotPasswordBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    private val mainViewModel:MainViewModel by viewModels()

    lateinit var appLoader: AppLoader

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_forgot_password, container, false)
            binding = FragmentForgotPasswordBinding.bind(currentView!!)
            init()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        appLoader = AppLoader(requireContext())
    }


    private fun setObserver() {
        mainViewModel.forgotPassword.observe(viewLifecycleOwner){response->
            when(response){
                is Resource.Success->{
                    appLoader.dismiss()
                    if(response.data?.Output == "Success"){
                        session.employeeId = response.data.Data.Employee_Id
                        session.roleId = response.data.Data.RoleId
                        session.userId = response.data.Data.UserId
                        val bundle = Bundle().apply { putString("otp",response.data.Data.OTP.toString()) }
                        findNavController().navigate(R.id.action_forgotPasswordFragment_to_hilt_OTPFragment,bundle)
                    }else{
                        showToast(response.data?.Output.toString())
                    }
                }
                is Resource.Loading->{
                    appLoader.show()
                }
                is Resource.Error->{
                    appLoader.dismiss()
                }
            }
        }
    }


    private fun setOnClickListener() {
        with(binding){
            otpSend.setOnClickListener(this@ForgotPasswordFragment)
        }
    }

    private fun verifyAndSend() {

        val phoneEmail = binding.mobileEmailEdt.text.toString()
        when {
            phoneEmail.isEmpty() -> {
                showToast("Please enter a valid email or phone no.")
            }
            phoneEmail.isDigitsOnly() -> {
                mainViewModel.forgotPassword(phoneEmail,"Phone")
            }
            phoneEmail.isValidEmail() -> {
                mainViewModel.forgotPassword(phoneEmail,"Email")
            }
            else -> {
                showToast("Please enter a valid email or phone no.")
            }
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.otpSend->{
                verifyAndSend()
            }
        }
    }
    override fun onResume() {
        super.onResume()
        setObserver()
    }
}