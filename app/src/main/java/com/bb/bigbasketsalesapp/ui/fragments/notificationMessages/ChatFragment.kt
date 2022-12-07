package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.FragmentChatBinding
import com.bb.bigbasketsalesapp.databinding.FragmentNotificationListBinding
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.ChatAdapter
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.NotificationListAdapter
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatData
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeData
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.viewModel.ChatViewModel
import com.bb.bigbasketsalesapp.utils.*
import com.bumptech.glide.Glide
import com.doctorsplaza.app.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.atomic.AtomicInteger
import javax.inject.Inject
import kotlin.collections.ArrayList
import kotlin.math.absoluteValue

@AndroidEntryPoint
class ChatFragment : Fragment(R.layout.fragment_chat), View.OnClickListener {

    private lateinit var chatData: ChatData

    private var chatList: MutableList<ChatData> = ArrayList()
    private lateinit var binding: FragmentChatBinding

    @Inject
    lateinit var session: SessionManager

    private var currentView: View? = null

    @Inject
    lateinit var chatAdapter: ChatAdapter

    private val chatViewModel: ChatViewModel by viewModels()

    private lateinit var appLoader: AppLoader

    private var verticalScrollOffset = AtomicInteger(0)

    private var pageNo = 1

    private var searchKeyword = ""

    private lateinit var employeeData: EmployeeData

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (currentView == null) {
            currentView = inflater.inflate(R.layout.fragment_chat, container, false)
            binding = FragmentChatBinding.bind(currentView!!)
            init()
            setObserver()
            setRecyclerView()
            setOnClickListener()
        }
        return currentView!!
    }




    private fun init() {
        appLoader = AppLoader(requireContext())
    }


    private fun setObserver() {
        messageListItemData.observe(viewLifecycleOwner) {
            if (it != null) {
                employeeData = it
                chatViewModel.getChatList(
                    session.userId.toString(),
                    employeeData.Employee_Id.toString(),
                    employeeData.OrganisationId.toString()
                )
                setEmployeeData()

            }
        }

        chatViewModel.chatList.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    appLoader.dismiss()
                    if (response.data?.Output == "Success") {
                        if (response.data.List.isNotEmpty()) {
                            binding.noDataMsg.isVisible = false
                            if (pageNo == 1) chatList.clear()
                            chatList.addAll(response.data.List)
                            setChatRv(chatList)
                        } else {
                            binding.noDataMsg.isVisible = true

                        }
                    } else {
                        binding.noDataMsg.isVisible = true
                        binding.noDataMsg.text = "Some thing went wrong!!"
                        showToast(response.data?.Output.toString())
                    }
                }
                is Resource.Loading -> {
                    appLoader.show()
                }
                is Resource.Error -> {
                    appLoader.dismiss()
                    binding.noDataMsg.isVisible = true
                    binding.noDataMsg.text = "Some thing went wrong!!"
                }
            }
        }

        chatViewModel.sendMessage.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
//                    appLoader.dismiss()
                    if (response.data?.Output == "Success") {
                        binding.noDataMsg.isVisible = false
                        binding.sendingView.isVisible = false
                        if (chatList.isEmpty()) {
                            chatList.add(chatData)
                        } else {
                            chatList.add(chatAdapter.differ.currentList.size, chatData)

                        }
                        chatAdapter.differ.submitList(chatList)
                        if(chatList.size>1){
                            chatAdapter.notifyDataSetChanged()
                        }else{

                        chatAdapter.notifyItemInserted(chatAdapter.differ.currentList.size)
                        }

                        binding.chatRv.scrollToPosition(chatAdapter.differ.currentList.size - 1)
                        binding.messageEdt.setText("")
                    } else {
                        chatList.removeAt(0)
                        chatAdapter.differ.submitList(chatList)
                        chatAdapter.notifyItemInserted(0)
                        binding.sendingView.isVisible = false
                        showToast(response.data?.Output.toString())
                    }
                }
                is Resource.Loading -> {
//                    appLoader.show()
                }
                is Resource.Error -> {
//                    appLoader.dismiss()
                }
            }
        }
    }

    private fun setRecyclerView() {
        chatAdapter.differ.submitList(chatList)
        binding.chatRv.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext()).apply {
                stackFromEnd = true
            }
            isNestedScrollingEnabled = true
            scrollToPosition(chatAdapter.differ.currentList.size - 1)
            adapter = chatAdapter
            addOnScrollListener(scrollListener)
        }
    }

    private fun setEmployeeData() {
        with(binding) {
            userName.text = employeeData.EmployeeName
            if (employeeData.EmployeePhoto != null) {
                Glide.with(requireContext()).applyDefaultRequestOptions(noImage()).load(
                    getBase64Image(
                        employeeData.EmployeePhoto
                    )
                ).into(userImage)
            }
        }
    }

    private fun setChatRv(chatList: MutableList<ChatData>) {
        chatAdapter.differ.submitList(chatList)
        binding.chatRv.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext()).apply {
                stackFromEnd = true
            }
            isNestedScrollingEnabled = true
            scrollToPosition(chatAdapter.differ.currentList.size - 1)
            adapter = chatAdapter
            addOnScrollListener(scrollListener)
        }
            .addOnLayoutChangeListener { _, _, _, _, bottom, _, _, _, oldBottom ->
                val y = oldBottom - bottom
                if (y.absoluteValue > 0) {
                    binding.chatRv.post {
                        if (y > 0 || verticalScrollOffset.get().absoluteValue >= y.absoluteValue) {
                            binding.chatRv.scrollBy(chatAdapter.differ.currentList.size - 1, y)
                        } else {
                            binding.chatRv.scrollBy(
                                chatAdapter.differ.currentList.size - 1,
                                verticalScrollOffset.get()
                            )
                        }
                    }
                }
            }
    }


    var isLoading = false
    var isScrolling = false


    private val scrollListener = object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)
            if (dy > 0) {
                val recycleLayoutManager =
                    binding.chatRv.layoutManager as LinearLayoutManager
                if (!isLoading) {
                    if (recycleLayoutManager != null && recycleLayoutManager.findLastCompletelyVisibleItemPosition() == chatAdapter.itemCount - 2) {
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


    private fun sendNewMessage() {
        val message = binding.messageEdt.text.toString().trim()
        if (message.isEmpty()) {
            showToast("please type a valid message")
            return
        }
        val formatCurrentTime = SimpleDateFormat("hh:mma", Locale.getDefault())
        val currentTime = formatCurrentTime.format(Date())
        chatData = ChatData(
            1, "", 0, "", "", "", "", 0, message, currentTime, ""
        )

        chatViewModel.sendMessage(
            session.userId.toString(),
            employeeData.Employee_Id.toString(),
            employeeData.OrganisationId.toString(),
            message = message
        )

        /*chatList.add(chatData)
        chatAdapter.differ.submitList(chatList)
        chatAdapter.notifyItemInserted(0)
        binding.chatRv.scrollToPosition(chatAdapter.differ.currentList.size - 1)*/
        binding.messageEdt.setText("")
        binding.sendingView.isVisible = true


    }


    private fun setOnClickListener() {
        with(binding) {
            backArrow.setOnClickListener(this@ChatFragment)
            messageSend.setOnClickListener(this@ChatFragment)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.backArrow -> {
                messageListItemClicked.postValue(2)
            }
            R.id.messageSend -> {
                sendNewMessage()
            }
        }
    }
}
