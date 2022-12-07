package com.bb.bigbasketsalesapp.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bb.bigbasketsalesapp.data.BBSalesRepository
import com.bb.bigbasketsalesapp.ui.fragments.changePasswordLogin.model.ChangePasswordLoginModel
import com.bb.bigbasketsalesapp.ui.fragments.commonModel.*
import com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerListModel
import com.bb.bigbasketsalesapp.ui.fragments.followUps.model.FollowUpModel
import com.bb.bigbasketsalesapp.ui.fragments.followUps.model.FollowUpsDropdownModel
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.GetCustomerDetails
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.GetEnquiryData
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.SaveCustomerBasicsModel
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.NotificationModel
import com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferModel
import com.bb.bigbasketsalesapp.ui.fragments.productList.model.ProductListModel
import com.bb.bigbasketsalesapp.ui.fragments.profile.model.GetUserProfileModel
import com.bb.bigbasketsalesapp.ui.fragments.revenue.model.RevenueModel
import com.bb.bigbasketsalesapp.ui.loginSignUp.model.ForgotPasswordModel
import com.bb.bigbasketsalesapp.utils.SessionManager
import com.bb.bigbasketsalesapp.utils.params

import com.doctorsplaza.app.utils.Resource
import com.google.gson.JsonObject
import com.google.mlkit.common.model.DownloadConditions
import com.google.mlkit.common.model.RemoteModelManager
import com.google.mlkit.nl.translate.TranslateLanguage
import com.google.mlkit.nl.translate.TranslateRemoteModel
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.TranslatorOptions
import com.gym.gymapp.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: BBSalesRepository,
    private val session: SessionManager
) : ViewModel() {

    val getUserProfile = SingleLiveEvent<Resource<GetUserProfileModel>>()
    val updateUserProfile = SingleLiveEvent<Resource<CommonModel>>()
    val changePasswordLogin = SingleLiveEvent<Resource<ChangePasswordLoginModel>>()

    val tilesData = SingleLiveEvent<Resource<TileDataModel>>()
    val salesAchievementsAndTargets = SingleLiveEvent<Resource<SalesAchievementsAndTargetsModel>>()

    val getIndustryListDropDown = SingleLiveEvent<Resource<IndustryListModel>>()
    val getEnquiryTypeListDropDown = SingleLiveEvent<Resource<EnquiryListModel>>()
    val getEnquiryStatusListDropDown = SingleLiveEvent<Resource<EnquiryStatusListModel>>()
    val getSourceListDropDown = SingleLiveEvent<Resource<SourceListModel>>()

    val customerList = SingleLiveEvent<Resource<CustomerListModel>>()
    val customerDetails = SingleLiveEvent<Resource<GetCustomerDetails>>()
    val customerDelete = SingleLiveEvent<Resource<CommonModel>>()
    val updateCustomer = SingleLiveEvent<Resource<SaveCustomerBasicsModel>>()
    val saveCustomerDetails = SingleLiveEvent<Resource<SaveCustomerBasicsModel>>()

    val enquiryDetails = SingleLiveEvent<Resource<GetEnquiryData>>()
    val updateEnquiry = SingleLiveEvent<Resource<CommonModel>>()

    val notifications = SingleLiveEvent<Resource<NotificationModel>>()

    val productList = SingleLiveEvent<Resource<ProductListModel>>()
    val offerList = SingleLiveEvent<Resource<OfferModel>>()
    val followUpList = SingleLiveEvent<Resource<FollowUpModel>>()
    val followUpDropDown = SingleLiveEvent<Resource<FollowUpsDropdownModel>>()
    val addFollowUps = SingleLiveEvent<Resource<CommonModel>>()

    val forgotPassword = SingleLiveEvent<Resource<ForgotPasswordModel>>()

    val revenueList = SingleLiveEvent<Resource<RevenueModel>>()

    val updateLocation = SingleLiveEvent<Resource<LocationUpdateModel>>()

    val logOut = SingleLiveEvent<Resource<CommonModel>>()

    val translatedString = SingleLiveEvent<Resource<String>>()

    val downloadLanguage = SingleLiveEvent<Resource<Boolean>>()

    val getNotificationMessageCount = SingleLiveEvent<Resource<NotificationAnMessageCount>>()


    /**
     * ChangePassword
     */

    fun changePasswordLogin(params: Map<String, String>) = viewModelScope.launch {
        safeChangePasswordLoginCall(params)
    }

    private suspend fun safeChangePasswordLoginCall(params: Map<String, String>) {
        changePasswordLogin.postValue(Resource.Loading())
        try {
            val response = repository.changePasswordLogin(params)
            if (response.isSuccessful)
                changePasswordLogin.postValue(Resource.Success(checkResponseBody(response.body()) as ChangePasswordLoginModel))
            else
                changePasswordLogin.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            changePasswordLogin.postValue(Resource.Error(checkThrowable(t), null))
        }
    }

    /**
     * GetUserProfile
     */

    fun getUserProfile() = viewModelScope.launch { safeGetUserProfileCall() }

    private suspend fun safeGetUserProfileCall() {
        getUserProfile.postValue(Resource.Loading())
        try {
            val response =
                repository.getUserProfile(session.employeeId.toString(), session.userId.toString())
            if (response.isSuccessful)
                getUserProfile.postValue(Resource.Success(checkResponseBody(response.body()) as GetUserProfileModel))
            else getUserProfile.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            getUserProfile.postValue(Resource.Error(checkThrowable(t), null))
        }
    }


    /**
     * update UserProfile
     */

    fun updateUserProfile(jsonObject: JsonObject) =
        viewModelScope.launch { safeUpdateUserProfileCall(jsonObject) }

    private suspend fun safeUpdateUserProfileCall(jsonObject: JsonObject) {
        updateUserProfile.postValue(Resource.Loading())
        try {
            val response =
                repository.updateUserProfile(jsonObject)
            if (response.isSuccessful)
                updateUserProfile.postValue(Resource.Success(checkResponseBody(response.body()) as CommonModel))
            else updateUserProfile.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            updateUserProfile.postValue(Resource.Error(checkThrowable(t), null))
        }
    }


    /**
     * Save Customer Basic Details
     */

    fun saveCustomerDetails(jsonObject: JsonObject) = viewModelScope.launch {
        safeCustomerDetailsCall(jsonObject)
    }

    private suspend fun safeCustomerDetailsCall(jsonObject: JsonObject) {
        saveCustomerDetails.postValue(Resource.Loading())
        try {
            val response = repository.saveCustomerDetails(jsonObject)
            if (response.isSuccessful)
                saveCustomerDetails.postValue(Resource.Success(checkResponseBody(body = response.body()) as SaveCustomerBasicsModel))
            else
                saveCustomerDetails.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            saveCustomerDetails.postValue(Resource.Error(checkThrowable(t), null))
        }
    }

    /**
     * Get All Form DropDowns
     */

    fun getIndustryListDropDown() = viewModelScope.launch { safeGetIndustryListDropDownCall() }

    private suspend fun safeGetIndustryListDropDownCall() {
        getIndustryListDropDown.postValue(Resource.Loading())
        try {
            val response =
                repository.getIndustryListDropDown(session.organisationId.toString())
            if (response.isSuccessful)
                getIndustryListDropDown.postValue(Resource.Success(checkResponseBody(response.body()) as IndustryListModel))
            else
                getIndustryListDropDown.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            getIndustryListDropDown.postValue(Resource.Error(checkThrowable(t), null))
        }

    }

    fun getSourceListDropDown() = viewModelScope.launch { safeGetSourceListDropDownCall() }

    private suspend fun safeGetSourceListDropDownCall() {
        getSourceListDropDown.postValue(Resource.Loading())
        try {
            val response =
                repository.getSourceListDropDown(session.organisationId.toString())
            if (response.isSuccessful)
                getSourceListDropDown.postValue(Resource.Success(checkResponseBody(response.body()) as SourceListModel))
            else
                getSourceListDropDown.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            getSourceListDropDown.postValue(Resource.Error(checkThrowable(t), null))
        }

    }

    fun getEnquiryTypeListDropDown() =
        viewModelScope.launch { safeGetEnquiryTypeListDropDownCall() }

    private suspend fun safeGetEnquiryTypeListDropDownCall() {
        getEnquiryTypeListDropDown.postValue(Resource.Loading())
        try {
            val response =
                repository.getEnquiryTypeListDropDown(session.organisationId.toString())
            if (response.isSuccessful)
                getEnquiryTypeListDropDown.postValue(Resource.Success(checkResponseBody(response.body()) as EnquiryListModel))
            else
                getEnquiryTypeListDropDown.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            getEnquiryTypeListDropDown.postValue(Resource.Error(checkThrowable(t), null))
        }

    }

    fun getEnquiryStatusListDropDown() =
        viewModelScope.launch { safeGetEnquiryStatusListDropDownCall() }

    private suspend fun safeGetEnquiryStatusListDropDownCall() {
        getEnquiryStatusListDropDown.postValue(Resource.Loading())
        try {
            val response =
                repository.getEnquiryStatusListDropDown(session.organisationId.toString())
            if (response.isSuccessful)
                getEnquiryStatusListDropDown.postValue(Resource.Success(checkResponseBody(response.body()) as EnquiryStatusListModel?))
            else
                getEnquiryStatusListDropDown.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            getEnquiryStatusListDropDown.postValue(Resource.Error(checkThrowable(t), null))
        }

    }


    /**
    Sales And Achievements
     */

    fun getSalesAchievementsAndTargets(selectedYear: String) =
        viewModelScope.launch { safeGetSalesAchievementsAndTargetsCall(selectedYear) }

    private suspend fun safeGetSalesAchievementsAndTargetsCall(selectedYear: String) {
        salesAchievementsAndTargets.postValue(Resource.Loading())
        try {
            val response =
                repository.getSalesAchievementsAndTargets(
                    session.employeeId.toString(),
                    session.organisationId.toString(),
                    selectedYear
                )
            if (response.isSuccessful)
                salesAchievementsAndTargets.postValue(Resource.Success(checkResponseBody(response.body()) as SalesAchievementsAndTargetsModel))
            else
                salesAchievementsAndTargets.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            salesAchievementsAndTargets.postValue(Resource.Error(checkThrowable(t), null))
        }

    }


    /**
    Customer List
     */

    fun getCustomerList(pageNo: String, pageSize: String, searchKeyword: String) =
        viewModelScope.launch { safeGetCustomerListCall(pageNo, pageSize, searchKeyword) }

    private suspend fun safeGetCustomerListCall(
        pageNo: String,
        pageSize: String,
        searchKeyword: String
    ) {
        customerList.postValue(Resource.Loading())
        try {
            val response =
                repository.getCustomerList(
                    pageNo,
                    pageSize,
                    searchKeyword,
                    session.organisationId.toString(),
                    session.divisionId.toString(),
                    session.userId.toString()
                )
            if (response.isSuccessful)
                customerList.postValue(Resource.Success(checkResponseBody(response.body()) as CustomerListModel))
            else
                customerList.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            customerList.postValue(Resource.Error(checkThrowable(t), null))
        }

    }


    /**
    Delete Customer
     */

    fun deleteCustomer(customerId: String) =
        viewModelScope.launch { safeGetCustomerListCall(customerId) }

    private suspend fun safeGetCustomerListCall(customerId: String) {
        customerDelete.postValue(Resource.Loading())
        try {
            val response = repository.deleteCustomer(customerId)
            if (response.isSuccessful)
                customerDelete.postValue(Resource.Success(checkResponseBody(response.body()) as CommonModel))
            else
                customerDelete.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            customerDelete.postValue(Resource.Error(checkThrowable(t), null))
        }
    }


    /**
    Get Customer Details
     */

    fun getCustomerDetails(customerId: String, userId: String) =
        viewModelScope.launch { safeGetCustomerDetailsCall(customerId, userId) }

    private suspend fun safeGetCustomerDetailsCall(customerId: String, userId: String) {
        customerDetails.postValue(Resource.Loading())
        try {
            val response = repository.getCustomerData(customerId, userId)
            if (response.isSuccessful)
                customerDetails.postValue(Resource.Success(checkResponseBody(response.body()) as GetCustomerDetails))
            else
                customerDetails.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            customerDetails.postValue(Resource.Error(checkThrowable(t), null))
        }

    }


    /**
    Get Enquiry Details
     */

    fun getEnquiryDetails(customerId: String) =
        viewModelScope.launch { safeGetEnquiryDetailsCall(customerId) }

    private suspend fun safeGetEnquiryDetailsCall(customerId: String) {
        enquiryDetails.postValue(Resource.Loading())
        try {
            val response = repository.getEnquiryDetails(customerId)
            if (response.isSuccessful)
                enquiryDetails.postValue(Resource.Success(checkResponseBody(response.body()) as GetEnquiryData))
            else
                enquiryDetails.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            enquiryDetails.postValue(Resource.Error(checkThrowable(t), null))
        }

    }


    /**
    Get Tiles Data
     */

    fun getTilesData(month: String) = viewModelScope.launch { safeGetTilesDataCall(month) }

    private suspend fun safeGetTilesDataCall(month: String) {
        tilesData.postValue(Resource.Loading())
        try {
            val response = repository.getTilesData(
                session.organisationId.toString(),
                session.employeeId.toString(),
                month
            )
            if (response.isSuccessful)
                tilesData.postValue(Resource.Success(checkResponseBody(response.body()) as TileDataModel))
            else
                tilesData.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            tilesData.postValue(Resource.Error(checkThrowable(t), null))
        }
    }

    /**
    Update Customer
     */

    fun updateCustomerDetails(jsonObject: JsonObject) =
        viewModelScope.launch { safeUpdateCustomerDetailsCall(jsonObject) }

    private suspend fun safeUpdateCustomerDetailsCall(jsonObject: JsonObject) {
        updateCustomer.postValue(Resource.Loading())
        try {
            val response = repository.saveCustomerDetails(jsonObject)
            if (response.isSuccessful)
                updateCustomer.postValue(Resource.Success(checkResponseBody(response.body()) as SaveCustomerBasicsModel))
            else
                updateCustomer.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            updateCustomer.postValue(Resource.Error(checkThrowable(t), null))
        }
    }


    /**
    Update Enquiry Data
     */

    fun updateEnquiryDetails(jsonObject: JsonObject) =
        viewModelScope.launch { safeUpdateEnquiryDetailsCall(jsonObject) }

    private suspend fun safeUpdateEnquiryDetailsCall(jsonObject: JsonObject) {
        updateEnquiry.postValue(Resource.Loading())
        try {
            val response = repository.updateEnquiryDetails(jsonObject)
            if (response.isSuccessful)
                updateEnquiry.postValue(Resource.Success(checkResponseBody(response.body()) as CommonModel))
            else
                updateEnquiry.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            updateEnquiry.postValue(Resource.Error(checkThrowable(t), null))
        }
    }

    /**
    Get Notifications
     */

    fun notifications() = viewModelScope.launch { safeNotificationsCall() }

    private suspend fun safeNotificationsCall() {
        notifications.postValue(Resource.Loading())
        try {
            val response = repository.notificationList(
                divisionID = session.divisionId.toString(),
                branchID = session.branchId.toString(),
                userID = session.userId.toString(),
                organisationId = session.organisationId.toString()
            )
            if (response.isSuccessful)
                notifications.postValue(Resource.Success(checkResponseBody(response.body()) as NotificationModel))
            else
                notifications.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            notifications.postValue(Resource.Error(checkThrowable(t), null))
        }
    }


    fun productList(pageNo: String, searchKey: String) =
        viewModelScope.launch { safeProductListCall(pageNo, searchKey) }

    private suspend fun safeProductListCall(pageNo: String, searchKey: String) {
        productList.postValue(Resource.Loading())
        try {
            val response = repository.productList(pageNo, searchKey)
            if (response.isSuccessful)
                productList.postValue(Resource.Success(checkResponseBody(response.body()) as ProductListModel))
            else
                productList.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            productList.postValue(Resource.Error(checkThrowable(t), null))
        }
    }

    fun offerList(searchKey: String) = viewModelScope.launch { safeOfferListCall(searchKey) }

    private suspend fun safeOfferListCall(searchKey: String) {
        offerList.postValue(Resource.Loading())
        try {
            val response = repository.offerList(searchKey)
            if (response.isSuccessful)
                offerList.postValue(Resource.Success(checkResponseBody(response.body()) as OfferModel))
            else
                offerList.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            offerList.postValue(Resource.Error(checkThrowable(t), null))
        }
    }


    fun followUpList(organisationID: String, enquiryId: String) =
        viewModelScope.launch { safeFollowUpListCall(organisationID, enquiryId) }

    private suspend fun safeFollowUpListCall(organisationID: String, enquiryId: String) {
        followUpList.postValue(Resource.Loading())
        try {
            val response = repository.followUpList(organisationID, enquiryId)
            if (response.isSuccessful)
                followUpList.postValue(Resource.Success(checkResponseBody(response.body()) as FollowUpModel))
            else
                followUpList.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            followUpList.postValue(Resource.Error(checkThrowable(t), null))
        }
    }


    fun addFollowUp(jsonObject: JsonObject) =
        viewModelScope.launch { safeAddFollowUpsCall(jsonObject) }

    private suspend fun safeAddFollowUpsCall(jsonObject: JsonObject) {
        addFollowUps.postValue(Resource.Loading())
        try {
            val response = repository.addFollowUp(jsonObject = jsonObject)
            if (response.isSuccessful)
                addFollowUps.postValue(Resource.Success(checkResponseBody(response.body()) as CommonModel))
            else
                addFollowUps.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            addFollowUps.postValue(Resource.Error(checkThrowable(t), null))
        }
    }

    fun followUpDropDown(organisationID: String) =
        viewModelScope.launch { safeFollowUpDropDownCall(organisationID) }

    private suspend fun safeFollowUpDropDownCall(organisationID: String) {
        followUpDropDown.postValue(Resource.Loading())
        try {
            val response = repository.followUpDropDown(organisationID)
            if (response.isSuccessful)
                followUpDropDown.postValue(Resource.Success(checkResponseBody(response.body()) as FollowUpsDropdownModel))
            else
                followUpDropDown.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            followUpDropDown.postValue(Resource.Error(checkThrowable(t), null))
        }
    }

    /**
     * forgot Password
     */

    fun forgotPassword(phoneEmail: String, from: String) =
        viewModelScope.launch { safeForgotPasswordCall(phoneEmail, from) }

    private suspend fun safeForgotPasswordCall(phoneEmail: String, from: String) {
        forgotPassword.postValue(Resource.Loading())
        try {
            val response = repository.forgotPassword(phoneEmail, from)
            if (response.isSuccessful)
                forgotPassword.postValue(Resource.Success(checkResponseBody(response.body()) as ForgotPasswordModel))
            else
                forgotPassword.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            forgotPassword.postValue(Resource.Error(checkThrowable(t), null))
        }
    }

    /**
     * forgot Password
     */

    fun revenueList(params: MutableMap<String, String>) =
        viewModelScope.launch { safeRevenueListCall(params) }

    private suspend fun safeRevenueListCall(params: Map<String, String>) {
        revenueList.postValue(Resource.Loading())
        try {
            val response = repository.revenueList(params)
            if (response.isSuccessful)
                revenueList.postValue(Resource.Success(checkResponseBody(response.body()) as RevenueModel))
            else
                revenueList.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            revenueList.postValue(Resource.Error(checkThrowable(t), null))
        }
    }

    /**
     *  updateLocation
     */

    fun updateLocation(jsonObject: JsonObject) =
        viewModelScope.launch { safeUpdateLocationCall(jsonObject) }

    private suspend fun safeUpdateLocationCall(json: JsonObject) {
        updateLocation.postValue(Resource.Loading())
        try {
            val response = repository.updateLocation(json)
            if (response.isSuccessful)
                updateLocation.postValue(Resource.Success(checkResponseBody(response.body()) as LocationUpdateModel))
            else
                updateLocation.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            updateLocation.postValue(Resource.Error(checkThrowable(t), null))
        }
    }

    /**
     *  logOut
     */
    fun logOut(params: Map<String, String>) =
        viewModelScope.launch { safeLogOutCall(params) }

    private suspend fun safeLogOutCall(params: Map<String, String>) {
        logOut.postValue(Resource.Loading())
        try {
            val response = repository.logOut(params)
            if (response.isSuccessful)
                logOut.postValue(Resource.Success(checkResponseBody(response.body()) as CommonModel))
            else
                logOut.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            logOut.postValue(Resource.Error(checkThrowable(t), null))
        }
    }


    /**
     *  Get Notification and Message Count
     */
    fun getNotificationMessageCount() =
        viewModelScope.launch {
            params["UserID"] = session.userId.toString()
            params["OrganisationId"] = session.organisationId.toString()
            safeGetNotificationMessageCall(params)

        }

    private suspend fun safeGetNotificationMessageCall(params: Map<String, String>) {
        getNotificationMessageCount.postValue(Resource.Loading())
        try {
            val response = repository.getNotificationMessageCount(params)
            if (response.isSuccessful)
                getNotificationMessageCount.postValue(Resource.Success(checkResponseBody(response.body()) as NotificationAnMessageCount))
            else
                getNotificationMessageCount.postValue(Resource.Error(response.message(), null))
        } catch (t: Throwable) {
            getNotificationMessageCount.postValue(Resource.Error(checkThrowable(t), null))
        }
    }

    fun downloadLang() {
        viewModelScope.launch { safeDownloadLang() }
    }

    private fun safeDownloadLang() {
        downloadLanguage.postValue(Resource.Loading())
        val options = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.ARABIC)
            .setTargetLanguage(TranslateLanguage.ENGLISH)
            .build()

        val englishGermanTranslator = Translation.getClient(options)
        val conditions = DownloadConditions.Builder().build()

        englishGermanTranslator.downloadModelIfNeeded(conditions)
            .addOnSuccessListener {
                downloadLanguage.postValue(Resource.Success(true))
            }.addOnFailureListener {
                downloadLanguage.postValue(Resource.Error(it.message))
                val modelManager = RemoteModelManager.getInstance()
                val germanModel = TranslateRemoteModel.Builder(TranslateLanguage.GERMAN).build()

                modelManager.deleteDownloadedModel(germanModel)
                    .addOnSuccessListener {}
                    .addOnFailureListener {}
            }

    }

    fun getLang(date: String) {
        viewModelScope.launch { safeGetLanguage(date) }
    }

    private fun safeGetLanguage(date: String) {
        translatedString.postValue(Resource.Loading())
        val options = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.ARABIC)
            .setTargetLanguage(TranslateLanguage.ENGLISH)
            .build()

        val englishGermanTranslator = Translation.getClient(options)

        englishGermanTranslator.translate(date)
            .addOnSuccessListener {
                translatedString.postValue(Resource.Success(it))

            }
            .addOnFailureListener {
                translatedString.postValue(Resource.Error(it.message))

            }

    }

    private fun checkResponseBody(body: Any?): Any? = body?.let { it }

    private fun checkThrowable(t: Throwable): String {
        return when (t) {
            is IOException ->
                "Network Failure"
            else -> "Conversion Error ${t.message}"

        }
    }
}