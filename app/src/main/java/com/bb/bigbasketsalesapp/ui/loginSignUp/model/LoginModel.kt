package com.bb.bigbasketsalesapp.ui.loginSignUp.model

data class LoginModel(
    val Data: LoginData,
    val Output: String,
    val Message: String,

    )
data class LoginData(
    val ActiveFlag: String,
    val Branch: List<Int>,
    val BranchIds: String,
    val BranchList: List<Branch>,
    val Branch_Id: Int,
    val CreatedDate: String,
    val DefaultUser: Boolean,
    val Delstatus: Boolean,
    val Division_Id: Int,
    val EmployeeID: Int,
    val Organization_Id: Int,
    val Password: Any,
    val RoleID: Int,
    val StateName: String,
    val UpdatedDate: String,
    val UserLogId: Int,
    val UserName: String,
    val User_Id: Int
)

data class Branch(
    val AccountNo: String,
    val BankName: String,
    val Bank_Branch: String,
    val BranchCode: String,
    val BranchFlag: Any,
    val BranchId: Int,
    val BranchName: String,
    val City: String,
    val Count: Int,
    val Country: String,
    val CurrentPage: Int,
    val DelStatus: Boolean,
    val DistrictId: Int,
    val DistrictName: String,
    val DivisionBranchMappingId: Int,
    val DivisionId: Int,
    val DivisionName: Any,
    val DivisionNameList: String,
    val EmailId: String,
    val Flag: Any,
    val GSTIN: String,
    val IFSC_Code: String,
    val List: Any,
    val Organisation: Any,
    val OrganisationId: Int,
    val PINCode: String,
    val PageSize: Int,
    val PhoneNumber: String,
    val ReferenceId: Int,
    val SearchKey: Any,
    val StateId: Int,
    val StateName: String,
    val Street: String
)