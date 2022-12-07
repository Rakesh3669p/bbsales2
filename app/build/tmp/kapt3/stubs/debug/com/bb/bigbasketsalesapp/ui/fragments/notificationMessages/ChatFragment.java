package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00101\u001a\u000202H\u0002J\u0012\u00103\u001a\u0002022\b\u00104\u001a\u0004\u0018\u00010\u0019H\u0016J$\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u000202H\u0002J\u0016\u0010=\u001a\u0002022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0002J\b\u0010>\u001a\u000202H\u0002J\b\u0010?\u001a\u000202H\u0002J\b\u0010@\u001a\u000202H\u0002J\b\u0010A\u001a\u000202H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/ChatFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "()V", "appLoader", "Lcom/bb/bigbasketsalesapp/utils/AppLoader;", "binding", "Lcom/bb/bigbasketsalesapp/databinding/FragmentChatBinding;", "chatAdapter", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/ChatAdapter;", "getChatAdapter", "()Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/ChatAdapter;", "setChatAdapter", "(Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/ChatAdapter;)V", "chatData", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/ChatData;", "chatList", "", "chatViewModel", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/viewModel/ChatViewModel;", "getChatViewModel", "()Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/viewModel/ChatViewModel;", "chatViewModel$delegate", "Lkotlin/Lazy;", "currentView", "Landroid/view/View;", "employeeData", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/EmployeeData;", "isLoading", "", "()Z", "setLoading", "(Z)V", "isScrolling", "setScrolling", "pageNo", "", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "searchKeyword", "", "session", "Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "getSession", "()Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "setSession", "(Lcom/bb/bigbasketsalesapp/utils/SessionManager;)V", "verticalScrollOffset", "Ljava/util/concurrent/atomic/AtomicInteger;", "init", "", "onClick", "v", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "sendNewMessage", "setChatRv", "setEmployeeData", "setObserver", "setOnClickListener", "setRecyclerView", "BBSales_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ChatFragment extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {
    private com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatData chatData;
    private java.util.List<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatData> chatList;
    private com.bb.bigbasketsalesapp.databinding.FragmentChatBinding binding;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.utils.SessionManager session;
    private android.view.View currentView;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.ChatAdapter chatAdapter;
    private final kotlin.Lazy chatViewModel$delegate = null;
    private com.bb.bigbasketsalesapp.utils.AppLoader appLoader;
    private java.util.concurrent.atomic.AtomicInteger verticalScrollOffset;
    private int pageNo = 1;
    private java.lang.String searchKeyword = "";
    private com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeData employeeData;
    private boolean isLoading = false;
    private boolean isScrolling = false;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener scrollListener = null;
    
    public ChatFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.utils.SessionManager getSession() {
        return null;
    }
    
    public final void setSession(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.utils.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.ChatAdapter getChatAdapter() {
        return null;
    }
    
    public final void setChatAdapter(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.ChatAdapter p0) {
    }
    
    private final com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.viewModel.ChatViewModel getChatViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void init() {
    }
    
    private final void setObserver() {
    }
    
    private final void setRecyclerView() {
    }
    
    private final void setEmployeeData() {
    }
    
    private final void setChatRv(java.util.List<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatData> chatList) {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    public final boolean isScrolling() {
        return false;
    }
    
    public final void setScrolling(boolean p0) {
    }
    
    private final void sendNewMessage() {
    }
    
    private final void setOnClickListener() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
}