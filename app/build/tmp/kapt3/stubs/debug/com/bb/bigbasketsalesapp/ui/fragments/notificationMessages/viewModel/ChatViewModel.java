package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.viewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001e\u0010\u000b\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017J\u0016\u0010\u000f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017J)\u0010 \u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J1\u0010 \u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J!\u0010%\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J&\u0010\u0010\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0017R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/viewModel/ChatViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/bb/bigbasketsalesapp/data/BBSalesRepository;", "session", "Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "(Lcom/bb/bigbasketsalesapp/data/BBSalesRepository;Lcom/bb/bigbasketsalesapp/utils/SessionManager;)V", "chatList", "Lcom/gym/gymapp/utils/SingleLiveEvent;", "Lcom/doctorsplaza/app/utils/Resource;", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/ChatListModel;", "getChatList", "()Lcom/gym/gymapp/utils/SingleLiveEvent;", "employeeList", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/EmployeeListModel;", "getEmployeeList", "sendMessage", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/SendMessageModel;", "getSendMessage", "checkResponseBody", "", "body", "checkThrowable", "", "t", "", "Lkotlinx/coroutines/Job;", "userId", "employeeId", "organisationId", "pageNo", "searchKey", "safeGetChatListCall", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeGetEmployeeListCall", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "BBSales_debug"})
public final class ChatViewModel extends androidx.lifecycle.ViewModel {
    private final com.bb.bigbasketsalesapp.data.BBSalesRepository repository = null;
    private final com.bb.bigbasketsalesapp.utils.SessionManager session = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeListModel>> employeeList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatListModel>> chatList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.SendMessageModel>> sendMessage = null;
    
    @javax.inject.Inject()
    public ChatViewModel(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.data.BBSalesRepository repository, @org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.utils.SessionManager session) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeListModel>> getEmployeeList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatListModel>> getChatList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.SendMessageModel>> getSendMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getEmployeeList(@org.jetbrains.annotations.NotNull()
    java.lang.String pageNo, @org.jetbrains.annotations.NotNull()
    java.lang.String searchKey) {
        return null;
    }
    
    private final java.lang.Object safeGetEmployeeListCall(java.lang.String pageNo, java.lang.String searchKey, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getChatList(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String employeeId, @org.jetbrains.annotations.NotNull()
    java.lang.String organisationId) {
        return null;
    }
    
    private final java.lang.Object safeGetChatListCall(java.lang.String userId, java.lang.String employeeId, java.lang.String organisationId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String employeeId, @org.jetbrains.annotations.NotNull()
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    private final java.lang.Object safeGetChatListCall(java.lang.String userId, java.lang.String employeeId, java.lang.String organisationId, java.lang.String message, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object checkResponseBody(java.lang.Object body) {
        return null;
    }
    
    private final java.lang.String checkThrowable(java.lang.Throwable t) {
        return null;
    }
}