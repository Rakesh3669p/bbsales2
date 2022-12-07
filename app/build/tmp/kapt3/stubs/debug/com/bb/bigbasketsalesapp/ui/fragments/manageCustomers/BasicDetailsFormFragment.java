package com.bb.bigbasketsalesapp.ui.fragments.manageCustomers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u0010H\u0002J\b\u00102\u001a\u000203H\u0002J\"\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u00107\u001a\u0002032\b\u00108\u001a\u0004\u0018\u00010\u0013H\u0016J$\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010@\u001a\u0002032\u0006\u0010A\u001a\u00020\u0007H\u0002J\b\u0010B\u001a\u000203H\u0002J\b\u0010C\u001a\u000203H\u0002J\b\u0010D\u001a\u000203H\u0002J\b\u0010E\u001a\u000203H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u000e\u0010$\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/BasicDetailsFormFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "data", "Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/CustomerData;", "(Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/CustomerData;)V", "UPLOAD_CR_REQUEST_CODE", "", "UPLOAD_MENU_REQUEST_CODE", "UPLOAD_STORE_BOARD_REQUEST_CODE", "UPLOAD_VAT_REQUEST_CODE", "appLoader", "Lcom/bb/bigbasketsalesapp/utils/AppLoader;", "binding", "Lcom/bb/bigbasketsalesapp/databinding/FragmentBasicDetailsFormBinding;", "businessType", "", "countryCode", "currentView", "Landroid/view/View;", "cusLatitude", "", "cusLongitude", "customerData", "getData", "()Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/CustomerData;", "launchLocationActivity", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "mainViewModel", "Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "getMainViewModel", "()Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "selectedBusinessType", "session", "Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "getSession", "()Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "setSession", "(Lcom/bb/bigbasketsalesapp/utils/SessionManager;)V", "uploadedCRFile", "uploadedMenuFile", "uploadedStoreBoardFile", "uploadedVATFile", "checkValidBase64", "", "imageFile", "init", "", "onActivityResult", "requestCode", "resultCode", "onClick", "v", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "pickAndUploadImage", "pickerCode", "setFormData", "setObserver", "setOnClickListener", "validateAndSubmitBasicForm", "BBSales_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class BasicDetailsFormFragment extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private final com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.CustomerData data = null;
    private java.lang.String countryCode = "";
    private java.lang.String selectedBusinessType = "";
    private com.bb.bigbasketsalesapp.databinding.FragmentBasicDetailsFormBinding binding;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.utils.SessionManager session;
    private android.view.View currentView;
    private com.bb.bigbasketsalesapp.utils.AppLoader appLoader;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.CustomerData customerData;
    private java.lang.String businessType = "";
    private int UPLOAD_STORE_BOARD_REQUEST_CODE = 51;
    private int UPLOAD_CR_REQUEST_CODE = 52;
    private int UPLOAD_VAT_REQUEST_CODE = 53;
    private int UPLOAD_MENU_REQUEST_CODE = 54;
    private java.lang.String uploadedStoreBoardFile = "";
    private java.lang.String uploadedCRFile = "";
    private java.lang.String uploadedVATFile = "";
    private java.lang.String uploadedMenuFile = "";
    private double cusLatitude = 0.0;
    private double cusLongitude = 0.0;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> launchLocationActivity = null;
    
    public BasicDetailsFormFragment(@org.jetbrains.annotations.NotNull()
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
    
    private final void setFormData() {
    }
    
    private final byte[] checkValidBase64(java.lang.String imageFile) {
        return null;
    }
    
    private final void setObserver() {
    }
    
    private final void setOnClickListener() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void validateAndSubmitBasicForm() {
    }
    
    private final void pickAndUploadImage(int pickerCode) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
}