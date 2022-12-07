package com.bb.bigbasketsalesapp.ui.fragments.offers.model

data class OfferModel(
    val data: List<OfferData>,
    val httpcode: Int,
    val message: String,
    val status: String
)

data class OfferData(
    val cat_name: Any,
    val coupon_id: Int,
    val cpn_desc: String,
    val cpn_title: String,
    val image: String?="",
    val ofr_code: String,
    val ofr_min_amount: Int,
    val ofr_type: String,
    val ofr_value: Int,
    val ofr_value_type: String,
    val purchase_amount: Int,
    val purchase_number: Int,
    val purchase_type: String,
    val subcat_name: String,
    val valid_days: Int,
    val valid_from: String,
    val valid_to: String,
    val validity_type: String,

    var isApplied:Boolean=false
)