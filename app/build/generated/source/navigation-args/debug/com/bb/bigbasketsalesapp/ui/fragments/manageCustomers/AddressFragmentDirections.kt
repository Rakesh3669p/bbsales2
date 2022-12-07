package com.bb.bigbasketsalesapp.ui.fragments.manageCustomers

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bb.bigbasketsalesapp.R

public class AddressFragmentDirections private constructor() {
  public companion object {
    public fun actionAddressFragmentToAddCustomerFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_addressFragment_to_addCustomerFragment)
  }
}
