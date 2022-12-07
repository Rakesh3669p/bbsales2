package com.bb.bigbasketsalesapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00e6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0014\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\u0018\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\b2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ/\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\'\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\b2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJG\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J7\u0010/\u001a\b\u0012\u0004\u0012\u0002000\b2\u0006\u00101\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u001f\u00103\u001a\b\u0012\u0004\u0012\u0002040\b2\u0006\u0010\u0014\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u00105\u001a\b\u0012\u0004\u0012\u0002060\b2\u0006\u0010\u0018\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u00107\u001a\b\u0012\u0004\u0012\u0002080\b2\u0006\u0010\u0018\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\b2\u0006\u0010\u0018\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J+\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J/\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\b2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u001f\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\b2\u0006\u0010\u0018\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J/\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\b2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010D\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\'\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\b2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ+\u0010G\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ7\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\b2\u0006\u0010L\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u001f\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\b2\u0006\u0010,\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\'\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010S\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ+\u0010T\u001a\b\u0012\u0004\u0012\u00020U0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ7\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\b2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u001f\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010^\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006_"}, d2 = {"Lcom/bb/bigbasketsalesapp/data/BBSalesRepository;", "", "()V", "salesService", "Lcom/bb/bigbasketsalesapp/data/BBCRMApi;", "service", "Lcom/bb/bigbasketsalesapp/data/BBSalesApi;", "addFollowUp", "Lretrofit2/Response;", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/CommonModel;", "jsonObject", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changePasswordLogin", "Lcom/bb/bigbasketsalesapp/ui/fragments/changePasswordLogin/model/ChangePasswordLoginModel;", "params", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCustomer", "customerId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "followUpDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/model/FollowUpsDropdownModel;", "organisationId", "followUpList", "Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/model/FollowUpModel;", "enquiryId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forgotPassword", "Lcom/bb/bigbasketsalesapp/ui/loginSignUp/model/ForgotPasswordModel;", "code", "flag", "getChatList", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/ChatListModel;", "userId", "employeeId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerData", "Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/GetCustomerDetails;", "getCustomerList", "Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/model/CustomerListModel;", "pageNo", "pageSize", "searchKeyword", "divisionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmployeeList", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/EmployeeListModel;", "currentPage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEnquiryDetails", "Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/GetEnquiryData;", "getEnquiryStatusListDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/EnquiryStatusListModel;", "getEnquiryTypeListDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/EnquiryListModel;", "getIndustryListDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/IndustryListModel;", "getNotificationMessageCount", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/NotificationAnMessageCount;", "getSalesAchievementsAndTargets", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/SalesAchievementsAndTargetsModel;", "year", "getSourceListDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/SourceListModel;", "getTilesData", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/TileDataModel;", "month", "getUserProfile", "Lcom/bb/bigbasketsalesapp/ui/fragments/profile/model/GetUserProfileModel;", "logOut", "login", "Lcom/bb/bigbasketsalesapp/ui/loginSignUp/model/LoginModel;", "notificationList", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/NotificationModel;", "divisionID", "branchID", "userID", "offerList", "Lcom/bb/bigbasketsalesapp/ui/fragments/offers/model/OfferModel;", "productList", "Lcom/bb/bigbasketsalesapp/ui/fragments/productList/model/ProductListModel;", "searchKey", "revenueList", "Lcom/bb/bigbasketsalesapp/ui/fragments/revenue/model/RevenueModel;", "saveCustomerDetails", "Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/SaveCustomerBasicsModel;", "sendMessage", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/SendMessageModel;", "message", "updateEnquiryDetails", "updateLocation", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/LocationUpdateModel;", "updateUserProfile", "BBSales_debug"})
public final class BBSalesRepository {
    private final com.bb.bigbasketsalesapp.data.BBSalesApi service = null;
    private final com.bb.bigbasketsalesapp.data.BBCRMApi salesService = null;
    
    @javax.inject.Inject()
    public BBSalesRepository() {
        super();
    }
    
    /**
     * SALES API
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.loginSignUp.model.LoginModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object changePasswordLogin(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.changePasswordLogin.model.ChangePasswordLoginModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String employeeId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.profile.model.GetUserProfileModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateUserProfile(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveCustomerDetails(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.SaveCustomerBasicsModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getIndustryListDropDown(@org.jetbrains.annotations.NotNull()
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.IndustryListModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSourceListDropDown(@org.jetbrains.annotations.NotNull()
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.SourceListModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEnquiryTypeListDropDown(@org.jetbrains.annotations.NotNull()
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.EnquiryListModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEnquiryStatusListDropDown(@org.jetbrains.annotations.NotNull()
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.EnquiryStatusListModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSalesAchievementsAndTargets(@org.jetbrains.annotations.NotNull()
    java.lang.String employeeId, @org.jetbrains.annotations.NotNull()
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    java.lang.String year, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.SalesAchievementsAndTargetsModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCustomerList(@org.jetbrains.annotations.NotNull()
    java.lang.String pageNo, @org.jetbrains.annotations.NotNull()
    java.lang.String pageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String searchKeyword, @org.jetbrains.annotations.NotNull()
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    java.lang.String divisionId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerListModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteCustomer(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCustomerData(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.GetCustomerDetails>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEnquiryDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.GetEnquiryData>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTilesData(@org.jetbrains.annotations.NotNull()
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    java.lang.String employeeId, @org.jetbrains.annotations.NotNull()
    java.lang.String month, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.TileDataModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateEnquiryDetails(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object notificationList(@org.jetbrains.annotations.NotNull()
    java.lang.String divisionID, @org.jetbrains.annotations.NotNull()
    java.lang.String branchID, @org.jetbrains.annotations.NotNull()
    java.lang.String userID, @org.jetbrains.annotations.NotNull()
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.NotificationModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEmployeeList(@org.jetbrains.annotations.NotNull()
    java.lang.String currentPage, @org.jetbrains.annotations.NotNull()
    java.lang.String pageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String searchKeyword, @org.jetbrains.annotations.NotNull()
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeListModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getChatList(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String employeeId, @org.jetbrains.annotations.NotNull()
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatListModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String employeeId, @org.jetbrains.annotations.NotNull()
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.SendMessageModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addFollowUp(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object followUpList(@org.jetbrains.annotations.NotNull()
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    java.lang.String enquiryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.followUps.model.FollowUpModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object followUpDropDown(@org.jetbrains.annotations.NotNull()
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.followUps.model.FollowUpsDropdownModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object forgotPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    java.lang.String flag, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.loginSignUp.model.ForgotPasswordModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object logOut(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNotificationMessageCount(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.NotificationAnMessageCount>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateLocation(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.LocationUpdateModel>> continuation) {
        return null;
    }
    
    /**
     * CRM APIS
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object productList(@org.jetbrains.annotations.NotNull()
    java.lang.String pageNo, @org.jetbrains.annotations.NotNull()
    java.lang.String searchKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.productList.model.ProductListModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object offerList(@org.jetbrains.annotations.NotNull()
    java.lang.String searchKeyword, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object revenueList(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.revenue.model.RevenueModel>> continuation) {
        return null;
    }
}