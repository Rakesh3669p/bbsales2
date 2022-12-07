package com.bb.bigbasketsalesapp.ui.fragments.changePasswordLogin.model

data class ChangePasswordLoginModel(
    val Data: ChangePasswordLoginData,
    val Output: String,
    val Message: String
)


data class ChangePasswordLoginData(
    val ActionStatus: Any,
    val ActiveFlag: Any,
    val Active_Status: Boolean,
    val BranchCode: Any,
    val Branch_Id: Int,
    val Branch_Name: Any,
    val CreatedDate: String,
    val CurrentPage: Int,
    val DelStatus: Boolean,
    val Division_Id: Int,
    val Division_Name: Any,
    val EmployeeCode: Any,
    val EmployeeId: Int,
    val EmployeeName: Any,
    val EmployeeRoleAssigned_Id: Int,
    val Employee_Id: Any,
    val Flag: String,
    val Head_Role_Id: Int,
    val List: Any,
    val MenuActions: Any,
    val OrganizationId: Int,
    val OrganizationName: Any,
    val PageSize: Int,
    val Password: String,
    val RoleForm: Any,
    val RoleHierarchy_Id: Int,
    val RoleId: Int,
    val RoleList: Any,
    val RoleName: Any,
    val SearchKeyWord: Any,
    val TopAuthority: Any,
    val TotalCount: Int,
    val UpdatedDate: String,
    val UserId: Int,
    val Username: Any
)