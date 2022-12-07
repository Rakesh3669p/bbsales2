package com.bb.bigbasketsalesapp.ui.fragments.revenue.model

data class RevenueModel(
    val data: List<RevenueData>,
    val httpcode: Int,
    val message: String,
    val status: String,
    val total: Any
)

data class RevenueData(
    val city: String?="",
    val crm_unique_id: Any,
    val customer_name: String,
    val delivery_status: Any,
    val discount: Double,
    val grand_total: Double,
    val order_date: String,
    val order_id: String,
    val order_status: String,
    val payment_status: String,
    val sale_primary_id: Int,
    val tax: Double,
    val total: Double,
    val usr_from: String
)