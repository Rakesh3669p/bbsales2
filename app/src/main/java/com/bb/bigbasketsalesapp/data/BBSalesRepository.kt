package com.bb.bigbasketsalesapp.data

import com.google.gson.JsonObject
import javax.inject.Inject

class BBSalesRepository @Inject constructor() {
    private val service = RetrofitInstance.api
    private val salesService = RetrofitCRMInstance.api

    /**
     * SALES API
     */
    suspend fun login(jsonObject: JsonObject) = service.login(jsonObject)

    suspend fun changePasswordLogin(params: Map<String, String>) =
        service.changePasswordLogin(params)

    suspend fun getUserProfile(employeeId: String, userId: String) =
        service.getUserProfile(employeeId, userId)

    suspend fun updateUserProfile(jsonObject: JsonObject) =
        service.updateUserProfile(jsonObject = jsonObject)

    suspend fun saveCustomerDetails(jsonObject: JsonObject) =
        service.saveCustomerDetails(jsonObject)

    suspend fun getIndustryListDropDown(organisationId: String) =
        service.getIndustryListDropDown(organisationId)

    suspend fun getSourceListDropDown(organisationId: String) =
        service.getSourceListDropDown(organisationId)

    suspend fun getEnquiryTypeListDropDown(organisationId: String) =
        service.getEnquiryTypeListDropDown(organisationId)

    suspend fun getEnquiryStatusListDropDown(organisationId: String) =
        service.getEnquiryStatusListDropDown(organisationId)

    suspend fun getSalesAchievementsAndTargets(
        employeeId: String,
        organisationId: String,
        year: String
    ) = service.getSalesAchievementsAndTargets(employeeId, organisationId, year)

    suspend fun getCustomerList(
        pageNo: String,
        pageSize: String,
        searchKeyword: String,
        organisationId: String,
        divisionId: String,
        userId: String
    ) =
        service.getCustomerList(pageNo, pageSize, searchKeyword, organisationId, divisionId, userId)

    suspend fun deleteCustomer(customerId: String) =
        service.deleteCustomer(customerId)


    suspend fun getCustomerData(customerId: String, userId: String) =
        service.getCustomerDetails(customerId, userId)

    suspend fun getEnquiryDetails(customerId: String) =
        service.getEnquiryDetails(customerId = customerId)

    suspend fun getTilesData(
        organisationId: String,
        employeeId: String,
        month: String,
    ) =
        service.getTileData(organisationId, employeeId, month)

    suspend fun updateEnquiryDetails(jsonObject: JsonObject) =
        service.updateEnquiryDetails(jsonObject)

    suspend fun notificationList(
        divisionID: String,
        branchID: String,
        userID: String,
        organisationId: String
    ) = service.notificationList(divisionID, branchID, userID, organisationId)


    suspend fun getEmployeeList(
        currentPage: String,
        pageSize: String,
        searchKeyword: String,
        organisationId: String
    ) = service.getEmployeeList(currentPage, pageSize, searchKeyword, organisationId)

    suspend fun getChatList(
        userId: String,
        employeeId: String,
        organisationId: String
    ) = service.chatList(userId, employeeId, organisationId)

    suspend fun sendMessage(
        userId: String,
        employeeId: String,
        organisationId: String,
        message:String
    ) = service.sendMessage(userId, employeeId, organisationId,message)

    suspend fun addFollowUp(jsonObject: JsonObject) = service.addFollowUp(jsonObject)

    suspend fun followUpList(organisationId: String, enquiryId: String) = service.followUps(organisationId, enquiryId)

    suspend fun followUpDropDown(organisationId: String) = service.followUpDropDown(organisationId)

    suspend fun forgotPassword(code:String,flag:String) = service.forgotPassword(code,flag)

    suspend fun logOut(params: Map<String, String>) = service.logOut(params)

    suspend fun getNotificationMessageCount(params: Map<String, String>) = service.getNotificationAndMobileCount(params)

    suspend fun updateLocation(jsonObject: JsonObject) = service.saveUserLocation(jsonObject)

    /**
     * CRM APIS
     */


    suspend fun productList(
        pageNo: String,searchKey: String
    ) = salesService.productList(pageNo,searchKey)

    suspend fun offerList(searchKeyword: String) = salesService.offerList(searchKeyword)

    suspend fun revenueList(params: Map<String, String>) = salesService.revenueList(params)




}