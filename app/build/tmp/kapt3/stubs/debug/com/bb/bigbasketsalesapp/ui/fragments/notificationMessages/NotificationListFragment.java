package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J$\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0016\u0010$\u001a\u00020\u001c2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&H\u0002J\b\u0010(\u001a\u00020\u001cH\u0002J\b\u0010)\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006*"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/NotificationListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "appLoader", "Lcom/bb/bigbasketsalesapp/utils/AppLoader;", "binding", "Lcom/bb/bigbasketsalesapp/databinding/FragmentNotificationListBinding;", "currentView", "Landroid/view/View;", "mainViewModel", "Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "getMainViewModel", "()Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "notificationListAdapter", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/NotificationListAdapter;", "getNotificationListAdapter", "()Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/NotificationListAdapter;", "setNotificationListAdapter", "(Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/NotificationListAdapter;)V", "session", "Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "getSession", "()Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "setSession", "(Lcom/bb/bigbasketsalesapp/utils/SessionManager;)V", "init", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setNotificationRv", "notificationList", "", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/NotificationData;", "setObserver", "setOnClickListener", "BBSales_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class NotificationListFragment extends androidx.fragment.app.Fragment {
    private com.bb.bigbasketsalesapp.databinding.FragmentNotificationListBinding binding;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.utils.SessionManager session;
    private android.view.View currentView;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.NotificationListAdapter notificationListAdapter;
    private com.bb.bigbasketsalesapp.utils.AppLoader appLoader;
    private final kotlin.Lazy mainViewModel$delegate = null;
    
    public NotificationListFragment() {
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
    public final com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.NotificationListAdapter getNotificationListAdapter() {
        return null;
    }
    
    public final void setNotificationListAdapter(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.NotificationListAdapter p0) {
    }
    
    private final com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel getMainViewModel() {
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
    
    private final void setNotificationRv(java.util.List<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.NotificationData> notificationList) {
    }
    
    private final void setOnClickListener() {
    }
}