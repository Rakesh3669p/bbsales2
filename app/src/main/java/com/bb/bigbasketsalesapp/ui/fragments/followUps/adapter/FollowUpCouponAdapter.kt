package com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.core.view.isVisible
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.ItemAddFollowupCouponsBinding
import com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferData
import javax.inject.Inject

class FollowUpCouponAdapter @Inject constructor() :
    RecyclerView.Adapter<FollowUpCouponAdapter.ViewHolder>() {
    private lateinit var context: Context

    inner class ViewHolder(private val binding: ItemAddFollowupCouponsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: OfferData) {
            with(binding) {
                offerPercentLbl.text = data.cpn_title
                offerValidLbl.text = "Valid Until: ${data.valid_to}"

                if (adapterPosition % 2 == 0) {
                    topColorView.background = getDrawable(
                        context,
                        R.drawable.top_radius_blue
                    )
                } else {
                    topColorView.background = getDrawable(
                        context,
                        R.drawable.top_radius_red
                    )
                }


                if (data.isApplied) {
                    applyStatus.text = "Applied"
                    removeLbl.isVisible = true
                } else {
                    data.isApplied = false
                    applyStatus.text = "Apply"
                    removeLbl.isVisible = false
                }

                removeLbl.setOnClickListener {
                    removeCouponClickListener?.let {
                        it(data,adapterPosition)
                    }
                }

                applyStatus.setOnClickListener {
                    applyCouponClickListener?.let {
                        it(data, adapterPosition)
                    }
                }
            }
        }
    }

    private val diffUtil = object : DiffUtil.ItemCallback<OfferData>() {
        override fun areItemsTheSame(oldItem: OfferData, newItem: OfferData): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: OfferData, newItem: OfferData): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

    }
    val differ = AsyncListDiffer(this, diffUtil)

    private var applyCouponClickListener: ((data: OfferData, position: Int) -> Unit)? = null
    private var removeCouponClickListener: ((data: OfferData, position: Int) -> Unit)? = null

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FollowUpCouponAdapter.ViewHolder {
        context = parent.context
        return ViewHolder(
            ItemAddFollowupCouponsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: FollowUpCouponAdapter.ViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }

    override fun getItemCount(): Int = differ.currentList.size

    fun setOnApplyClickListener(listener: (data: OfferData, position: Int) -> Unit) {
        applyCouponClickListener = listener
    }

    fun setOnRemoveCouponClickListener(listener: (data: OfferData, position: Int) -> Unit) {
        removeCouponClickListener = listener
    }
}