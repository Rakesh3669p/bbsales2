package com.bb.bigbasketsalesapp.ui.loginSignUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentForgotPasswordBinding
import com.bb.bigbasketsalesapp.databinding.FragmentLoginBinding
import com.bb.bigbasketsalesapp.databinding.FragmentOtpBinding
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.AppLoader
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.showToast
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class OTPFragment : Fragment(R.layout.fragment_otp), View.OnClickListener {
    private var otp: String = ""
    private lateinit var binding: FragmentOtpBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null


    lateinit var appLoader: AppLoader

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_otp, container, false)
            binding = FragmentOtpBinding.bind(currentView!!)
            init()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        appLoader = AppLoader(requireContext())
        otp = arguments?.getString("otp").toString()
    }




    private fun setOnClickListener() {
        with(binding) {
            otpSubmit.setOnClickListener(this@OTPFragment)
        }
    }


    private fun verifyOtp() {
        val enteredOtp = binding.otpView.otp.toString()
        appLoader.show()
        if (enteredOtp == otp) {
            lifecycleScope.launch {
                delay(2000)
                appLoader.dismiss()
                findNavController().navigate(R.id.changePasswordFragment)
            }
        } else {
            showToast("Please enter valid Otp")
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.otpSubmit -> {
                verifyOtp()
            }
        }
    }
}