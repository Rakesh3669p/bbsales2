package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentMessageListBinding
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.ChatListAdapter
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.MessagesListAdapter
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeData
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.viewModel.ChatViewModel
import com.bb.bigbasketsalesapp.utils.*
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MessageListFragment : Fragment(R.layout.fragment_message_list), View.OnClickListener {

    private var employeeList: MutableList<EmployeeData> = ArrayList()

    private lateinit var binding: FragmentMessageListBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    @Inject
    lateinit var chatListAdapter: ChatListAdapter

    @Inject
    lateinit var messageListAdapter: MessagesListAdapter

    private val chatViewModel: ChatViewModel by viewModels()

    private lateinit var appLoader: AppLoader

    private var pageNo = 1
    private var searchKeyword = ""


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_message_list, container, false)
            binding = FragmentMessageListBinding.bind(currentView!!)
            init()
            setObserver()
            setAdapterClickListener()
            setOnClickListener()
        }
        return currentView!!
    }

    private fun init() {
        appLoader = AppLoader(requireContext())
        chatViewModel.getEmployeeList(pageNo = pageNo.toString(), searchKeyword)
    }


    private fun setObserver() {


        chatViewModel.employeeList.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.Output == "Success") {
                        if (response.data.List.isNotEmpty()) {
                            binding.noDataMsg.isVisible = false
                            binding.messagesListRv.isVisible =true
                            if (pageNo == 1) employeeList.clear()
                            employeeList.addAll(response.data.List)
                            if(pageNo==1){
                            setEmployeeRv(employeeList)
                            }else{
                                messageListAdapter.differ.submitList(employeeList)
                            }
                        } else {
                            binding.messagesListRv.isVisible =false
                            binding.noDataMsg.isVisible = true
                        }
                    } else {
                        showToast(response.data?.Output.toString())
                    }
                }
                is Resource.Loading -> {
                    appLoader.show()
                }
                is Resource.Error -> {
                    appLoader.dismiss()
                }
            }
        }
    }


    private fun setEmployeeRv(employeeList: MutableList<EmployeeData>) {
        messageListAdapter.differ.submitList(employeeList)
        binding.messagesListRv.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext())
            adapter = messageListAdapter
        }.addOnScrollListener(scrollListener)
    }


    var isLoading = false
    var isScrolling = false


    private val scrollListener = object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)
            if (dy > 0) {
                val recycleLayoutManager =
                    binding.messagesListRv.layoutManager as LinearLayoutManager
                if (!isLoading) {
                    if (recycleLayoutManager != null && recycleLayoutManager.findLastCompletelyVisibleItemPosition() == messageListAdapter.itemCount - 2) {
                        pageNo++
                        chatViewModel.getEmployeeList(pageNo.toString(), searchKeyword)
                        isLoading = true
                    }
                }
            }
        }

        override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
            if (newState == AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL) {
                isScrolling = true
            }
        }
    }

    private fun setOnClickListener() {

        with(binding) {
            search.doOnTextChanged { text, start, before, count ->
                if (text?.length!! > 2) {
                    pageNo = 1
                    searchKeyword = text.toString().trim()
                    chatViewModel.getEmployeeList(pageNo = pageNo.toString(), searchKeyword)
                } else if (text.toString().isEmpty()) {
                    pageNo = 1
                    searchKeyword = text.toString().trim()
                    chatViewModel.getEmployeeList(pageNo = pageNo.toString(), searchKeyword)
                }
            }
        }
    }


    private fun setAdapterClickListener() {
        messageListAdapter.setOnChatClickListener {
            messageListItemClicked.postValue(1)
            messageListItemData.postValue(it)
        }
    }
    override fun onClick(v: View?) {
        when (v?.id) {

        }
    }

}