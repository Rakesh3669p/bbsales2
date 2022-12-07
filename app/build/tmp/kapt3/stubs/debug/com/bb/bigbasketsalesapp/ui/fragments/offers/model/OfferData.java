package com.bb.bigbasketsalesapp.ui.fragments.offers.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001B\u00a3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018J\t\u00101\u001a\u00020\u0001H\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\u0004H\u00c6\u0003J\t\u00104\u001a\u00020\u0004H\u00c6\u0003J\t\u00105\u001a\u00020\u0006H\u00c6\u0003J\t\u00106\u001a\u00020\u0006H\u00c6\u0003J\t\u00107\u001a\u00020\u0004H\u00c6\u0003J\t\u00108\u001a\u00020\u0006H\u00c6\u0003J\t\u00109\u001a\u00020\u0006H\u00c6\u0003J\t\u0010:\u001a\u00020\u0006H\u00c6\u0003J\t\u0010;\u001a\u00020\u0017H\u00c6\u0003J\t\u0010<\u001a\u00020\u0004H\u00c6\u0003J\t\u0010=\u001a\u00020\u0006H\u00c6\u0003J\t\u0010>\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010@\u001a\u00020\u0006H\u00c6\u0003J\t\u0010A\u001a\u00020\u0004H\u00c6\u0003J\t\u0010B\u001a\u00020\u0006H\u00c6\u0003J\t\u0010C\u001a\u00020\u0004H\u00c6\u0003J\u00c9\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u00c6\u0001J\u0013\u0010E\u001a\u00020\u00172\b\u0010F\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010G\u001a\u00020\u0004H\u00d6\u0001J\t\u0010H\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010!\"\u0004\b\"\u0010#R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001e\u00a8\u0006I"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/offers/model/OfferData;", "", "cat_name", "coupon_id", "", "cpn_desc", "", "cpn_title", "image", "ofr_code", "ofr_min_amount", "ofr_type", "ofr_value", "ofr_value_type", "purchase_amount", "purchase_number", "purchase_type", "subcat_name", "valid_days", "valid_from", "valid_to", "validity_type", "isApplied", "", "(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCat_name", "()Ljava/lang/Object;", "getCoupon_id", "()I", "getCpn_desc", "()Ljava/lang/String;", "getCpn_title", "getImage", "()Z", "setApplied", "(Z)V", "getOfr_code", "getOfr_min_amount", "getOfr_type", "getOfr_value", "getOfr_value_type", "getPurchase_amount", "getPurchase_number", "getPurchase_type", "getSubcat_name", "getValid_days", "getValid_from", "getValid_to", "getValidity_type", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "BBSales_debug"})
public final class OfferData {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object cat_name = null;
    private final int coupon_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cpn_desc = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cpn_title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String image = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ofr_code = null;
    private final int ofr_min_amount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ofr_type = null;
    private final int ofr_value = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ofr_value_type = null;
    private final int purchase_amount = 0;
    private final int purchase_number = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String purchase_type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String subcat_name = null;
    private final int valid_days = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String valid_from = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String valid_to = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String validity_type = null;
    private boolean isApplied;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferData copy(@org.jetbrains.annotations.NotNull()
    java.lang.Object cat_name, int coupon_id, @org.jetbrains.annotations.NotNull()
    java.lang.String cpn_desc, @org.jetbrains.annotations.NotNull()
    java.lang.String cpn_title, @org.jetbrains.annotations.Nullable()
    java.lang.String image, @org.jetbrains.annotations.NotNull()
    java.lang.String ofr_code, int ofr_min_amount, @org.jetbrains.annotations.NotNull()
    java.lang.String ofr_type, int ofr_value, @org.jetbrains.annotations.NotNull()
    java.lang.String ofr_value_type, int purchase_amount, int purchase_number, @org.jetbrains.annotations.NotNull()
    java.lang.String purchase_type, @org.jetbrains.annotations.NotNull()
    java.lang.String subcat_name, int valid_days, @org.jetbrains.annotations.NotNull()
    java.lang.String valid_from, @org.jetbrains.annotations.NotNull()
    java.lang.String valid_to, @org.jetbrains.annotations.NotNull()
    java.lang.String validity_type, boolean isApplied) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public OfferData(@org.jetbrains.annotations.NotNull()
    java.lang.Object cat_name, int coupon_id, @org.jetbrains.annotations.NotNull()
    java.lang.String cpn_desc, @org.jetbrains.annotations.NotNull()
    java.lang.String cpn_title, @org.jetbrains.annotations.Nullable()
    java.lang.String image, @org.jetbrains.annotations.NotNull()
    java.lang.String ofr_code, int ofr_min_amount, @org.jetbrains.annotations.NotNull()
    java.lang.String ofr_type, int ofr_value, @org.jetbrains.annotations.NotNull()
    java.lang.String ofr_value_type, int purchase_amount, int purchase_number, @org.jetbrains.annotations.NotNull()
    java.lang.String purchase_type, @org.jetbrains.annotations.NotNull()
    java.lang.String subcat_name, int valid_days, @org.jetbrains.annotations.NotNull()
    java.lang.String valid_from, @org.jetbrains.annotations.NotNull()
    java.lang.String valid_to, @org.jetbrains.annotations.NotNull()
    java.lang.String validity_type, boolean isApplied) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCat_name() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getCoupon_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCpn_desc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCpn_title() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOfr_code() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getOfr_min_amount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOfr_type() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getOfr_value() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOfr_value_type() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getPurchase_amount() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getPurchase_number() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPurchase_type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubcat_name() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getValid_days() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValid_from() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValid_to() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValidity_type() {
        return null;
    }
    
    public final boolean component19() {
        return false;
    }
    
    public final boolean isApplied() {
        return false;
    }
    
    public final void setApplied(boolean p0) {
    }
}