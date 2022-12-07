package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bb.bigbasketsalesapp.databinding.ItemNotificationsBinding
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeData
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.NotificationData
import javax.inject.Inject

class NotificationListAdapter @Inject constructor(): RecyclerView.Adapter<NotificationListAdapter.ViewHolder>() {
    private lateinit var  context: Context

    inner class  ViewHolder(private val itemNotificationsBinding:  ItemNotificationsBinding): RecyclerView.ViewHolder(itemNotificationsBinding.root){
        fun bind(data: NotificationData) {
            with(itemNotificationsBinding){
                notificationTitle.text = data.ActivityType
                notificationDesc.text = data.SubType
                notificationDate.text = data.CreatedDate
                root.setOnClickListener {
                    if(data.ActivityType.lowercase() == "target"){
                        notificationClickListener?.let {
                            it(data)
                        }
                    }
                }
            }
        }
    }

    private val diffUtil = object : DiffUtil.ItemCallback<NotificationData>(){
        override fun areItemsTheSame(oldItem: NotificationData, newItem: NotificationData): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: NotificationData, newItem: NotificationData): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

    }
    val differ = AsyncListDiffer(this,diffUtil)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationListAdapter.ViewHolder {
        context = parent.context
        return ViewHolder(ItemNotificationsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    private var notificationClickListener: ((data: NotificationData) -> Unit)? = null
    override fun onBindViewHolder(holder: NotificationListAdapter.ViewHolder, position: Int) {
         holder.bind(differ.currentList[position])
    }

    override fun getItemCount(): Int = differ.currentList.size

    fun setOnNotificationClickListener(listener: (activePackData: NotificationData) -> Unit) {
        notificationClickListener = listener
    }
}