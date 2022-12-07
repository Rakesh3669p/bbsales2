package com.bb.bigbasketsalesapp.ui.fragments.productList.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0001H\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\bH\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0001H\u00c6\u0003J\t\u0010-\u001a\u00020\bH\u00c6\u0003J\t\u0010.\u001a\u00020\u0010H\u00c6\u0003J\u0083\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\bH\u00c6\u0001J\u0013\u00100\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0003H\u00d6\u0001J\t\u00103\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019\u00a8\u00064"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/productList/model/Product;", "", "actual_price", "", "associative_products", "", "Lcom/bb/bigbasketsalesapp/ui/fragments/productList/model/AssociativeProduct;", "category_name", "", "image", "Lcom/bb/bigbasketsalesapp/ui/fragments/productList/model/Image;", "offer", "product_id", "product_name", "product_type", "sale_price", "", "special_ofr_price", "subcategory_name", "(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/String;ZLjava/lang/Object;Ljava/lang/String;)V", "getActual_price", "()I", "getAssociative_products", "()Ljava/util/List;", "getCategory_name", "()Ljava/lang/String;", "getImage", "getOffer", "getProduct_id", "getProduct_name", "()Ljava/lang/Object;", "getProduct_type", "getSale_price", "()Z", "getSpecial_ofr_price", "getSubcategory_name", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "BBSales_debug"})
public final class Product {
    private final int actual_price = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.bb.bigbasketsalesapp.ui.fragments.productList.model.AssociativeProduct> associative_products = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String category_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.bb.bigbasketsalesapp.ui.fragments.productList.model.Image> image = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String offer = null;
    private final int product_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object product_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String product_type = null;
    private final boolean sale_price = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object special_ofr_price = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String subcategory_name = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.ui.fragments.productList.model.Product copy(int actual_price, @org.jetbrains.annotations.NotNull()
    java.util.List<com.bb.bigbasketsalesapp.ui.fragments.productList.model.AssociativeProduct> associative_products, @org.jetbrains.annotations.NotNull()
    java.lang.String category_name, @org.jetbrains.annotations.NotNull()
    java.util.List<com.bb.bigbasketsalesapp.ui.fragments.productList.model.Image> image, @org.jetbrains.annotations.NotNull()
    java.lang.String offer, int product_id, @org.jetbrains.annotations.NotNull()
    java.lang.Object product_name, @org.jetbrains.annotations.NotNull()
    java.lang.String product_type, boolean sale_price, @org.jetbrains.annotations.NotNull()
    java.lang.Object special_ofr_price, @org.jetbrains.annotations.NotNull()
    java.lang.String subcategory_name) {
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
    
    public Product(int actual_price, @org.jetbrains.annotations.NotNull()
    java.util.List<com.bb.bigbasketsalesapp.ui.fragments.productList.model.AssociativeProduct> associative_products, @org.jetbrains.annotations.NotNull()
    java.lang.String category_name, @org.jetbrains.annotations.NotNull()
    java.util.List<com.bb.bigbasketsalesapp.ui.fragments.productList.model.Image> image, @org.jetbrains.annotations.NotNull()
    java.lang.String offer, int product_id, @org.jetbrains.annotations.NotNull()
    java.lang.Object product_name, @org.jetbrains.annotations.NotNull()
    java.lang.String product_type, boolean sale_price, @org.jetbrains.annotations.NotNull()
    java.lang.Object special_ofr_price, @org.jetbrains.annotations.NotNull()
    java.lang.String subcategory_name) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getActual_price() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bb.bigbasketsalesapp.ui.fragments.productList.model.AssociativeProduct> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bb.bigbasketsalesapp.ui.fragments.productList.model.AssociativeProduct> getAssociative_products() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bb.bigbasketsalesapp.ui.fragments.productList.model.Image> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bb.bigbasketsalesapp.ui.fragments.productList.model.Image> getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOffer() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getProduct_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getProduct_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProduct_type() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getSale_price() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSpecial_ofr_price() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubcategory_name() {
        return null;
    }
}