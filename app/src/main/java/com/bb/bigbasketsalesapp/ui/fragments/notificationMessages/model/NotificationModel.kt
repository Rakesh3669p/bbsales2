package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model

data class NotificationModel(
    val Count: Int,
    val List: List<NotificationData>,
    val Output: String
)

data class NotificationData(
    val AcionURL: Any,
    val ActivityCount: Int,
    val ActivityListData: Any,
    val ActivityList_Id: Int,
    val ActivityType: String,
    val ApprovalStatus: Any,
    val BranchId: Int,
    val BranchName: Any,
    val Count: Int,
    val CreatedDate: String,
    val CurrentPage: Int,
    val CustomerName: String,
    val DivisionId: Int,
    val DivisionName: Any,
    val ModelPrevilege: Any,
    val PageSize: Int,
    val PersonType: String,
    val SearchKeyWord: Any,
    val SubType: String,
    val TotalAmount: Double,
    val Transaction_Id: Int,
    val Unique_Id: String,
    val UserId: Int
)