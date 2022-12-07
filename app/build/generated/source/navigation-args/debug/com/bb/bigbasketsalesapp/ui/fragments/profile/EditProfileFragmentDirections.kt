package com.bb.bigbasketsalesapp.ui.fragments.profile

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bb.bigbasketsalesapp.R

public class EditProfileFragmentDirections private constructor() {
  public companion object {
    public fun actionEditProfileFragmentToProfileFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_editProfileFragment_to_profileFragment)
  }
}
