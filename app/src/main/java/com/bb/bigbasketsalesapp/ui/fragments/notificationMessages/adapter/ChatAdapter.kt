package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter

import android.content.Context
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.LeftChatBinding
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatData
import com.bb.bigbasketsalesapp.utils.getBase64Image
import com.bb.bigbasketsalesapp.utils.noImage
import com.bumptech.glide.Glide
import java.lang.Exception
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


class ChatAdapter @Inject constructor() : RecyclerView.Adapter<ChatAdapter.ViewHolder>() {
    private lateinit var context: Context
    private val TYPE_MESSAGE_SENT = 0
    private val TYPE_MESSAGE_RECEIVED = 1

    private val dateFormat: DateFormat = SimpleDateFormat("MMM dd yyyy hh:mma")
    private val simpleDateFormat: DateFormat = SimpleDateFormat("hh:mm:a | dd/MM/yyyy | EEE")
    var lastDate: String = ""
    var currentDate: String = ""

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v)

    private val diffUtil = object : DiffUtil.ItemCallback<ChatData>() {
        override fun areItemsTheSame(oldItem: ChatData, newItem: ChatData): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: ChatData, newItem: ChatData): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

    }
    val differ = AsyncListDiffer(this, diffUtil)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatAdapter.ViewHolder {
        context = parent.context
        return if (viewType == TYPE_MESSAGE_RECEIVED) {
            ViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.left_chat,
                    parent,
                    false
                )
            )
        } else {
            ViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.right_chat,
                    parent,
                    false
                )
            )
        }
    }

    override fun onBindViewHolder(holder: ChatAdapter.ViewHolder, position: Int) {
        val model = differ.currentList[position]
        holder.itemView.apply {

            when (getItemViewType(position)) {
                TYPE_MESSAGE_SENT -> {
//                    if(model.SenderMessageTime.isNotEmpty()){
//                        val date: Date = dateFormat.parse(model.SenderMessageTime)
//                        lastDate = simpleDateFormat.format(date)
//                        if (differ.currentList.size - 1 != position) {
//                            if (differ.currentList[position + 1].SenderMessageTime.isNotEmpty()) {
//                                val previousdate: Date =
//                                    dateFormat.parse(differ.currentList[position + 1].SenderMessageTime)
//                                val latestdate: Date = dateFormat.parse(model.SenderMessageTime)
//                                lastDate = simpleDateFormat.format(previousdate).toString()
//                                currentDate = simpleDateFormat.format(latestdate).toString()
//                            }
//
//
//                            if (lastDate != currentDate) {
//                                findViewById<TextView>(R.id.rightChatDateTime).visibility = View.VISIBLE
//                                findViewById<TextView>(R.id.rightChatDateTime).text = currentDate
//                            } else {
//                                findViewById<TextView>(R.id.rightChatDateTime).visibility = View.GONE
//                            }
//
//                        } else {
//                            val latestdate: Date = dateFormat.parse(model.SenderMessageTime)
//                            lastDate = simpleDateFormat.format(latestdate).toString()
//                            findViewById<TextView>(R.id.rightChatDateTime).visibility = View.VISIBLE
//                            findViewById<TextView>(R.id.rightChatDateTime).text = lastDate
//                        }
//                    }
//                    findViewById<TextView>(R.id.rightChatDateTime).text = model.SenderMessageTime


                    findViewById<TextView>(R.id.rightChatText).text = model.SenderMessage
                    findViewById<TextView>(R.id.messageTime).text = model.SenderMessageTime

                }

                else->{
                findViewById<TextView>(R.id.leftChatText).text = model.ReceiverMessage
                    findViewById<TextView>(R.id.messageTime).text = model.ReceiverMessageTime
                Glide.with(context).setDefaultRequestOptions(noImage()).load(getBase64Image(model.ReceiverPhoto)).into(findViewById(R.id.leftChatImage))
                }
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (differ.currentList[position].MessageIdentifier) {
            1 -> {
                TYPE_MESSAGE_SENT
            }
            2 -> {
                TYPE_MESSAGE_RECEIVED
            }
            else -> {
                0
            }
        }
    }


    override fun getItemCount(): Int = differ.currentList.size


}