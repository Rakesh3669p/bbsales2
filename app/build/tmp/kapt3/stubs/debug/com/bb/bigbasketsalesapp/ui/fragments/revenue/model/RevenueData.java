package com.bb.bigbasketsalesapp.ui.fragments.revenue.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u000fH\u00c6\u0003J\t\u0010)\u001a\u00020\bH\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0001H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0001H\u00c6\u0003J\t\u0010/\u001a\u00020\bH\u00c6\u0003J\t\u00100\u001a\u00020\bH\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u0097\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u000fH\u00d6\u0001J\t\u00109\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015\u00a8\u0006:"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/revenue/model/RevenueData;", "", "city", "", "crm_unique_id", "customer_name", "delivery_status", "discount", "", "grand_total", "order_date", "order_id", "order_status", "payment_status", "sale_primary_id", "", "tax", "total", "usr_from", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDDLjava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCrm_unique_id", "()Ljava/lang/Object;", "getCustomer_name", "getDelivery_status", "getDiscount", "()D", "getGrand_total", "getOrder_date", "getOrder_id", "getOrder_status", "getPayment_status", "getSale_primary_id", "()I", "getTax", "getTotal", "getUsr_from", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "BBSales_debug"})
public final class RevenueData {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String city = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object crm_unique_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String customer_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object delivery_status = null;
    private final double discount = 0.0;
    private final double grand_total = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String order_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String order_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String order_status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String payment_status = null;
    private final int sale_primary_id = 0;
    private final double tax = 0.0;
    private final double total = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String usr_from = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.ui.fragments.revenue.model.RevenueData copy(@org.jetbrains.annotations.Nullable()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.Object crm_unique_id, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_name, @org.jetbrains.annotations.NotNull()
    java.lang.Object delivery_status, double discount, double grand_total, @org.jetbrains.annotations.NotNull()
    java.lang.String order_date, @org.jetbrains.annotations.NotNull()
    java.lang.String order_id, @org.jetbrains.annotations.NotNull()
    java.lang.String order_status, @org.jetbrains.annotations.NotNull()
    java.lang.String payment_status, int sale_primary_id, double tax, double total, @org.jetbrains.annotations.NotNull()
    java.lang.String usr_from) {
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
    
    public RevenueData(@org.jetbrains.annotations.Nullable()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.Object crm_unique_id, @org.jetbrains.annotations.NotNull()
    java.lang.String customer_name, @org.jetbrains.annotations.NotNull()
    java.lang.Object delivery_status, double discount, double grand_total, @org.jetbrains.annotations.NotNull()
    java.lang.String order_date, @org.jetbrains.annotations.NotNull()
    java.lang.String order_id, @org.jetbrains.annotations.NotNull()
    java.lang.String order_status, @org.jetbrains.annotations.NotNull()
    java.lang.String payment_status, int sale_primary_id, double tax, double total, @org.jetbrains.annotations.NotNull()
    java.lang.String usr_from) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCrm_unique_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomer_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDelivery_status() {
        return null;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double getDiscount() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getGrand_total() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrder_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrder_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrder_status() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayment_status() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getSale_primary_id() {
        return 0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double getTax() {
        return 0.0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double getTotal() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsr_from() {
        return null;
    }
}