package com.bb.bigbasketsalesapp.ui.fragments.changePasswordLogin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentChangePasswordLoginBinding
import com.bb.bigbasketsalesapp.databinding.FragmentProfileBinding
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.AppLoader
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.params
import com.bb.bigbasketsalesapp.utils.showToast
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ChangePasswordLogin : Fragment(R.layout.fragment_change_password_login),
    View.OnClickListener {

    private lateinit var binding: FragmentChangePasswordLoginBinding

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
            currentView =
                inflater.inflate(R.layout.fragment_change_password_login, container, false)
            binding = FragmentChangePasswordLoginBinding.bind(currentView!!)
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
                        requireContext().showToast("Your Password has Changed Successfully...")
                        findNavController().popBackStack()
                    } else {
                        requireContext().showToast(response.data?.Output.toString())
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


    private fun setOnClickListener() {
        with(binding) {
            backArrow.setOnClickListener(this@ChangePasswordLogin)
            updatePassword.setOnClickListener(this@ChangePasswordLogin)
        }
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.backArrow -> {
                findNavController().popBackStack()
            }

            R.id.updatePassword -> {
                validateAndChangePassword()
            }
        }
    }

    private fun validateAndChangePassword() {
        val oldPassword = binding.currentPassword.text.toString()
        val newPassword = binding.newPassword.text.toString()
        val confirmPassword = binding.confirmPassword.text.toString()

        when {
            oldPassword == newPassword -> {
                requireContext().showToast("New Password and Old Password Cannot be Same")
            }
            newPassword != confirmPassword -> {
                requireContext().showToast("New Password and Confirm Password MissMatch...")
            }
            else -> {

                params["EmployeeId"] = session.employeeId.toString()
                params["RoleId"] = session.roleId.toString()
                params["Password"] = confirmPassword
                params["UserId"] = session.userId.toString()
                mainViewModel.changePasswordLogin(params)
            }
        }

    }

}