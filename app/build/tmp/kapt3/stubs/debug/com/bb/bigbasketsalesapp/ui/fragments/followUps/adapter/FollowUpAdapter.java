package com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\b0\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/adapter/FollowUpAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/adapter/FollowUpAdapter$ViewHolder;", "()V", "context", "Landroid/content/Context;", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/model/Follow;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "BBSales_debug"})
public final class FollowUpAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter.FollowUpAdapter.ViewHolder> {
    private android.content.Context context;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.bb.bigbasketsalesapp.ui.fragments.followUps.model.Follow> diffUtil = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.AsyncListDiffer<com.bb.bigbasketsalesapp.ui.fragments.followUps.model.Follow> differ = null;
    
    @javax.inject.Inject()
    public FollowUpAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.AsyncListDiffer<com.bb.bigbasketsalesapp.ui.fragments.followUps.model.Follow> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter.FollowUpAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.ui.fragments.followUps.adapter.FollowUpAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/adapter/FollowUpAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemFollowUpsBinding", "Lcom/bb/bigbasketsalesapp/databinding/ItemFollowUpsBinding;", "(Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/adapter/FollowUpAdapter;Lcom/bb/bigbasketsalesapp/databinding/ItemFollowUpsBinding;)V", "bind", "", "data", "Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/model/Follow;", "BBSales_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.bb.bigbasketsalesapp.databinding.ItemFollowUpsBinding itemFollowUpsBinding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.bb.bigbasketsalesapp.databinding.ItemFollowUpsBinding itemFollowUpsBinding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.bb.bigbasketsalesapp.ui.fragments.followUps.model.Follow data) {
        }
    }
}