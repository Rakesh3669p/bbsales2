package com.bb.bigbasketsalesapp.ui.fragments.customersList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00102\u001a\u000203H\u0002J\u0012\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u00010\tH\u0016J$\u00106\u001a\u00020\t2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u000203H\u0002J\b\u0010>\u001a\u000203H\u0002J\b\u0010?\u001a\u000203H\u0002J\u0018\u0010@\u001a\u0002032\u0006\u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u000e\u0010&\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u00a8\u0006C"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/CustomersListFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "()V", "appLoader", "Lcom/bb/bigbasketsalesapp/utils/AppLoader;", "binding", "Lcom/bb/bigbasketsalesapp/databinding/FragmentCustomersListBinding;", "currentView", "Landroid/view/View;", "customerData", "", "Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/model/CustomerData;", "getCustomerData", "()Ljava/util/List;", "setCustomerData", "(Ljava/util/List;)V", "customerDeletePosition", "", "customerListAdapter", "Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/adapter/CustomerListAdapter;", "getCustomerListAdapter", "()Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/adapter/CustomerListAdapter;", "setCustomerListAdapter", "(Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/adapter/CustomerListAdapter;)V", "isLoading", "", "()Z", "setLoading", "(Z)V", "isScrolling", "setScrolling", "mainViewModel", "Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "getMainViewModel", "()Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "pageNo", "pageSize", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "searchKeyword", "", "session", "Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "getSession", "()Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "setSession", "(Lcom/bb/bigbasketsalesapp/utils/SessionManager;)V", "init", "", "onClick", "v", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setCustomers", "setObserver", "setOnClickListener", "showAlertMessage", "it", "position", "BBSales_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CustomersListFragment extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {
    private int customerDeletePosition = 0;
    private com.bb.bigbasketsalesapp.databinding.FragmentCustomersListBinding binding;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.utils.SessionManager session;
    private android.view.View currentView;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.ui.fragments.customersList.adapter.CustomerListAdapter customerListAdapter;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.bb.bigbasketsalesapp.utils.AppLoader appLoader;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData> customerData;
    private int pageNo = 1;
    private int pageSize = 15;
    private java.lang.String searchKeyword = "";
    private boolean isLoading = false;
    private boolean isScrolling = false;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener scrollListener = null;
    
    public CustomersListFragment() {
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
    public final com.bb.bigbasketsalesapp.ui.fragments.customersList.adapter.CustomerListAdapter getCustomerListAdapter() {
        return null;
    }
    
    public final void setCustomerListAdapter(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.ui.fragments.customersList.adapter.CustomerListAdapter p0) {
    }
    
    private final com.bb.bigbasketsalesapp.ui.viewModel.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData> getCustomerData() {
        return null;
    }
    
    public final void setCustomerData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData> p0) {
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
    
    private final void setCustomers() {
    }
    
    private final void setOnClickListener() {
    }
    
    private final void showAlertMessage(com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData it, int position) {
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
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
}