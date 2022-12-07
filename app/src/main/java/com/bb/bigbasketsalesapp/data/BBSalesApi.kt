package com.bb.bigbasketsalesapp.data


import com.bb.bigbasketsalesapp.ui.fragments.changePasswordLogin.model.ChangePasswordLoginModel
import com.bb.bigbasketsalesapp.ui.fragments.commonModel.*
import com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerListModel
import com.bb.bigbasketsalesapp.ui.fragments.followUps.model.FollowUpModel
import com.bb.bigbasketsalesapp.ui.fragments.followUps.model.FollowUpsDropdownModel
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.GetCustomerDetails
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.GetEnquiryData
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.SaveCustomerBasicsModel
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatListModel
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeListModel
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.NotificationModel
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.SendMessageModel
import com.bb.bigbasketsalesapp.ui.fragments.profile.model.GetUserProfileModel
import com.bb.bigbasketsalesapp.ui.loginSignUp.model.ForgotPasswordModel
import com.bb.bigbasketsalesapp.ui.loginSignUp.model.LoginModel
import com.google.gson.JsonObject
import retrofit2.Response
import retrofit2.http.*

interface BBSalesApi {

    @POST("Login/UserLogin")
    suspend fun login(@Body jsonObject: JsonObject): Response<LoginModel>

    @POST("RoleAssignment/ChangePassword")
    suspend fun changePasswordLogin(@QueryMap params: Map<String, String>): Response<ChangePasswordLoginModel>

    @GET("Employee/GetEmployeeDetailsById")
    suspend fun getUserProfile(
        @Query("Employee_Id") employeeId: String,
        @Query("UserId") userId: String
    ): Response<GetUserProfileModel>

    @POST("Employee/Employee_Save")
    suspend fun updateUserProfile(
        @Body jsonObject: JsonObject
    ): Response<CommonModel>

    @POST("Customer/Customer_Save")
    suspend fun saveCustomerDetails(@Body jsonObject: JsonObject): Response<SaveCustomerBasicsModel>

    @GET("Industry/IndustryList")
    suspend fun getIndustryListDropDown(@Query("OrganisationId") organisationId: String): Response<IndustryListModel>

    @GET("Source/SourceList")
    suspend fun getSourceListDropDown(@Query("OrganisationId") organisationId: String): Response<SourceListModel>

    @GET("EnquiryType/EnquiryTypeList")
    suspend fun getEnquiryTypeListDropDown(@Query("OrganisationId") organisationId: String): Response<EnquiryListModel>

    @GET("EnquiryStatus/EnquiryStatusList")
    suspend fun getEnquiryStatusListDropDown(@Query("OrganisationId") organisationId: String): Response<EnquiryStatusListModel>

    @GET("Target/YearlySalesManAchievementIndexList")
    suspend fun getSalesAchievementsAndTargets(
        @Query("EmployeeID") employeeID: String,
        @Query("OrganisationID") organisationID: String,
        @Query("Year") year: String,
    ): Response<SalesAchievementsAndTargetsModel>

    @GET("Customer/CustomerList")
    suspend fun getCustomerList(
        @Query("CurrentPage") currentPage: String,
        @Query("PageSize") pageSize: String,
        @Query("SearchKeyWord") searchKeyWord: String,
        @Query("OrganisationId") organisationId: String,
        @Query("DivisionId") divisionId: String,
        @Query("UserID") UserID: String,
    ): Response<CustomerListModel>


    @GET("Customer/Customer_Delete")
    suspend fun deleteCustomer(
        @Query("Customer_Id") customerId: String,
    ): Response<CommonModel>


    @GET("Customer/Customer_Edit")
    suspend fun getCustomerDetails(
        @Query("Customer_Id") customerId: String,
        @Query("UserId") userId: String,
    ): Response<GetCustomerDetails>

    @GET("Enquiry/EditEnquiry")
    suspend fun getEnquiryDetails(
        @Query("CustomerID") customerId: String,
    ): Response<GetEnquiryData>

    @GET("Dashboard/TileData")
    suspend fun getTileData(
        @Query("OrganisationId") organisationId: String,
        @Query("EmployeeId") employeeId: String,
        @Query("month") month: String
    ): Response<TileDataModel>

    @POST("Enquiry/EnquirySave")
    suspend fun updateEnquiryDetails(
        @Body jsonObject: JsonObject
    ): Response<CommonModel>


    @GET("Notification/NotificationList")
    suspend fun notificationList(
        @Query("DivisionID") divisionID: String,
        @Query("BranchID") branchID: String,
        @Query("UserID") userID: String,
        @Query("OrganisationId") organisationId: String
    ): Response<NotificationModel>

    @GET("Employee/EmployeeList")
    suspend fun getEmployeeList(
        @Query("CurrentPage") currentPage: String,
        @Query("PageSize") pageSize: String,
        @Query("SearchKeyWord") SearchKeyWord: String,
        @Query("OrganisationId") organisationId: String
    ): Response<EmployeeListModel>

    @POST("Chat/EmployeeChatList")
    suspend fun chatList(
        @Query("UserID") userID: String,
        @Query("EmployeeID") employeeID: String,
        @Query("OrganisationID") organisationID: String,
    ): Response<ChatListModel>


    @POST("Chat/UserChatSave")
    suspend fun sendMessage(
        @Query("UserID") userID: String,
        @Query("EmployeeID") employeeID: String,
        @Query("OrganisationID") organisationID: String,
        @Query("SenderMessage") senderMessage: String,
    ): Response<SendMessageModel>


    @GET("Followup/FollowupList")
    suspend fun followUps(
        @Query("OrganisationID") organisationID: String,
        @Query("EnquiryID") enquiryID: String
    ): Response<FollowUpModel>


    @GET("Followup/FollowupStatusList")
    suspend fun followUpDropDown(
        @Query("OrganisationID") organisationID: String,
    ): Response<FollowUpsDropdownModel>

    @POST("Followup/AddFollowUp")
    suspend fun addFollowUp(
        @Body jsonObject: JsonObject,
    ): Response<CommonModel>

    @GET("ForgotPassword/Index")
    suspend fun forgotPassword(
        @Query("Code") numberEmail:String,
        @Query("Flag") from:String,
    ): Response<ForgotPasswordModel>

    @POST("UserLog/InsertLog")
    suspend fun logOut(
        @QueryMap params: Map<String, String>,
    ): Response<CommonModel>


    @POST("UserLocations/SaveUserLocations")
    suspend fun saveUserLocation(
        @Body params: JsonObject,
    ): Response<LocationUpdateModel>


    @GET("Notification/Notification_ChatCount")
    suspend fun getNotificationAndMobileCount(
        @QueryMap params: Map<String, String>
    ): Response<NotificationAnMessageCount>

}