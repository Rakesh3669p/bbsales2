package com.bb.bigbasketsalesapp.ui.fragments.manageCustomers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u00102\u001a\u000203H\u0002J\u0012\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u00010\u000bH\u0016J$\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0016\u0010=\u001a\u0002032\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020?0>H\u0002J\u0016\u0010@\u001a\u0002032\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020A0>H\u0002J\b\u0010B\u001a\u000203H\u0002J\b\u0010C\u001a\u000203H\u0002J\b\u0010D\u001a\u000203H\u0002J\u0016\u0010E\u001a\u0002032\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020F0>H\u0002J\b\u0010G\u001a\u000203H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u00a8\u0006H"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/BusinessDetailsFormFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "data", "Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/CustomerData;", "(Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/CustomerData;)V", "appLoader", "Lcom/bb/bigbasketsalesapp/utils/AppLoader;", "binding", "Lcom/bb/bigbasketsalesapp/databinding/FragmentBusinessDetailsFormBinding;", "currentView", "Landroid/view/View;", "customerData", "customerUpdated", "", "getData", "()Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/CustomerData;", "enquiryData", "Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/EnquiryData;", "enquiryUpdated", "formSubmitted", "Landroidx/lifecycle/MutableLiveData;", "jsonObject", "Lcom/google/gson/JsonObject;", "getJsonObject", "()Lcom/google/gson/JsonObject;", "setJsonObject", "(Lcom/google/gson/JsonObject;)V", "mainViewModel", "Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "getMainViewModel", "()Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "notificationListAdapter", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/NotificationListAdapter;", "getNotificationListAdapter", "()Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/NotificationListAdapter;", "setNotificationListAdapter", "(Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/NotificationListAdapter;)V", "selectedEnquiryStatus", "", "selectedEnquiryType", "selectedRestaurantId", "session", "Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "getSession", "()Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "setSession", "(Lcom/bb/bigbasketsalesapp/utils/SessionManager;)V", "init", "", "onClick", "v", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setEnquiryStatusSpinner", "", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/EnquiryStatusViewData;", "setEnquiryTypeSpinner", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/EnquiryTypeViewData;", "setFormData", "setObserver", "setOnClickListener", "setRestaurantSpinner", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/IndustryViewData;", "validateFormAndUpdateData", "BBSales_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class BusinessDetailsFormFragment extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private final com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.CustomerData data = null;
    private java.lang.String selectedRestaurantId = "";
    private java.lang.String selectedEnquiryType = "";
    private java.lang.String selectedEnquiryStatus = "";
    private com.bb.bigbasketsalesapp.databinding.FragmentBusinessDetailsFormBinding binding;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.utils.SessionManager session;
    private android.view.View currentView;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.NotificationListAdapter notificationListAdapter;
    private com.bb.bigbasketsalesapp.utils.AppLoader appLoader;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.CustomerData customerData;
    private com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.EnquiryData enquiryData;
    @org.jetbrains.annotations.NotNull()
    private com.google.gson.JsonObject jsonObject;
    private boolean customerUpdated = false;
    private boolean enquiryUpdated = false;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> formSubmitted;
    
    public BusinessDetailsFormFragment(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.CustomerData data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.CustomerData getData() {
        return null;
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
    public final com.google.gson.JsonObject getJsonObject() {
        return null;
    }
    
    public final void setJsonObject(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject p0) {
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
    
    private final void setFormData() {
    }
    
    private final void setObserver() {
    }
    
    private final void setRestaurantSpinner(java.util.List<com.bb.bigbasketsalesapp.ui.fragments.commonModel.IndustryViewData> data) {
    }
    
    private final void setEnquiryTypeSpinner(java.util.List<com.bb.bigbasketsalesapp.ui.fragments.commonModel.EnquiryTypeViewData> data) {
    }
    
    private final void setEnquiryStatusSpinner(java.util.List<com.bb.bigbasketsalesapp.ui.fragments.commonModel.EnquiryStatusViewData> data) {
    }
    
    private final void setOnClickListener() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void validateFormAndUpdateData() {
    }
}