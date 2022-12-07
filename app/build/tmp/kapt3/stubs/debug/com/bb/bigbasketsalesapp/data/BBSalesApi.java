package com.bb.bigbasketsalesapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00c2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0015\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0012\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u001b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u001f\u001a\u00020\f2\b\b\u0001\u0010 \u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ+\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\b\u0001\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010#\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJS\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010&\u001a\u00020\f2\b\b\u0001\u0010\'\u001a\u00020\f2\b\b\u0001\u0010(\u001a\u00020\f2\b\b\u0001\u0010)\u001a\u00020\f2\b\b\u0001\u0010*\u001a\u00020\f2\b\b\u0001\u0010+\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J?\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010&\u001a\u00020\f2\b\b\u0001\u0010\'\u001a\u00020\f2\b\b\u0001\u0010/\u001a\u00020\f2\b\b\u0001\u0010)\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J!\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00032\b\b\u0001\u0010\u0015\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J!\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00032\b\b\u0001\u0010)\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J!\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00032\b\b\u0001\u0010)\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J!\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00032\b\b\u0001\u0010)\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J-\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00032\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ5\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00032\b\b\u0001\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010=\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00032\b\b\u0001\u0010)\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J5\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00032\b\b\u0001\u0010)\u001a\u00020\f2\b\b\u0001\u0010B\u001a\u00020\f2\b\b\u0001\u0010C\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J+\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u00032\b\b\u0001\u0010B\u001a\u00020\f2\b\b\u0001\u0010#\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ-\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J?\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u00032\b\b\u0001\u0010K\u001a\u00020\f2\b\b\u0001\u0010L\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010)\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J!\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J?\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00032\b\b\u0001\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010S\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J!\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006V"}, d2 = {"Lcom/bb/bigbasketsalesapp/data/BBSalesApi;", "", "addFollowUp", "Lretrofit2/Response;", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/CommonModel;", "jsonObject", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changePasswordLogin", "Lcom/bb/bigbasketsalesapp/ui/fragments/changePasswordLogin/model/ChangePasswordLoginModel;", "params", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chatList", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/ChatListModel;", "userID", "employeeID", "organisationID", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCustomer", "customerId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "followUpDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/model/FollowUpsDropdownModel;", "followUps", "Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/model/FollowUpModel;", "enquiryID", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forgotPassword", "Lcom/bb/bigbasketsalesapp/ui/loginSignUp/model/ForgotPasswordModel;", "numberEmail", "from", "getCustomerDetails", "Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/GetCustomerDetails;", "userId", "getCustomerList", "Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/model/CustomerListModel;", "currentPage", "pageSize", "searchKeyWord", "organisationId", "divisionId", "UserID", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmployeeList", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/EmployeeListModel;", "SearchKeyWord", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEnquiryDetails", "Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/GetEnquiryData;", "getEnquiryStatusListDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/EnquiryStatusListModel;", "getEnquiryTypeListDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/EnquiryListModel;", "getIndustryListDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/IndustryListModel;", "getNotificationAndMobileCount", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/NotificationAnMessageCount;", "getSalesAchievementsAndTargets", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/SalesAchievementsAndTargetsModel;", "year", "getSourceListDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/SourceListModel;", "getTileData", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/TileDataModel;", "employeeId", "month", "getUserProfile", "Lcom/bb/bigbasketsalesapp/ui/fragments/profile/model/GetUserProfileModel;", "logOut", "login", "Lcom/bb/bigbasketsalesapp/ui/loginSignUp/model/LoginModel;", "notificationList", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/NotificationModel;", "divisionID", "branchID", "saveCustomerDetails", "Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/SaveCustomerBasicsModel;", "saveUserLocation", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/LocationUpdateModel;", "sendMessage", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/SendMessageModel;", "senderMessage", "updateEnquiryDetails", "updateUserProfile", "BBSales_debug"})
public abstract interface BBSalesApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "Login/UserLogin")
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject jsonObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.loginSignUp.model.LoginModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "RoleAssignment/ChangePassword")
    public abstract java.lang.Object changePasswordLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.changePasswordLogin.model.ChangePasswordLoginModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Employee/GetEmployeeDetailsById")
    public abstract java.lang.Object getUserProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "Employee_Id")
    java.lang.String employeeId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "UserId")
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.profile.model.GetUserProfileModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "Employee/Employee_Save")
    public abstract java.lang.Object updateUserProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject jsonObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "Customer/Customer_Save")
    public abstract java.lang.Object saveCustomerDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject jsonObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.SaveCustomerBasicsModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Industry/IndustryList")
    public abstract java.lang.Object getIndustryListDropDown(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "OrganisationId")
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.IndustryListModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Source/SourceList")
    public abstract java.lang.Object getSourceListDropDown(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "OrganisationId")
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.SourceListModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "EnquiryType/EnquiryTypeList")
    public abstract java.lang.Object getEnquiryTypeListDropDown(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "OrganisationId")
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.EnquiryListModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "EnquiryStatus/EnquiryStatusList")
    public abstract java.lang.Object getEnquiryStatusListDropDown(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "OrganisationId")
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.EnquiryStatusListModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Target/YearlySalesManAchievementIndexList")
    public abstract java.lang.Object getSalesAchievementsAndTargets(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "EmployeeID")
    java.lang.String employeeID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "OrganisationID")
    java.lang.String organisationID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "Year")
    java.lang.String year, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.SalesAchievementsAndTargetsModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Customer/CustomerList")
    public abstract java.lang.Object getCustomerList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "CurrentPage")
    java.lang.String currentPage, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "PageSize")
    java.lang.String pageSize, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "SearchKeyWord")
    java.lang.String searchKeyWord, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "OrganisationId")
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "DivisionId")
    java.lang.String divisionId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "UserID")
    java.lang.String UserID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerListModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Customer/Customer_Delete")
    public abstract java.lang.Object deleteCustomer(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "Customer_Id")
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Customer/Customer_Edit")
    public abstract java.lang.Object getCustomerDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "Customer_Id")
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "UserId")
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.GetCustomerDetails>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Enquiry/EditEnquiry")
    public abstract java.lang.Object getEnquiryDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "CustomerID")
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.GetEnquiryData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Dashboard/TileData")
    public abstract java.lang.Object getTileData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "OrganisationId")
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "EmployeeId")
    java.lang.String employeeId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "month")
    java.lang.String month, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.TileDataModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "Enquiry/EnquirySave")
    public abstract java.lang.Object updateEnquiryDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject jsonObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Notification/NotificationList")
    public abstract java.lang.Object notificationList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "DivisionID")
    java.lang.String divisionID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "BranchID")
    java.lang.String branchID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "UserID")
    java.lang.String userID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "OrganisationId")
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.NotificationModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Employee/EmployeeList")
    public abstract java.lang.Object getEmployeeList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "CurrentPage")
    java.lang.String currentPage, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "PageSize")
    java.lang.String pageSize, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "SearchKeyWord")
    java.lang.String SearchKeyWord, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "OrganisationId")
    java.lang.String organisationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeListModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "Chat/EmployeeChatList")
    public abstract java.lang.Object chatList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "UserID")
    java.lang.String userID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "EmployeeID")
    java.lang.String employeeID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "OrganisationID")
    java.lang.String organisationID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatListModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "Chat/UserChatSave")
    public abstract java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "UserID")
    java.lang.String userID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "EmployeeID")
    java.lang.String employeeID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "OrganisationID")
    java.lang.String organisationID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "SenderMessage")
    java.lang.String senderMessage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.SendMessageModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Followup/FollowupList")
    public abstract java.lang.Object followUps(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "OrganisationID")
    java.lang.String organisationID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "EnquiryID")
    java.lang.String enquiryID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.followUps.model.FollowUpModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Followup/FollowupStatusList")
    public abstract java.lang.Object followUpDropDown(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "OrganisationID")
    java.lang.String organisationID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.followUps.model.FollowUpsDropdownModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "Followup/AddFollowUp")
    public abstract java.lang.Object addFollowUp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject jsonObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "ForgotPassword/Index")
    public abstract java.lang.Object forgotPassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "Code")
    java.lang.String numberEmail, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "Flag")
    java.lang.String from, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.loginSignUp.model.ForgotPasswordModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "UserLog/InsertLog")
    public abstract java.lang.Object logOut(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "UserLocations/SaveUserLocations")
    public abstract java.lang.Object saveUserLocation(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.LocationUpdateModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "Notification/Notification_ChatCount")
    public abstract java.lang.Object getNotificationAndMobileCount(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.bb.bigbasketsalesapp.ui.fragments.commonModel.NotificationAnMessageCount>> continuation);
}