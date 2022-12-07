package com.bb.bigbasketsalesapp.ui.fragments.followUps.model


class FollowUpsDropdownModel : ArrayList<FollowStatusModelItem>()

data class FollowStatusModelItem(
    val EnquiryTypes: Any,
    val FollowStatus: String,
    val FollowUpStatusID: Int
){
    override fun toString(): String {
        return FollowStatus
    }
}