package com.bb.bigbasketsalesapp.ui.fragments.followUps

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bb.bigbasketsalesapp.R

public class AddFollowUpsFragmentDirections private constructor() {
  public companion object {
    public fun actionAddFollowUpsFragmentToFollowUpListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_addFollowUpsFragment_to_followUpListFragment)
  }
}
