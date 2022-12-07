package com.bb.bigbasketsalesapp.ui.loginSignUp

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bb.bigbasketsalesapp.R

public class ForgotPasswordFragmentDirections private constructor() {
  public companion object {
    public fun actionForgotPasswordFragmentToHiltOTPFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_forgotPasswordFragment_to_hilt_OTPFragment)
  }
}
