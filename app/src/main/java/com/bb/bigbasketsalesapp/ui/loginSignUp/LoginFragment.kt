package com.bb.bigbasketsalesapp.ui.loginSignUp

import com.bb.bigbasketsalesapp.utils.AppLoader
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentLoginBinding
import com.bb.bigbasketsalesapp.ui.MainActivity
import com.bb.bigbasketsalesapp.ui.viewModel.LoginViewModel
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.showToast
import com.doctorsplaza.app.utils.Resource
import com.google.gson.JsonObject
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment : Fragment(R.layout.fragment_login), View.OnClickListener {

    private lateinit var binding: FragmentLoginBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    private val loginViewModel: LoginViewModel by viewModels()

    lateinit var appLoader: AppLoader



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_login, container, false)
            binding = FragmentLoginBinding.bind(currentView!!)
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
        loginViewModel.login.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.Output == "Success") {
                        session.apply {
                            isLogin = true
                            userId = response.data.Data.User_Id
                            userLogId = response.data.Data.UserLogId
                            divisionId = response.data.Data.Division_Id
                            organisationId = response.data.Data.Organization_Id
                            employeeId = response.data.Data.EmployeeID
                            branchId = response.data.Data.Branch_Id
                        }
                        startActivity(Intent(requireActivity(), MainActivity::class.java))
                        requireActivity().finish()
                    } else {
                        requireContext().showToast(response.data?.Output.toString())
                    }
                }
                is Resource.Loading -> {
                    appLoader.show()
                }
                is Resource.Error -> {
                    appLoader.dismiss()
                    requireContext().showToast(response.message.toString())
                }
            }
        }
    }


    private fun setOnClickListener() {
        with(binding) {
            loginSubmit.setOnClickListener(this@LoginFragment)
            forgotPasswordLbl.setOnClickListener(this@LoginFragment)
        }
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.loginSubmit -> {
                validateAndLogin()

            }
            R.id.forgotPasswordLbl -> {
                findNavController().navigate(R.id.forgotPasswordFragment)
            }
        }
    }

    private fun validateAndLogin() {

        val userName = binding.userNameEdt.text.toString()
        val password = binding.passwordEdt.text.toString()

        when {
            userName.isEmpty() -> {
                requireContext().showToast("Please enter a valid User Name")
            }
            password.isEmpty() -> {
                requireContext().showToast("Please enter a valid password")
            }
            else -> {
                val jsonObject = JsonObject()
                jsonObject.addProperty("UserName", userName)
                jsonObject.addProperty("Password", password)
                loginViewModel.setLogin(jsonObject)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        setObserver()
    }
}