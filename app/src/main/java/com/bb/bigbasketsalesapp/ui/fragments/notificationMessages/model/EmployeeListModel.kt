package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model

data class EmployeeListModel(
    val ExportList: List<Export>,
    val List: List<EmployeeData>,
    val Output: String,
    val TotalCount: Int
)

data class EmployeeData(
    val ActionStatus: Any,
    val ActiveFlag: Boolean,
    val BloodGroup: String,
    val Br_Id: Any,
    val BranchAddress: Any,
    val BranchCode: Any,
    val BranchId: Int,
    val BranchList: Any,
    val BranchListPOP: Any,
    val Branch_Id: Int,
    val Branch_Name: Any,
    val ChatDetails: ChatDetails?,
    val Count: Int,
    val CurrentPage: Int,
    val DOB: String,
    val DOJ: String,
    val DepartmentId: Int,
    val DepartmentList: Any,
    val DesignationName: Any,
    val Designation_Id: Int,
    val DistrictList: Any,
    val DivisionDescription: Any,
    val DivisionList: Any,
    val Division_Id: Int,
    val Division_Name: Any,
    val EmailId: String,
    val EmpData: Any,
    val Emp_Dob: String,
    val Emp_Doj: String,
    val EmployeeName: String,
    val EmployeePhoto: String,
    val Employee_Id: Int,
    val Employeecode: String,
    val ExportList: Any,
    val FileName: Any,
    val Flag: Any,
    val GSTIN: Any,
    val Gender: String,
    val MobileNo: Long,
    val ModelPrevilege: Any,
    val OrganisationId: Int,
    val OrganisationName: Any,
    val PageSize: Int,
    val RoleId: Int,
    val RoleLists: Any,
    val RoleName: Any,
    val SearchKeyWord: Any,
    val Session_Flag: Any,
    val StateId: Int,
    val StateList: Any,
    val UserId: Int,
    val User_Id: Int,
    val active_status: Any,
    val dateofbrth: String,
    val dateofjoin: String,
    val genderList: Any,
    val statusvalue: String
)

data class Export(
    val ActionStatus: Any,
    val ActiveFlag: Boolean,
    val BloodGroup: String,
    val Br_Id: Any,
    val BranchAddress: Any,
    val BranchCode: Any,
    val BranchId: Int,
    val BranchList: Any,
    val BranchListPOP: Any,
    val Branch_Id: Int,
    val Branch_Name: Any,
    val Count: Int,
    val CurrentPage: Int,
    val DOB: String,
    val DOJ: String,
    val DepartmentId: Int,
    val DepartmentList: Any,
    val DesignationName: Any,
    val Designation_Id: Int,
    val DistrictList: Any,
    val DivisionDescription: Any,
    val DivisionList: Any,
    val Division_Id: Int,
    val Division_Name: Any,
    val EmailId: String,
    val EmpData: Any,
    val Emp_Dob: String,
    val Emp_Doj: String,
    val EmployeeName: String,
    val EmployeePhoto: String,
    val Employee_Id: Int,
    val Employeecode: String,
    val ExportList: Any,
    val FileName: Any,
    val Flag: Any,
    val GSTIN: Any,
    val Gender: String,
    val MobileNo: Long,
    val ModelPrevilege: Any,
    val OrganisationId: Int,
    val OrganisationName: Any,
    val PageSize: Int,
    val RoleId: Int,
    val RoleLists: Any,
    val RoleName: Any,
    val SearchKeyWord: Any,
    val Session_Flag: Any,
    val StateId: Int,
    val StateList: Any,
    val UserId: Int,
    val User_Id: Int,
    val active_status: Any,
    val dateofbrth: String,
    val dateofjoin: String,
    val genderList: Any,
    val statusvalue: String
)