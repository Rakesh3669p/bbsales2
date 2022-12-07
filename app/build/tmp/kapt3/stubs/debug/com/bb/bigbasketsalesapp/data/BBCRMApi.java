package com.bb.bigbasketsalesapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/bb/bigbasketsalesapp/data/BBCRMApi;", "", "offerList", "Lretrofit2/Response;", "Lcom/bb/bigbasketsalesapp/ui/fragments/offers/model/OfferModel;", "searchKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productList", "Lcom/bb/bigbasketsalesapp/ui/fragments/productList/model/ProductListModel;", "pageNo", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "revenueList", "Lcom/bb/bigbasketsalesapp/ui/fragments/revenue/model/RevenueModel;", "params", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "BBSales_debug"})
public abstract interface BBCRMApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "salesapp/product/list")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object productList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String pageNo, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "keyword")
    java.lang.String searchKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.productList.model.ProductListModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "salesapp/offer/list")
    public abstract java.lang.Object offerList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "keyword")
    java.lang.String searchKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "crm/customer/all-sales")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object revenueList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.FieldMap()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.revenue.model.RevenueModel>> continuation);
}