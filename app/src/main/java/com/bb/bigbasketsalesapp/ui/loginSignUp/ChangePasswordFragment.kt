package com.bb.bigbasketsalesapp.ui.loginSignUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentChangePasswordBinding
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.*
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ChangePasswordFragment : Fragment(R.layout.fragment_change_password),View.OnClickListener {
    private lateinit var binding: FragmentChangePasswordBinding

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
            currentView = inflater.inflate(R.layout.fragment_change_password, container, false)
            binding = FragmentChangePasswordBinding.bind(currentView!!)
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
        mainViewModel.changePasswordLogin.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.Output == "Success") {
                        hideKeyboard(requireActivity())
                        requireContext().showToast("Your Password has Changed Successfully... Please Login with your new password")
                        findNavController().navigate(R.id.action_changePasswordFragment_to_loginFragment)
                    } else {
                        requireContext().showToast(response.data?.Message.toString())
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

    private fun validateAndChangePassword() {
        val password = binding.passwordEdt.text.toString()
        val newPassword = binding.newPasswordEdt.text.toString()


        when {

            password != newPassword -> {
                requireContext().showToast("New Password and Confirm Password MissMatch...")
            }
            else -> {
                params["EmployeeId"] = session.employeeId.toString()
                params["RoleId"] = session.roleId.toString()
                params["Password"] = newPassword
                params["UserId"] = session.userId.toString()
                mainViewModel.changePasswordLogin(params)
            }
        }

    }

    private fun setOnClickListener() {
        with(binding) {

            confirmSubmit.setOnClickListener(this@ChangePasswordFragment)
        }
    }


    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.confirmSubmit -> {
                validateAndChangePassword()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        setObserver()
    }
}