package com.bb.bigbasketsalesapp.ui.fragments.revenue.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bb.bigbasketsalesapp.databinding.ItemOffersBinding
import com.bb.bigbasketsalesapp.databinding.ItemRevenueBinding
import com.bb.bigbasketsalesapp.ui.fragments.revenue.model.RevenueData
import javax.inject.Inject
import kotlin.math.roundToInt

class RevenueAdapter @Inject constructor(): RecyclerView.Adapter<RevenueAdapter.ViewHolder>() {
    private lateinit var  context: Context

    inner class  ViewHolder(private val itemRevenueBinding: ItemRevenueBinding): RecyclerView.ViewHolder(itemRevenueBinding.root){
        fun bind(data: RevenueData) {
            with(itemRevenueBinding){
                revenueName.text = data.customer_name
                revenueCode.text = "#${data.crm_unique_id}"
                revenueCity.text = data.city.toString()
                revenueAmount.text = "${data.grand_total.roundToInt()} SAR"
            }
        }
    }

    private val diffUtil = object : DiffUtil.ItemCallback<RevenueData>(){
        override fun areItemsTheSame(oldItem: RevenueData, newItem: RevenueData): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: RevenueData, newItem: RevenueData): Boolean {
            return oldItem == newItem
        }

    }
    val differ = AsyncListDiffer(this,diffUtil)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RevenueAdapter.ViewHolder {
        context = parent.context
        return ViewHolder(ItemRevenueBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RevenueAdapter.ViewHolder, position: Int) {
         holder.bind(differ.currentList[position])
    }

    override fun getItemCount(): Int = differ.currentList.size
}