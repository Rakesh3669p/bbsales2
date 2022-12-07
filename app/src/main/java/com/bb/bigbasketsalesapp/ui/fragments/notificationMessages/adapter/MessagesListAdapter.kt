package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter

import android.content.Context
import android.util.Base64
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bb.bigbasketsalesapp.databinding.ItemMessageListBinding
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeData
import com.bb.bigbasketsalesapp.utils.noImage
import com.bumptech.glide.Glide
import java.lang.Exception
import javax.inject.Inject

class MessagesListAdapter @Inject constructor() :
    RecyclerView.Adapter<MessagesListAdapter.ViewHolder>() {
    private lateinit var context: Context

    inner class ViewHolder(private val itemMessagesListBinding: ItemMessageListBinding) :
        RecyclerView.ViewHolder(itemMessagesListBinding.root) {
        fun bind(data: EmployeeData) {
            with(itemMessagesListBinding) {

                val imageByteArray = try {
                    if (data.EmployeePhoto != null) {
                        Base64.decode(data.EmployeePhoto, Base64.DEFAULT)
                    } else {
                        Base64.decode("", Base64.DEFAULT)
                    }
                } catch (e: Exception) {
                    null
                }
                Glide.with(context).applyDefaultRequestOptions(noImage()).load(imageByteArray)
                    .into(chatImage)

                chatName.text = data.EmployeeName
                if (data.ChatDetails != null) {
                    chatDesc.text = data.ChatDetails.LastMessage
                    messagesCount.text = data.ChatDetails.LastUnreadChatCount.toString()
                    chatDate.text = data.ChatDetails.LastMessageDate

                    chatDesc.isVisible = true
                    messagesCount.isVisible = true
                    chatDate.isVisible = true

                } else {
                    chatDesc.isVisible = false
                    messagesCount.isVisible = false
                    chatDate.isVisible = false
                }
                root.setOnClickListener {

                    chatClickListener?.let {
                        it(data)
                    }
                }
            }
        }
    }

    private val diffUtil = object : DiffUtil.ItemCallback<EmployeeData>() {
        override fun areItemsTheSame(oldItem: EmployeeData, newItem: EmployeeData): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: EmployeeData, newItem: EmployeeData): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

    }
    val differ = AsyncListDiffer(this, diffUtil)

    private var chatClickListener: ((data: EmployeeData) -> Unit)? = null


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MessagesListAdapter.ViewHolder {
        context = parent.context
        return ViewHolder(
            ItemMessageListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MessagesListAdapter.ViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }


    override fun getItemCount(): Int = differ.currentList.size

    fun setOnChatClickListener(listener: (activePackData: EmployeeData) -> Unit) {
        chatClickListener = listener
    }
}