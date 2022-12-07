package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentNotificationListBinding
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.NotificationListAdapter
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.NotificationData
import com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel
import com.bb.bigbasketsalesapp.utils.AppLoader
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.notificationCount
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class NotificationListFragment : Fragment(R.layout.fragment_notification_list) {

    private lateinit var binding: FragmentNotificationListBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    @Inject
    lateinit var notificationListAdapter: NotificationListAdapter

    private lateinit var appLoader: AppLoader
    private val mainViewModel:MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_notification_list, container, false)
            binding = FragmentNotificationListBinding.bind(currentView!!)
            init()
            setObserver()
            setOnClickListener()
        }
        return currentView!!
    }


    private fun init() {
        appLoader = AppLoader(requireContext())
        mainViewModel.notifications()
    }

    private fun setObserver() {
        mainViewModel.notifications.observe(viewLifecycleOwner){response->
            when(response){
                is Resource.Success->{
                    appLoader.dismiss()
                    if(response.data!!.Output == "Success"){
                        setNotificationRv(response.data.List)
                        notificationCount.postValue(response.data.List.size)
                    }else{
                        notificationCount.postValue(0)
                    }
                }
                is Resource.Loading->{
                    appLoader.show()
                }
                is Resource.Error->{
                    notificationCount.postValue(0)
                    appLoader.dismiss()
                }
            }
        }
    }

    private fun setNotificationRv(notificationList: List<NotificationData>) {
        notificationListAdapter.differ.submitList(notificationList)
        binding.notificationRv.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = notificationListAdapter
        }
        notificationListAdapter.notifyDataSetChanged()
    }

    private fun setOnClickListener() {
        notificationListAdapter.setOnNotificationClickListener {
            findNavController().navigate(R.id.targetVsSalesFragment)
        }
    }
}