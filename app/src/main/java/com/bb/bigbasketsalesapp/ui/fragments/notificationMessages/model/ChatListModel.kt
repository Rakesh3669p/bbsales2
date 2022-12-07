package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model

data class ChatListModel(
    val List: List<ChatData>,
    val Output: String,
    val TotalCount: Int
)

data class ChatData(
    val MessageIdentifier: Int,
    val Receiver: String,
    val ReceiverID: Int,
    val ReceiverMessage: String,
    val ReceiverMessageTime: String,
    val ReceiverPhoto: String,
    val Sender: String,
    val SenderID: Int,
    val SenderMessage: String,
    val SenderMessageTime: String,
    val SenderPhoto: Any
)