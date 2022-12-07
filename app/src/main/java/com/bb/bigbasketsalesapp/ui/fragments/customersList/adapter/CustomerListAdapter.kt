package com.bb.bigbasketsalesapp.ui.fragments.customersList.adapter

import android.content.Context
import android.util.Base64
import android.view.*
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.TextView
import androidx.core.widget.PopupWindowCompat
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.ItemCutomersBinding
import com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData
import com.bb.bigbasketsalesapp.utils.noImage
import com.bumptech.glide.Glide
import javax.inject.Inject

class CustomerListAdapter @Inject constructor(): RecyclerView.Adapter<CustomerListAdapter.ViewHolder>() {
    private lateinit var  context: Context

    inner class  ViewHolder(private val itemCustomerBinding: ItemCutomersBinding): RecyclerView.ViewHolder(itemCustomerBinding.root){
        fun bind(data: CustomerData) {
            with(itemCustomerBinding){

                val imageByteArray: ByteArray = if(data.CustomerPhoto!=null) {
                    Base64.decode(data.CustomerPhoto, Base64.DEFAULT)
                }else {
                    Base64.decode("", Base64.DEFAULT)
                }

                Glide.with(context).applyDefaultRequestOptions(noImage()).load(imageByteArray).into(revenueImage)
                revenueName.text = data.CustomerName
                revenueCity.text = data.City
                revenueCode.text = "#${data.CustomerCode}"
                moreIcon.setOnClickListener { showMenuPopUp(itemCustomerBinding,data,adapterPosition) }
            }
        }
    }

    private val diffUtil = object : DiffUtil.ItemCallback<CustomerData>(){
        override fun areItemsTheSame(oldItem: CustomerData, newItem: CustomerData): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: CustomerData, newItem: CustomerData): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

    }
    val differ = AsyncListDiffer(this,diffUtil)

    private var followUpClickListener: ((data: CustomerData) -> Unit)? = null

    private var editCustomerClickListener: ((data: CustomerData) -> Unit)? = null

    private var deleteCustomerClickListener: ((data: CustomerData,position:Int) -> Unit)? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomerListAdapter.ViewHolder {
        context = parent.context
        return ViewHolder(ItemCutomersBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: CustomerListAdapter.ViewHolder, position: Int) {
         holder.bind(differ.currentList[position])
    }

    override fun getItemCount(): Int =differ.currentList.size

    private fun showMenuPopUp(
        binding: ItemCutomersBinding,
        data: CustomerData,
        adapterPosition: Int
    ) {


        val anchor = binding.moreIcon
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val popupView = inflater.inflate(R.layout.customer_pop_up, null)

        val popupWindow = PopupWindow(
            popupView, LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT, true
        )
        popupWindow.elevation = 10f

        PopupWindowCompat.showAsDropDown(popupWindow, anchor, -220, -25, Gravity.END)
        PopupWindowCompat.setWindowLayoutType(
            popupWindow,
            WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
        )

        val editCustomer = popupView.findViewById<TextView>(R.id.editCustomer)
        val followUpVisit = popupView.findViewById<TextView>(R.id.followUpVisit)
        val deleteCustomer = popupView.findViewById<TextView>(R.id.deleteCustomer)
        editCustomer.setOnClickListener {
            editCustomerClickListener?.let {
                it(data)
            }
            popupWindow.dismiss()
        }

        followUpVisit.setOnClickListener {
            followUpClickListener?.let {
                it(data)
            }
            popupWindow.dismiss()
        }

        deleteCustomer.setOnClickListener {
            deleteCustomerClickListener?.let {
                it(data,adapterPosition)
            }
            popupWindow.dismiss()
        }
    }

    fun setOnEditCustomerClickListener(listener: (data: CustomerData) -> Unit) {
        editCustomerClickListener = listener
    }

    fun setOnfollowUpClickListener(listener: (data: CustomerData) -> Unit) {
        followUpClickListener = listener
    }

    fun setOnDeleteCustomerClickListener(listener: (data: CustomerData,position:Int) -> Unit) {
        deleteCustomerClickListener = listener
    }
}