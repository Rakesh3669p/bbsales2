package com.bb.bigbasketsalesapp.ui.fragments.customersList.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001(B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\fH\u0016J\u001c\u0010\u001a\u001a\u00020\u000e2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\fH\u0016J>\u0010 \u001a\u00020\u000e26\u0010!\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007J)\u0010\"\u001a\u00020\u000e2!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u0017J)\u0010#\u001a\u00020\u000e2!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u0017J \u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\'\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R@\u0010\u0006\u001a4\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\b0\b0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/adapter/CustomerListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/adapter/CustomerListAdapter$ViewHolder;", "()V", "context", "Landroid/content/Context;", "deleteCustomerClickListener", "Lkotlin/Function2;", "Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/model/CustomerData;", "Lkotlin/ParameterName;", "name", "data", "", "position", "", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "editCustomerClickListener", "Lkotlin/Function1;", "followUpClickListener", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnDeleteCustomerClickListener", "listener", "setOnEditCustomerClickListener", "setOnfollowUpClickListener", "showMenuPopUp", "binding", "Lcom/bb/bigbasketsalesapp/databinding/ItemCutomersBinding;", "adapterPosition", "ViewHolder", "BBSales_debug"})
public final class CustomerListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.bb.bigbasketsalesapp.ui.fragments.customersList.adapter.CustomerListAdapter.ViewHolder> {
    private android.content.Context context;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData> diffUtil = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData> differ = null;
    private kotlin.jvm.functions.Function1<? super com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData, kotlin.Unit> followUpClickListener;
    private kotlin.jvm.functions.Function1<? super com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData, kotlin.Unit> editCustomerClickListener;
    private kotlin.jvm.functions.Function2<? super com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData, ? super java.lang.Integer, kotlin.Unit> deleteCustomerClickListener;
    
    @javax.inject.Inject()
    public CustomerListAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.bb.bigbasketsalesapp.ui.fragments.customersList.adapter.CustomerListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.ui.fragments.customersList.adapter.CustomerListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final void showMenuPopUp(com.bb.bigbasketsalesapp.databinding.ItemCutomersBinding binding, com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData data, int adapterPosition) {
    }
    
    public final void setOnEditCustomerClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData, kotlin.Unit> listener) {
    }
    
    public final void setOnfollowUpClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData, kotlin.Unit> listener) {
    }
    
    public final void setOnDeleteCustomerClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData, ? super java.lang.Integer, kotlin.Unit> listener) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/adapter/CustomerListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemCustomerBinding", "Lcom/bb/bigbasketsalesapp/databinding/ItemCutomersBinding;", "(Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/adapter/CustomerListAdapter;Lcom/bb/bigbasketsalesapp/databinding/ItemCutomersBinding;)V", "bind", "", "data", "Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/model/CustomerData;", "BBSales_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.bb.bigbasketsalesapp.databinding.ItemCutomersBinding itemCustomerBinding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.bb.bigbasketsalesapp.databinding.ItemCutomersBinding itemCustomerBinding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData data) {
        }
    }
}