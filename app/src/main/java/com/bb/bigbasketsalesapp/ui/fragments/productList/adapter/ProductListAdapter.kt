package com.bb.bigbasketsalesapp.ui.fragments.productList.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.databinding.ItemProductListBinding
import com.bb.bigbasketsalesapp.ui.fragments.productList.model.AssociativeProduct
import com.bb.bigbasketsalesapp.ui.fragments.productList.model.Product
import com.bb.bigbasketsalesapp.utils.noImage
import com.bumptech.glide.Glide
import javax.inject.Inject


class ProductListAdapter @Inject constructor() :
    RecyclerView.Adapter<ProductListAdapter.ViewHolder>() {
    private lateinit var context: Context

    inner class ViewHolder(private val itemProductListBinding: ItemProductListBinding) :
        RecyclerView.ViewHolder(itemProductListBinding.root) {
        fun bind(data: Product) {
            with(itemProductListBinding) {
                if (data.image.isNotEmpty()) {
                    Glide.with(context).applyDefaultRequestOptions(noImage())
                        .load(data.image[0].image).into(productImage)
                }else{
                    Glide.with(context).applyDefaultRequestOptions(noImage())
                        .load("").into(productImage)
                }
                productName.text = data.product_name.toString()
                productAmount.text = "${data.actual_price} SAR"
                productListingAmount.isVisible = data.sale_price
                productListingAmount.text = "${data.sale_price} SAR"

                setProductWeightSpinner(data.associative_products, itemProductListBinding)
            }
        }
    }

    private fun setProductWeightSpinner(
        associativeProducts: List<AssociativeProduct>,
        binding: ItemProductListBinding
    ) {
        val adapter = ArrayAdapter(context, R.layout.spinner_text_products, associativeProducts)
        adapter.setDropDownViewResource(R.layout.spinner_text_products)

        binding.productWeightSpinner.adapter = adapter
        binding.productWeightSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?, view: View, pos: Int,
                id: Long
            ) {
                val spinnerValue = parent!!.getItemAtPosition(pos).toString()
                binding.productVariation.text = spinnerValue
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }

    private val diffUtil = object : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

    }
    val differ = AsyncListDiffer(this, diffUtil)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductListAdapter.ViewHolder {
        context = parent.context
        return ViewHolder(
            ItemProductListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProductListAdapter.ViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }

    override fun getItemCount(): Int = differ.currentList.size

    override fun getItemViewType(position: Int): Int {
        return position
    }
}