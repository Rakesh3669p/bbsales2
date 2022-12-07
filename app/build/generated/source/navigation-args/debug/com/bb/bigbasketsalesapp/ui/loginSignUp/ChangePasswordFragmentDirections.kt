package com.bb.bigbasketsalesapp.ui.loginSignUp

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bb.bigbasketsalesapp.R

public class ChangePasswordFragmentDirections private constructor() {
  public companion object {
    public fun actionChangePasswordFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_changePasswordFragment_to_loginFragment)
  }
}
