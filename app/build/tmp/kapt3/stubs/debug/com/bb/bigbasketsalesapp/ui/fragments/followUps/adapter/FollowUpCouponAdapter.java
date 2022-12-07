package com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\nH\u0016J\u001c\u0010\u0018\u001a\u00020\f2\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nH\u0016J>\u0010\u001e\u001a\u00020\f26\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005J>\u0010 \u001a\u00020\f26\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005R@\u0010\u0004\u001a4\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00060\u00060\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R@\u0010\u0016\u001a4\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/adapter/FollowUpCouponAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/adapter/FollowUpCouponAdapter$ViewHolder;", "()V", "applyCouponClickListener", "Lkotlin/Function2;", "Lcom/bb/bigbasketsalesapp/ui/fragments/offers/model/OfferData;", "Lkotlin/ParameterName;", "name", "data", "", "position", "", "context", "Landroid/content/Context;", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "removeCouponClickListener", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnApplyClickListener", "listener", "setOnRemoveCouponClickListener", "ViewHolder", "BBSales_debug"})
public final class FollowUpCouponAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter.FollowUpCouponAdapter.ViewHolder> {
    private android.content.Context context;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferData> diffUtil = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferData> differ = null;
    private kotlin.jvm.functions.Function2<? super com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferData, ? super java.lang.Integer, kotlin.Unit> applyCouponClickListener;
    private kotlin.jvm.functions.Function2<? super com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferData, ? super java.lang.Integer, kotlin.Unit> removeCouponClickListener;
    
    @javax.inject.Inject()
    public FollowUpCouponAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferData> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter.FollowUpCouponAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter.FollowUpCouponAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnApplyClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferData, ? super java.lang.Integer, kotlin.Unit> listener) {
    }
    
    public final void setOnRemoveCouponClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferData, ? super java.lang.Integer, kotlin.Unit> listener) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/adapter/FollowUpCouponAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/bb/bigbasketsalesapp/databinding/ItemAddFollowupCouponsBinding;", "(Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/adapter/FollowUpCouponAdapter;Lcom/bb/bigbasketsalesapp/databinding/ItemAddFollowupCouponsBinding;)V", "bind", "", "data", "Lcom/bb/bigbasketsalesapp/ui/fragments/offers/model/OfferData;", "BBSales_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.bb.bigbasketsalesapp.databinding.ItemAddFollowupCouponsBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.bb.bigbasketsalesapp.databinding.ItemAddFollowupCouponsBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferData data) {
        }
    }
}