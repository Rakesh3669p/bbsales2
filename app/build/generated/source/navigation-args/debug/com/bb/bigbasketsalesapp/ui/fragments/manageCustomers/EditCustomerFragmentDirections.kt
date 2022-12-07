package com.bb.bigbasketsalesapp.ui.fragments.manageCustomers

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.bb.bigbasketsalesapp.R

public class EditCustomerFragmentDirections private constructor() {
  public companion object {
    public fun actionEditCustomerFragmentToCustomersListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_editCustomerFragment_to_customersListFragment)
  }
}
