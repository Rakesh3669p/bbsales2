package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentNotificationsMessagesBinding
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.NotificationMessageAdapter
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.viewModel.ChatViewModel
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.messageListItemClicked
import com.bb.bigbasketsalesapp.utils.notificationCount
import com.google.android.material.tabs.TabLayout
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class NotificationsMessagesFragment : Fragment(R.layout.fragment_notifications_messages),
    View.OnClickListener {

    private lateinit var binding: FragmentNotificationsMessagesBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    private val chatViewModel: ChatViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView =
                inflater.inflate(R.layout.fragment_notifications_messages, container, false)
            binding = FragmentNotificationsMessagesBinding.bind(currentView!!)
            setTabLayoutAndViewPager()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun setTabLayoutAndViewPager() {
        val fragmentManager = childFragmentManager
        val notificationMessageAdapter = NotificationMessageAdapter(fragmentManager, lifecycle)
        binding.viewPager.adapter = notificationMessageAdapter
        binding.viewPager.isUserInputEnabled = false
        binding.viewPager.isSaveEnabled = false

        binding.viewPager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                if (position == 0) {
                    binding.notificationView.background = ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.left_corner_blue_radius
                    )
                    binding.notificationsLbl.setTextColor(getColor(requireContext(), R.color.white))

                    binding.messagesView.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.right_corner_radius)
                    binding.messagesViewLbl.setTextColor(getColor(requireContext(), R.color.blue))
                } else if (position == 1) {

                    binding.notificationView.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.left_corner_radius)
                    binding.notificationsLbl.setTextColor(getColor(requireContext(), R.color.blue))

                    binding.messagesView.background = ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.right_corner_blue_radius
                    )
                    binding.messagesViewLbl.setTextColor(getColor(requireContext(), R.color.white))
                }
            }
        })

    }

    private fun setObserver() {
        messageListItemClicked.observe(viewLifecycleOwner) {
            if (it == 1) {
                binding.viewPager.currentItem = 3
                messageListItemClicked.postValue(0)
            } else if (it == 2) {
                binding.viewPager.currentItem = 1
                messageListItemClicked.postValue(0)
            }
        }

        if (session.notificationCount <= 0) {
            binding.notificationsCount.isVisible = false
        } else {
            binding.notificationsCount.isVisible = true
            binding.notificationsCount.text = session.notificationCount.toString()
        }

        if (session.messageCount <= 0) {
            binding.messagesViewCount.isVisible = false
        } else {
            binding.messagesViewCount.isVisible = true
            binding.messagesViewCount.text = session.messageCount.toString()
        }
    }




    private fun setOnClickListener() {
        with(binding) {
            notificationView.setOnClickListener(this@NotificationsMessagesFragment)
            messagesView.setOnClickListener(this@NotificationsMessagesFragment)
            backArrow.setOnClickListener(this@NotificationsMessagesFragment)
        }
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.messagesView -> {
                binding.viewPager.currentItem = 1
            }
            R.id.notificationView -> {
                binding.viewPager.currentItem = 0
            }
            R.id.backArrow -> {
                findNavController().popBackStack()
            }
        }
    }
}