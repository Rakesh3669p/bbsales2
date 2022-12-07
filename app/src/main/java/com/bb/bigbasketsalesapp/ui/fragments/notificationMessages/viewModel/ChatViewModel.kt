package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bb.bigbasketsalesapp.data.BBSalesRepository
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatListModel
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeListModel
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.SendMessageModel
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.doctorsplaza.app.utils.Resource
import com.gym.gymapp.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class ChatViewModel @Inject constructor(private val repository: BBSalesRepository,private val session:SessionManager):ViewModel() {
    val employeeList = SingleLiveEvent<Resource<EmployeeListModel>>()
    val chatList = SingleLiveEvent<Resource<ChatListModel>>()
    val sendMessage = SingleLiveEvent<Resource<SendMessageModel>>()

    fun getEmployeeList(pageNo:String,searchKey:String) = viewModelScope.launch {
        safeGetEmployeeListCall(pageNo,searchKey)
    }

    private suspend fun safeGetEmployeeListCall(pageNo: String, searchKey: String) {
        employeeList.postValue(Resource.Loading())
        try {
            val response = repository.getEmployeeList(pageNo,"15",searchKey,session.organisationId.toString())
            if (response.isSuccessful)
                employeeList.postValue(Resource.Success(checkResponseBody(body = response.body()) as EmployeeListModel))
            else
                employeeList.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            employeeList.postValue(Resource.Error(checkThrowable(t), null))
        }
    }



  fun getChatList(userId:String,employeeId:String,organisationId:String) = viewModelScope.launch {
        safeGetChatListCall(userId,employeeId,organisationId)
    }

    private suspend fun safeGetChatListCall(
        userId: String,
        employeeId: String,
        organisationId: String
    ) {
        chatList.postValue(Resource.Loading())
        try {
            val response = repository.getChatList(userId,employeeId,organisationId)
            if (response.isSuccessful)
                chatList.postValue(Resource.Success(checkResponseBody(body = response.body()) as ChatListModel))
            else
                chatList.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            chatList.postValue(Resource.Error(checkThrowable(t), null))
        }
    }






  fun sendMessage(userId:String,employeeId:String,organisationId:String,message:String) = viewModelScope.launch {
        safeGetChatListCall(userId,employeeId,organisationId,message)
    }

    private suspend fun safeGetChatListCall(
        userId: String,
        employeeId: String,
        organisationId: String,
        message: String
    ) {
        sendMessage.postValue(Resource.Loading())
        try {
            val response = repository.sendMessage(userId,employeeId,organisationId,message)
            if (response.isSuccessful)
                sendMessage.postValue(Resource.Success(checkResponseBody(body = response.body()) as SendMessageModel))
            else
                sendMessage.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            sendMessage.postValue(Resource.Error(checkThrowable(t), null))
        }
    }







    private fun checkResponseBody(body: Any?): Any? = body?.let { it }

    private fun checkThrowable(t: Throwable): String {
        return when (t) {
            is IOException ->
                "Network Failure"
            else -> "Conversion Error ${t.message}"

        }
    }


}