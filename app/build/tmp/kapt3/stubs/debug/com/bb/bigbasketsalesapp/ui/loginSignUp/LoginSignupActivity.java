package com.bb.bigbasketsalesapp.ui.loginSignUp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001d"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/loginSignUp/LoginSignupActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/bb/bigbasketsalesapp/databinding/ActivityLoginSignupBinding;", "downloadLoader", "Lcom/bb/bigbasketsalesapp/utils/DownloadLoader;", "getDownloadLoader", "()Lcom/bb/bigbasketsalesapp/utils/DownloadLoader;", "setDownloadLoader", "(Lcom/bb/bigbasketsalesapp/utils/DownloadLoader;)V", "loginViewModel", "Lcom/bb/bigbasketsalesapp/ui/viewModel/LoginViewModel;", "getLoginViewModel", "()Lcom/bb/bigbasketsalesapp/ui/viewModel/LoginViewModel;", "loginViewModel$delegate", "Lkotlin/Lazy;", "navController", "Landroidx/navigation/NavController;", "session", "Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "getSession", "()Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "setSession", "(Lcom/bb/bigbasketsalesapp/utils/SessionManager;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "BBSales_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginSignupActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.bb.bigbasketsalesapp.databinding.ActivityLoginSignupBinding binding;
    private androidx.navigation.NavController navController;
    private final kotlin.Lazy loginViewModel$delegate = null;
    @javax.inject.Inject()
    public com.bb.bigbasketsalesapp.utils.SessionManager session;
    public com.bb.bigbasketsalesapp.utils.DownloadLoader downloadLoader;
    
    public LoginSignupActivity() {
        super();
    }
    
    private final com.bb.bigbasketsalesapp.ui.viewModel.LoginViewModel getLoginViewModel() {
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
    public final com.bb.bigbasketsalesapp.utils.DownloadLoader getDownloadLoader() {
        return null;
    }
    
    public final void setDownloadLoader(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.utils.DownloadLoader p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}