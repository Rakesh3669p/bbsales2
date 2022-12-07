package com.bb.bigbasketsalesapp.ui.fragments.offers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bb.bigbasketsalesapp.databinding.ItemOfferBinding
import com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferData
import com.bb.bigbasketsalesapp.utils.noImage
import com.bumptech.glide.Glide
import javax.inject.Inject

class OffersAdapter @Inject constructor() : RecyclerView.Adapter<OffersAdapter.ViewHolder>() {
    private lateinit var context: Context

    inner class ViewHolder(private val binding: ItemOfferBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: OfferData) {
            with(binding) {
                Glide.with(context).applyDefaultRequestOptions(noImage())
                    .load(data.image).into(offerImage)
            }
        }
    }

    private val diffUtil = object : DiffUtil.ItemCallback<OfferData>() {
        override fun areItemsTheSame(oldItem: OfferData, newItem: OfferData): Boolean {
            return oldItem.coupon_id == newItem.coupon_id
        }

        override fun areContentsTheSame(oldItem: OfferData, newItem: OfferData): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    }

    val differ = AsyncListDiffer(this, diffUtil)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OffersAdapter.ViewHolder {
        context = parent.context
        return ViewHolder(
            ItemOfferBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: OffersAdapter.ViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }

    override fun getItemCount(): Int = differ.currentList.size
}