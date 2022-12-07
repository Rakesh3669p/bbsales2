package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bb.bigbasketsalesapp.databinding.ItemChatUsersBinding
import javax.inject.Inject

class ChatListAdapter @Inject constructor(): RecyclerView.Adapter<ChatListAdapter.ViewHolder>() {
    private lateinit var  context: Context

    inner class  ViewHolder(private val itemChatUsersBinding: ItemChatUsersBinding): RecyclerView.ViewHolder(itemChatUsersBinding.root){
        fun bind(data: String) {
            with(itemChatUsersBinding){
                root.setOnClickListener {
                    chatClickListener?.let {
                        it(data)
                    }
                }
            }
        }
    }

    private val diffUtil = object : DiffUtil.ItemCallback<String>(){
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

    }
    val differ = AsyncListDiffer(this,diffUtil)

        private var chatClickListener: ((data: String) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatListAdapter.ViewHolder {
        context = parent.context
        return ViewHolder(ItemChatUsersBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ChatListAdapter.ViewHolder, position: Int) {
        // holder.bind(differ.currentList[position])
    }

    override fun getItemCount(): Int = 10

    fun setOnChatClickListener(listener: (activePackData: String) -> Unit) {
        chatClickListener = listener
    }
}