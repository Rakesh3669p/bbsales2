package com.bb.bigbasketsalesapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b+\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00198F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR$\u0010#\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010\n\"\u0004\b%\u0010\fR$\u0010&\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\'\u0010\n\"\u0004\b(\u0010\fR\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00105\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR$\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u00198F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u0010\u001eR$\u0010;\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b<\u0010\u0011\"\u0004\b=\u0010\u0013R$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b>\u0010\u0011\"\u0004\b?\u0010\u0013R$\u0010A\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u00198F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bB\u0010\u001c\"\u0004\bC\u0010\u001eR$\u0010D\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bE\u0010\u0011\"\u0004\bF\u0010\u0013R$\u0010G\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bH\u0010\n\"\u0004\bI\u0010\fR$\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u0010\n\"\u0004\bM\u0010\fR$\u0010N\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bO\u0010\n\"\u0004\bP\u0010\fR$\u0010Q\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bR\u0010\n\"\u0004\bS\u0010\fR$\u0010T\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bU\u0010\n\"\u0004\bV\u0010\fR$\u0010W\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bX\u0010\n\"\u0004\bY\u0010\f\u00a8\u0006["}, d2 = {"Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "", "mCxt", "Landroid/content/Context;", "(Landroid/content/Context;)V", "PRIVATE_MODE", "", "loginId", "branchId", "getBranchId", "()I", "setBranchId", "(I)V", "businessForm", "", "businessFormData", "getBusinessFormData", "()Ljava/lang/String;", "setBusinessFormData", "(Ljava/lang/String;)V", "latitude", "currentLanguageCode", "getCurrentLanguageCode", "setCurrentLanguageCode", "locationEnabled", "", "customerAdded", "getCustomerAdded", "()Z", "setCustomerAdded", "(Z)V", "removed", "customerRemoved", "getCustomerRemoved", "setCustomerRemoved", "divisionId", "getDivisionId", "setDivisionId", "employeeId", "getEmployeeId", "setEmployeeId", "generalEditor", "Landroid/content/SharedPreferences$Editor;", "getGeneralEditor", "()Landroid/content/SharedPreferences$Editor;", "setGeneralEditor", "(Landroid/content/SharedPreferences$Editor;)V", "generalPref", "Landroid/content/SharedPreferences;", "getGeneralPref", "()Landroid/content/SharedPreferences;", "setGeneralPref", "(Landroid/content/SharedPreferences;)V", "isLocationEnabled", "setLocationEnabled", "status", "isLogin", "setLogin", "locationTime", "lastLocationUpdated", "getLastLocationUpdated", "setLastLocationUpdated", "getLatitude", "setLatitude", "dialogSeen", "locationDialogSeen", "getLocationDialogSeen", "setLocationDialogSeen", "longitude", "getLongitude", "setLongitude", "messageCount", "getMessageCount", "setMessageCount", "notiCount", "notificationCount", "getNotificationCount", "setNotificationCount", "organisationId", "getOrganisationId", "setOrganisationId", "roleId", "getRoleId", "setRoleId", "userId", "getUserId", "setUserId", "userLogId", "getUserLogId", "setUserLogId", "Companion", "BBSales_debug"})
public final class SessionManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.bb.bigbasketsalesapp.utils.SessionManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PREF_NAME = " BB_Sales";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_GENERAL = "PREF_GENERAL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ISLOGIN = "isloggedin";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_USER_LOGIN_ID = "user_login_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_USER_LOG_ID = "UserLogId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_EMPLOYEE_ID = "employee_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ROLE_ID = "role_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_BRANCH_ID = "Branch_Id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_BRANCH = "Branch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DIVISION_ID = "Division_Id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_BRANCH_IDS = "BranchIds";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ACTIVE_FLAG = "ActiveFlag";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DEFAULT_USER = "DefaultUser";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ORGANISATION_ID = "Organization_Id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_LATITUDE = "latitude";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_LANG_CODE = "langCode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_LONGITUDE = "longitude";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_STATE_NAME = "StateName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_LOCATION_ENABLED = "isLocationEnabled";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_CUSTOMER_ADDED = "customerAdded";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_CUSTOMER_REMOVED = "customerRemoved";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_BUSINESS_FORM = "businessform";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_LAST_LOCATION_UPDATED = "lastLocationUpdated";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_MESSAGE_COUNT = "messageCount";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_NOTIFICATION_COUNT = "notificationCount";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DIALOG_SEEN = "dialogSeen";
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences.Editor generalEditor;
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences generalPref;
    private int PRIVATE_MODE = 0;
    
    @javax.inject.Inject()
    public SessionManager(@org.jetbrains.annotations.NotNull()
    android.content.Context mCxt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor getGeneralEditor() {
        return null;
    }
    
    public final void setGeneralEditor(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getGeneralPref() {
        return null;
    }
    
    public final void setGeneralPref(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    public final boolean isLogin() {
        return false;
    }
    
    public final void setLogin(boolean status) {
    }
    
    public final int getUserId() {
        return 0;
    }
    
    public final void setUserId(int loginId) {
    }
    
    public final int getMessageCount() {
        return 0;
    }
    
    public final void setMessageCount(int messageCount) {
    }
    
    public final int getNotificationCount() {
        return 0;
    }
    
    public final void setNotificationCount(int notiCount) {
    }
    
    public final int getEmployeeId() {
        return 0;
    }
    
    public final void setEmployeeId(int employeeId) {
    }
    
    public final int getRoleId() {
        return 0;
    }
    
    public final void setRoleId(int employeeId) {
    }
    
    public final int getBranchId() {
        return 0;
    }
    
    public final void setBranchId(int loginId) {
    }
    
    public final int getOrganisationId() {
        return 0;
    }
    
    public final void setOrganisationId(int loginId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLatitude() {
        return null;
    }
    
    public final void setLatitude(@org.jetbrains.annotations.NotNull()
    java.lang.String latitude) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentLanguageCode() {
        return null;
    }
    
    public final void setCurrentLanguageCode(@org.jetbrains.annotations.NotNull()
    java.lang.String latitude) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLongitude() {
        return null;
    }
    
    public final void setLongitude(@org.jetbrains.annotations.NotNull()
    java.lang.String longitude) {
    }
    
    public final int getDivisionId() {
        return 0;
    }
    
    public final void setDivisionId(int loginId) {
    }
    
    public final int getUserLogId() {
        return 0;
    }
    
    public final void setUserLogId(int loginId) {
    }
    
    public final boolean isLocationEnabled() {
        return false;
    }
    
    public final void setLocationEnabled(boolean locationEnabled) {
    }
    
    public final boolean getCustomerAdded() {
        return false;
    }
    
    public final void setCustomerAdded(boolean locationEnabled) {
    }
    
    public final boolean getCustomerRemoved() {
        return false;
    }
    
    public final void setCustomerRemoved(boolean removed) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBusinessFormData() {
        return null;
    }
    
    public final void setBusinessFormData(@org.jetbrains.annotations.NotNull()
    java.lang.String businessForm) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastLocationUpdated() {
        return null;
    }
    
    public final void setLastLocationUpdated(@org.jetbrains.annotations.NotNull()
    java.lang.String locationTime) {
    }
    
    public final boolean getLocationDialogSeen() {
        return false;
    }
    
    public final void setLocationDialogSeen(boolean dialogSeen) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006 "}, d2 = {"Lcom/bb/bigbasketsalesapp/utils/SessionManager$Companion;", "", "()V", "KEY_ACTIVE_FLAG", "", "KEY_BRANCH", "KEY_BRANCH_ID", "KEY_BRANCH_IDS", "KEY_BUSINESS_FORM", "KEY_CUSTOMER_ADDED", "KEY_CUSTOMER_REMOVED", "KEY_DEFAULT_USER", "KEY_DIALOG_SEEN", "KEY_DIVISION_ID", "KEY_EMPLOYEE_ID", "KEY_ISLOGIN", "KEY_LANG_CODE", "KEY_LAST_LOCATION_UPDATED", "KEY_LATITUDE", "KEY_LOCATION_ENABLED", "KEY_LONGITUDE", "KEY_MESSAGE_COUNT", "KEY_NOTIFICATION_COUNT", "KEY_ORGANISATION_ID", "KEY_ROLE_ID", "KEY_STATE_NAME", "KEY_USER_LOGIN_ID", "KEY_USER_LOG_ID", "PREF_GENERAL", "PREF_NAME", "getPREF_NAME", "()Ljava/lang/String;", "BBSales_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPREF_NAME() {
            return null;
        }
    }
}