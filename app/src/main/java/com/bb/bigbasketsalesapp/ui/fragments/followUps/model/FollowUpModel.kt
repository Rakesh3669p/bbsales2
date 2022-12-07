package com.bb.bigbasketsalesapp.ui.fragments.followUps.model

data class FollowUpModel(
    val Data: Data,
    val Output: String,
    val TotalCount: Int
)

data class Data(
    val City: String,
    val Country: Any,
    val EnquiryID: Int,
    val EnquiryName: String,
    val EnquiryNo: String,
    val FollowList: List<Follow>,
    val State: String
)

data class Follow(
    val FollowStatus: String,
    val FollowupDate: String,
    val FollowupTime: String,
    val NextFollowUpDate: String
)