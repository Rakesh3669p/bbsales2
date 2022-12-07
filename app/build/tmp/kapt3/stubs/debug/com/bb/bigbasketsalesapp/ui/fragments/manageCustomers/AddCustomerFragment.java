package com.bb.bigbasketsalesapp.ui.fragments.manageCustomers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010;\u001a\u00020<H\u0002J\"\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00052\b\u0010@\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010A\u001a\u00020<2\b\u0010B\u001a\u0004\u0018\u00010\u0014H\u0016J$\u0010C\u001a\u00020\u00142\u0006\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010J\u001a\u00020<H\u0016J\u0010\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020\u0005H\u0002J\b\u0010M\u001a\u00020<H\u0002J\b\u0010N\u001a\u00020<H\u0002J\b\u0010O\u001a\u00020<H\u0003J\u0010\u0010P\u001a\u00020<2\u0006\u0010Q\u001a\u00020RH\u0002J\b\u0010S\u001a\u00020<H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\'\u001a\u00020(\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u00101\u001a\u000202\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u000e\u00105\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006T"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/AddCustomerFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "()V", "UPLOAD_CR_REQUEST_CODE", "", "UPLOAD_MENU_REQUEST_CODE", "UPLOAD_STORE_BOARD_REQUEST_CODE", "UPLOAD_VAT_REQUEST_CODE", "addressData", "Lcom/bb/bigbasketsalesapp/locationPicker/AddressData;", "appLoader", "Lcom/bb/bigbasketsalesapp/utils/AppLoader;", "binding", "Lcom/bb/bigbasketsalesapp/databinding/FragmentAddCustomerBinding;", "city", "", "country", "countryCode", "currentView", "Landroid/view/View;", "district", "launchLocationActivity", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "mainViewModel", "Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "getMainViewModel", "()Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "notificationListAdapter", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/NotificationListAdapter;", "getNotificationListAdapter", "()Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/NotificationListAdapter;", "setNotificationListAdapter", "(Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/adapter/NotificationListAdapter;)V", "pincode", "repository", "Lcom/bb/bigbasketsalesapp/data/BBSalesRepository;", "getRepository", "()Lcom/bb/bigbasketsalesapp/data/BBSalesRepository;", "session", "Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "getSession", "()Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "setSession", "(Lcom/bb/bigbasketsalesapp/utils/SessionManager;)V", "simpleDateFormat", "Ljava/text/SimpleDateFormat;", "getSimpleDateFormat", "()Ljava/text/SimpleDateFormat;", "state", "street", "uploadedCRFile", "uploadedMenuFile", "uploadedStoreBoardFile", "uploadedVATFile", "init", "", "onActivityResult", "requestCode", "resultCode", "data", "onClick", "v", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "pickAndUploadImage", "pickerCode", "setObserver", "setOnClickListener", "updateCurrentLocation", "updateLocation", "location", "Landroid/location/Location;", "validateAndSaveCustomer", "BBSales_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddCustomerFragment extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {
    private com.bb.bigbasketsalesapp.locationPicker.AddressData addressData;
    private com.bb.bigbasketsalesapp.databinding.FragmentAddCustomerBinding binding;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.utils.SessionManager session;
    private android.view.View currentView;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.adapter.NotificationListAdapter notificationListAdapter;
    private final kotlin.Lazy mainViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.bb.bigbasketsalesapp.data.BBSalesRepository repository = null;
    private com.bb.bigbasketsalesapp.utils.AppLoader appLoader;
    @org.jetbrains.annotations.NotNull()
    private final java.text.SimpleDateFormat simpleDateFormat = null;
    private int UPLOAD_STORE_BOARD_REQUEST_CODE = 51;
    private int UPLOAD_CR_REQUEST_CODE = 52;
    private int UPLOAD_VAT_REQUEST_CODE = 53;
    private int UPLOAD_MENU_REQUEST_CODE = 54;
    private java.lang.String uploadedStoreBoardFile = "";
    private java.lang.String uploadedCRFile = "";
    private java.lang.String uploadedVATFile = "";
    private java.lang.String uploadedMenuFile = "";
    private java.lang.String street = "";
    private java.lang.String city = "";
    private java.lang.String district = "";
    private java.lang.String state = "";
    private java.lang.String pincode = "";
    private java.lang.String country = "";
    private java.lang.String countryCode = "";
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> launchLocationActivity = null;
    
    public AddCustomerFragment() {
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
    public final com.bb.bigbasketsalesapp.data.BBSalesRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getSimpleDateFormat() {
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
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void updateCurrentLocation() {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.DelicateCoroutinesApi.class})
    private final void updateLocation(android.location.Location location) {
    }
    
    private final void setOnClickListener() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void validateAndSaveCustomer() {
    }
    
    private final void pickAndUploadImage(int pickerCode) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
}