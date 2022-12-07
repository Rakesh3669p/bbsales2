package com.bb.bigbasketsalesapp.utils

import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject


class SessionManager @Inject constructor(mCxt: Context) {

    companion object {
        val PREF_NAME = " BB_Sales"
        const val PREF_GENERAL = "PREF_GENERAL"
        const val KEY_ISLOGIN = "isloggedin"

        const val KEY_USER_LOGIN_ID = "user_login_id"
        const val KEY_USER_LOG_ID = "UserLogId"
        const val KEY_EMPLOYEE_ID = "employee_id"
        const val KEY_ROLE_ID = "role_id"
        const val KEY_BRANCH_ID = "Branch_Id"
        const val KEY_BRANCH = "Branch"
        const val KEY_DIVISION_ID = "Division_Id"
        const val KEY_BRANCH_IDS = "BranchIds"
        const val KEY_ACTIVE_FLAG = "ActiveFlag"
        const val KEY_DEFAULT_USER = "DefaultUser"
        const val KEY_ORGANISATION_ID = "Organization_Id"
        const val KEY_LATITUDE = "latitude"
        const val KEY_LANG_CODE = "langCode"
        const val KEY_LONGITUDE = "longitude"
        const val KEY_STATE_NAME = "StateName"
        const val KEY_LOCATION_ENABLED = "isLocationEnabled"
        const val KEY_CUSTOMER_ADDED = "customerAdded"
        const val KEY_CUSTOMER_REMOVED = "customerRemoved"
        const val KEY_BUSINESS_FORM = "businessform"
        const val KEY_LAST_LOCATION_UPDATED = "lastLocationUpdated"

        const val KEY_MESSAGE_COUNT = "messageCount"
        const val KEY_NOTIFICATION_COUNT = "notificationCount"
        const val KEY_DIALOG_SEEN = "dialogSeen"
    }


    var generalEditor: SharedPreferences.Editor
    var generalPref: SharedPreferences

    private var PRIVATE_MODE = 0

    init {
        generalPref = mCxt.getSharedPreferences(PREF_GENERAL, PRIVATE_MODE)
        generalEditor = generalPref.edit()

    }

    var isLogin: Boolean
        get() = generalPref.getBoolean(KEY_ISLOGIN, false)
        set(status) {
            generalEditor.putBoolean(KEY_ISLOGIN, status)
            generalEditor.commit()
        }


    var userId: Int
        get() = generalPref.getInt(KEY_USER_LOGIN_ID, 0)
        set(loginId) {
            generalEditor.putInt(KEY_USER_LOGIN_ID, loginId)
            generalEditor.commit()
        }

    var messageCount: Int
        get() = generalPref.getInt(KEY_MESSAGE_COUNT, 0)
        set(messageCount) {
            generalEditor.putInt(KEY_MESSAGE_COUNT, messageCount)
            generalEditor.commit()
        }

    var notificationCount: Int
        get() = generalPref.getInt(KEY_NOTIFICATION_COUNT, 0)
        set(notiCount) {
            generalEditor.putInt(KEY_NOTIFICATION_COUNT, notiCount)
            generalEditor.commit()
        }

    var employeeId: Int
        get() = generalPref.getInt(KEY_EMPLOYEE_ID, 0)
        set(employeeId) {
            generalEditor.putInt(KEY_EMPLOYEE_ID, employeeId)
            generalEditor.commit()
        }

    var roleId: Int
        get() = generalPref.getInt(KEY_ROLE_ID, 0)
        set(employeeId) {
            generalEditor.putInt(KEY_ROLE_ID, employeeId)
            generalEditor.commit()
        }


    var branchId: Int
        get() = generalPref.getInt(KEY_BRANCH_ID, 0)
        set(loginId) {
            generalEditor.putInt(KEY_BRANCH_ID, loginId)
            generalEditor.commit()
        }

    var organisationId: Int
        get() = generalPref.getInt(KEY_ORGANISATION_ID, 0)
        set(loginId) {
            generalEditor.putInt(KEY_ORGANISATION_ID, loginId)
            generalEditor.commit()
        }

    var latitude: String
        get() = generalPref.getString(KEY_LATITUDE, "").toString()
        set(latitude) {
            generalEditor.putString(KEY_LATITUDE, latitude)
            generalEditor.commit()
        }

    var currentLanguageCode: String
        get() = generalPref.getString(KEY_LANG_CODE, "").toString()
        set(latitude) {
            generalEditor.putString(KEY_LANG_CODE, latitude)
            generalEditor.commit()
        }

    var longitude: String
        get() = generalPref.getString(KEY_LONGITUDE, "").toString()
        set(longitude) {
            generalEditor.putString(KEY_LONGITUDE, longitude)
            generalEditor.commit()
        }

    var divisionId: Int
        get() = generalPref.getInt(KEY_DIVISION_ID, 0)
        set(loginId) {
            generalEditor.putInt(KEY_DIVISION_ID, loginId)
            generalEditor.commit()
        }

    var userLogId: Int
        get() = generalPref.getInt(KEY_USER_LOG_ID, 0)
        set(loginId) {
            generalEditor.putInt(KEY_USER_LOG_ID, loginId)
            generalEditor.commit()
        }

    var isLocationEnabled: Boolean
        get() = generalPref.getBoolean(KEY_LOCATION_ENABLED, false)
        set(locationEnabled) {
            generalEditor.putBoolean(KEY_LOCATION_ENABLED, locationEnabled)
            generalEditor.commit()
        }

    var customerAdded: Boolean
        get() = generalPref.getBoolean(KEY_CUSTOMER_ADDED, false)
        set(locationEnabled) {
            generalEditor.putBoolean(KEY_CUSTOMER_ADDED, locationEnabled)
            generalEditor.commit()
        }

    var customerRemoved: Boolean
        get() = generalPref.getBoolean(KEY_CUSTOMER_REMOVED, false)
        set(removed) {
            generalEditor.putBoolean(KEY_CUSTOMER_REMOVED, removed)
            generalEditor.commit()
        }


    var businessFormData: String
        get() = generalPref.getString(KEY_BUSINESS_FORM, "").toString()
        set(businessForm) {
            generalEditor.putString(KEY_BUSINESS_FORM, businessForm)
            generalEditor.commit()
        }

    var lastLocationUpdated: String
        get() = generalPref.getString(KEY_LAST_LOCATION_UPDATED, "").toString()
        set(locationTime) {
            generalEditor.putString(KEY_LAST_LOCATION_UPDATED, locationTime)
            generalEditor.commit()
        }


    var locationDialogSeen: Boolean
        get() = generalPref.getBoolean(KEY_DIALOG_SEEN, false)
        set(dialogSeen) {
            generalEditor.putBoolean(KEY_DIALOG_SEEN, dialogSeen)
            generalEditor.commit()
        }
}