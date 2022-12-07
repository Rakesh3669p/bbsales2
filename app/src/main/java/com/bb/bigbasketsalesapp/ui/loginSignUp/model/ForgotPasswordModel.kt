package com.bb.bigbasketsalesapp.ui.loginSignUp.model

data class ForgotPasswordModel(
    val Data: ForgotPasswordData,
    val Output: String
)

data class ForgotPasswordData(
    val BloodGroup: String,
    val DOB: String,
    val DOJ: String,
    val EmailId: String,
    val EmployeeCode: String,
    val EmployeeName: String,
    val Employee_Id: Int,
    val Gender: String,
    val MobileNo: String,
    val OTP: Int,
    val OrganisationId: Int,
    val UserId:Int,
    val RoleId:Int
)