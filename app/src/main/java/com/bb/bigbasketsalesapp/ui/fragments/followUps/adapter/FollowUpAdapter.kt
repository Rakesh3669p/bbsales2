package com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bb.bigbasketsalesapp.databinding.ItemFollowUpsBinding
import com.bb.bigbasketsalesapp.ui.fragments.followUps.model.Follow
import javax.inject.Inject

class FollowUpAdapter @Inject constructor(): RecyclerView.Adapter<FollowUpAdapter.ViewHolder>() {
    private lateinit var  context: Context

    inner class  ViewHolder(private val itemFollowUpsBinding: ItemFollowUpsBinding): RecyclerView.ViewHolder(itemFollowUpsBinding.root){
        fun bind(data: Follow) {
            with(itemFollowUpsBinding){
                followUpDate.text = data.FollowupDate
                followUpTime.text = data.FollowupTime
                followUpTitle.text = data.FollowStatus
            }
        }
    }

    private val diffUtil = object : DiffUtil.ItemCallback<Follow>(){
        override fun areItemsTheSame(oldItem: Follow, newItem: Follow): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Follow, newItem: Follow): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

    }
    val differ = AsyncListDiffer(this,diffUtil)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowUpAdapter.ViewHolder {
        context = parent.context
        return ViewHolder(ItemFollowUpsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: FollowUpAdapter.ViewHolder, position: Int) {
         holder.bind(differ.currentList[position])
    }

    override fun getItemCount(): Int = differ.currentList.size
}