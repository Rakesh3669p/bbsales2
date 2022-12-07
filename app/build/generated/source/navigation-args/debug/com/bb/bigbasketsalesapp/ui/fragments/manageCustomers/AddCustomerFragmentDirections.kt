package com.bb.bigbasketsalesapp.ui.fragments.manageCustomers

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bb.bigbasketsalesapp.R

public class AddCustomerFragmentDirections private constructor() {
  public companion object {
    public fun actionAddCustomerFragmentToCustomersListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_addCustomerFragment_to_customersListFragment)

    public fun actionAddCustomerFragmentToCustomersListFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_addCustomerFragment_to_customersListFragment2)
  }
}
