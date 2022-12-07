package com.bb.bigbasketsalesapp.ui.loginSignUp

import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.ActivityLoginSignupBinding
import com.bb.bigbasketsalesapp.ui.MainActivity
import com.bb.bigbasketsalesapp.ui.viewModel.LoginViewModel
import com.bb.bigbasketsalesapp.utils.DownloadLoader
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.showToast
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
class LoginSignupActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginSignupBinding

    private lateinit var navController: NavController

    private val loginViewModel: LoginViewModel by viewModels()

    @Inject
    lateinit var session: SessionManager

    lateinit var downloadLoader:DownloadLoader

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginSignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        downloadLoader = DownloadLoader(this)

        navController = findNavController(R.id.navHostLoginFragment)

        if (Locale.getDefault().language == "ar") {
            loginViewModel.downloadlang()
        }

        if (session.isLogin) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        loginViewModel.downloadLanguage.observe(this) { response ->
            when (response) {
                is Resource.Success -> {
                    downloadLoader.dismiss()
                }

                is Resource.Loading -> {
                    downloadLoader.show()
                }

                is Resource.Error -> {
                    downloadLoader.dismiss()
                    showToast(response.message.toString())
                }
            }
        }
    }
}