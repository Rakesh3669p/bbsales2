package com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.BasicDetailsFormFragment
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.BusinessDetailsFormFragment
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.CustomerData


class EditCustomerFormAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    val data: CustomerData
) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> BasicDetailsFormFragment(data)
            1 -> BusinessDetailsFormFragment(data)

            else -> {
                BasicDetailsFormFragment(data)
            }
        }
    }

    override fun getItemCount(): Int {
        return 2
    }


}