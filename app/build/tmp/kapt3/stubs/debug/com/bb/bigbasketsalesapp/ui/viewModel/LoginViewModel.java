package com.bb.bigbasketsalesapp.ui.viewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0019\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/viewModel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/bb/bigbasketsalesapp/data/BBSalesRepository;", "(Lcom/bb/bigbasketsalesapp/data/BBSalesRepository;)V", "downloadLanguage", "Lcom/gym/gymapp/utils/SingleLiveEvent;", "Lcom/doctorsplaza/app/utils/Resource;", "", "getDownloadLanguage", "()Lcom/gym/gymapp/utils/SingleLiveEvent;", "login", "Lcom/bb/bigbasketsalesapp/ui/loginSignUp/model/LoginModel;", "getLogin", "downloadlang", "", "safeDownloadLang", "safeLoginCall", "jsonObject", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLogin", "Lkotlinx/coroutines/Job;", "BBSales_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.bb.bigbasketsalesapp.data.BBSalesRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.loginSignUp.model.LoginModel>> login = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<java.lang.Boolean>> downloadLanguage = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.data.BBSalesRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.loginSignUp.model.LoginModel>> getLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<java.lang.Boolean>> getDownloadLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job setLogin(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject) {
        return null;
    }
    
    private final java.lang.Object safeLoginCall(com.google.gson.JsonObject jsonObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void downloadlang() {
    }
    
    private final void safeDownloadLang() {
    }
}