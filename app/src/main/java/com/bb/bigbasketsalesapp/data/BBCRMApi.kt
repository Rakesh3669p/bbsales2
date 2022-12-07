package com.bb.bigbasketsalesapp.data


import com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferModel
import com.bb.bigbasketsalesapp.ui.fragments.productList.model.ProductListModel
import com.bb.bigbasketsalesapp.ui.fragments.revenue.model.RevenueModel
import retrofit2.Response
import retrofit2.http.*

interface BBCRMApi {

    @FormUrlEncoded
    @POST("salesapp/product/list")
    suspend fun productList(
        @Query("page") pageNo:String,
        @Field("keyword") searchKey: String
    ): Response<ProductListModel>


    @POST("salesapp/offer/list")
    suspend fun offerList(@Query("keyword") searchKey: String): Response<OfferModel>

    @FormUrlEncoded
    @POST("crm/customer/all-sales")
    suspend fun revenueList(@FieldMap params: Map<String, String>): Response<RevenueModel>

}