package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model

data class SendMessageModel(
    val Data: SendMessageData,
    val Output: String
)

data class SendMessageData(
    val ChatHistory: List<ChatHistory>,
    val EmpPhoto: Any,
    val Employee: Any,
    val EmployeeID: Int,
    val EmployeePhoto: String,
    val EmployeeUserID: Int,
    val Receiver: String,
    val ReceiverID: Int,
    val ReceiverMessage: Any,
    val ReceiverMessageTime: Any,
    val ReceiverPhoto: Any,
    val Sender: String,
    val SenderID: Int,
    val SenderMessage: Any,
    val SenderMessageTime: Any,
    val SenderPhoto: Any
)

data class ChatHistory(
    val MessageIdentifier: Int,
    val Receiver: Any,
    val ReceiverID: Int,
    val ReceiverMessage: String,
    val ReceiverMessageTime: Any,
    val ReceiverPhoto: Any,
    val Sender: Any,
    val SenderID: Int,
    val SenderMessage: String,
    val SenderMessageTime: Any,
    val SenderPhoto: Any
)