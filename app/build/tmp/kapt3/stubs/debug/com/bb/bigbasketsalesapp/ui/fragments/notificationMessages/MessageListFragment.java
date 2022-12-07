package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00102\u001a\u000203H\u0002J\u0012\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u00010\u0015H\u0016J$\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u000203H\u0002J\u0016\u0010>\u001a\u0002032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\b\u0010?\u001a\u000203H\u0002J\b\u0010@\u001a\u000203H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u00a8\u0006A"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/MessageListFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "()V", "appLoader", "Lcom/bb/bigbasketsalesapp/utils/AppLoader;", "binding", "Lcom/bb/bigbasketsalesapp/databinding/FragmentMessageListBinding;", "chatListAdapter", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/ChatListAdapter;", "getChatListAdapter", "()Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/ChatListAdapter;", "setChatListAdapter", "(Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/ChatListAdapter;)V", "chatViewModel", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/viewModel/ChatViewModel;", "getChatViewModel", "()Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/viewModel/ChatViewModel;", "chatViewModel$delegate", "Lkotlin/Lazy;", "currentView", "Landroid/view/View;", "employeeList", "", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/EmployeeData;", "isLoading", "", "()Z", "setLoading", "(Z)V", "isScrolling", "setScrolling", "messageListAdapter", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/MessagesListAdapter;", "getMessageListAdapter", "()Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/MessagesListAdapter;", "setMessageListAdapter", "(Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/MessagesListAdapter;)V", "pageNo", "", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "searchKeyword", "", "session", "Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "getSession", "()Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "setSession", "(Lcom/bb/bigbasketsalesapp/utils/SessionManager;)V", "init", "", "onClick", "v", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setAdapterClickListener", "setEmployeeRv", "setObserver", "setOnClickListener", "BBSales_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MessageListFragment extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {
    private java.util.List<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeData> employeeList;
    private com.bb.bigbasketsalesapp.databinding.FragmentMessageListBinding binding;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.utils.SessionManager session;
    private android.view.View currentView;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.ChatListAdapter chatListAdapter;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.MessagesListAdapter messageListAdapter;
    private final kotlin.Lazy chatViewModel$delegate = null;
    private com.bb.bigbasketsalesapp.utils.AppLoader appLoader;
    private int pageNo = 1;
    private java.lang.String searchKeyword = "";
    private boolean isLoading = false;
    private boolean isScrolling = false;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener scrollListener = null;
    
    public MessageListFragment() {
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
    public final com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.ChatListAdapter getChatListAdapter() {
        return null;
    }
    
    public final void setChatListAdapter(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.ChatListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.MessagesListAdapter getMessageListAdapter() {
        return null;
    }
    
    public final void setMessageListAdapter(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.MessagesListAdapter p0) {
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
    
    private final void setEmployeeRv(java.util.List<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeData> employeeList) {
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
    
    private final void setOnClickListener() {
    }
    
    private final void setAdapterClickListener() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
}