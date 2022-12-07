package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.ChatFragment
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.MessageListFragment
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.NotificationListFragment


class NotificationMessageAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> NotificationListFragment()
            1 -> MessageListFragment()
            2 -> ChatFragment()
            else -> {
                NotificationListFragment()
            }
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}