package com.bb.bigbasketsalesapp.ui.fragments.followUps;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0002J\u0012\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\rH\u0016J$\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0016\u00105\u001a\u00020+2\f\u00106\u001a\b\u0012\u0004\u0012\u00020807H\u0002J\b\u00109\u001a\u00020+H\u0002J\b\u0010:\u001a\u00020+H\u0002J\b\u0010;\u001a\u00020+H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u000e\u0010#\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)\u00a8\u0006<"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/FollowUpListFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "()V", "appLoader", "Lcom/bb/bigbasketsalesapp/utils/AppLoader;", "getAppLoader", "()Lcom/bb/bigbasketsalesapp/utils/AppLoader;", "setAppLoader", "(Lcom/bb/bigbasketsalesapp/utils/AppLoader;)V", "binding", "Lcom/bb/bigbasketsalesapp/databinding/FragmentFollowUpListBinding;", "currentView", "Landroid/view/View;", "customerCity", "", "customerCode", "customerData", "Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/model/CustomerData;", "customerImage", "customerName", "customerState", "enquiryId", "followUpAdapter", "Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/adapter/FollowUpAdapter;", "getFollowUpAdapter", "()Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/adapter/FollowUpAdapter;", "setFollowUpAdapter", "(Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/adapter/FollowUpAdapter;)V", "mainViewModel", "Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "getMainViewModel", "()Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "organisationId", "session", "Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "getSession", "()Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "setSession", "(Lcom/bb/bigbasketsalesapp/utils/SessionManager;)V", "init", "", "onClick", "v", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setFollowUps", "data", "", "Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/model/Follow;", "setObserver", "setOnClickListener", "setTopData", "BBSales_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FollowUpListFragment extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {
    private com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData customerData;
    private com.bb.bigbasketsalesapp.databinding.FragmentFollowUpListBinding binding;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.utils.SessionManager session;
    private android.view.View currentView;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter.FollowUpAdapter followUpAdapter;
    private final kotlin.Lazy mainViewModel$delegate = null;
    public com.bb.bigbasketsalesapp.utils.AppLoader appLoader;
    private java.lang.String customerName = "";
    private java.lang.String customerImage = "";
    private java.lang.String customerCode = "";
    private java.lang.String organisationId = "";
    private java.lang.String enquiryId = "";
    private java.lang.String customerState = "";
    private java.lang.String customerCity = "";
    
    public FollowUpListFragment() {
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
    public final com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter.FollowUpAdapter getFollowUpAdapter() {
        return null;
    }
    
    public final void setFollowUpAdapter(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter.FollowUpAdapter p0) {
    }
    
    private final com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.utils.AppLoader getAppLoader() {
        return null;
    }
    
    public final void setAppLoader(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.utils.AppLoader p0) {
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
    
    private final void setTopData() {
    }
    
    private final void setObserver() {
    }
    
    private final void setFollowUps(java.util.List<com.bb.bigbasketsalesapp.ui.fragments.followUps.model.Follow> data) {
    }
    
    private final void setOnClickListener() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
}