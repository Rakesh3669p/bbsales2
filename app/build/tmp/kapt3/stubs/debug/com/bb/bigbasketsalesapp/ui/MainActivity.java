package com.bb.bigbasketsalesapp.ui;

import java.lang.System;

@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\'\u001a\u00020(H\u0002J\u0006\u0010)\u001a\u00020(J\b\u0010*\u001a\u00020(H\u0002J\b\u0010+\u001a\u00020(H\u0007J\u0010\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020\u0016H\u0002J\b\u0010.\u001a\u00020(H\u0002J\"\u0010/\u001a\u00020(2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u000104H\u0014J\u0012\u00105\u001a\u00020(2\b\u00106\u001a\u0004\u0018\u000107H\u0014J\u001e\u00108\u001a\u00020(2\u0006\u00100\u001a\u0002012\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u001e\u0010:\u001a\u00020(2\u0006\u00100\u001a\u0002012\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J-\u0010;\u001a\u00020(2\u0006\u00100\u001a\u0002012\u000e\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160=2\u0006\u0010>\u001a\u00020?H\u0016\u00a2\u0006\u0002\u0010@J\b\u0010A\u001a\u00020(H\u0014J\b\u0010B\u001a\u00020(H\u0002J\b\u0010C\u001a\u00020(H\u0002J\b\u0010D\u001a\u00020(H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u00a8\u0006F"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "()V", "alertDialog", "Landroid/app/AlertDialog$Builder;", "binding", "Lcom/bb/bigbasketsalesapp/databinding/ActivityMainBinding;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "mainViewModel", "Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "getMainViewModel", "()Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "navController", "Landroidx/navigation/NavController;", "permissionToRequest", "", "", "repository", "Lcom/bb/bigbasketsalesapp/data/BBSalesRepository;", "resolutionForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "kotlin.jvm.PlatformType", "session", "Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "getSession", "()Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "setSession", "(Lcom/bb/bigbasketsalesapp/utils/SessionManager;)V", "simpleDateFormat", "Ljava/text/SimpleDateFormat;", "getSimpleDateFormat", "()Ljava/text/SimpleDateFormat;", "checkLanguage", "", "checkLocationEnabled", "enableLocation", "getLocation", "hitUpdateLocationApi", "accessTime", "init", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPermissionsDenied", "perms", "onPermissionsGranted", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "requestPermission", "showLocationAccessDialog", "startLocationUpdates", "Companion", "BBSales_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements pub.devrel.easypermissions.EasyPermissions.PermissionCallbacks {
    private android.app.AlertDialog.Builder alertDialog;
    @org.jetbrains.annotations.NotNull()
    public static final com.bb.bigbasketsalesapp.ui.MainActivity.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static android.os.Handler mainHandler;
    private com.bb.bigbasketsalesapp.databinding.ActivityMainBinding binding;
    private androidx.navigation.NavController navController;
    private com.google.android.gms.location.LocationRequest locationRequest;
    private java.util.List<java.lang.String> permissionToRequest;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.utils.SessionManager session;
    private final com.bb.bigbasketsalesapp.data.BBSalesRepository repository = null;
    private final kotlin.Lazy mainViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.text.SimpleDateFormat simpleDateFormat = null;
    private final androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> resolutionForResult = null;
    
    public MainActivity() {
        super();
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
    public final java.text.SimpleDateFormat getSimpleDateFormat() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startLocationUpdates() {
    }
    
    private final void init() {
    }
    
    private final void showLocationAccessDialog() {
    }
    
    private final void checkLanguage() {
    }
    
    public final void checkLocationEnabled() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void getLocation() {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.DelicateCoroutinesApi.class})
    private final void hitUpdateLocationApi(java.lang.String accessTime) {
    }
    
    private final void requestPermission() {
    }
    
    private final void enableLocation() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onPermissionsGranted(int requestCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> perms) {
    }
    
    @java.lang.Override()
    public void onPermissionsDenied(int requestCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> perms) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/MainActivity$Companion;", "", "()V", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "setMainHandler", "(Landroid/os/Handler;)V", "BBSales_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.os.Handler getMainHandler() {
            return null;
        }
        
        public final void setMainHandler(@org.jetbrains.annotations.Nullable()
        android.os.Handler p0) {
        }
    }
}