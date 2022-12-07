package com.bb.bigbasketsalesapp.ui.fragments.commonModel

data class SalesAchievementsAndTargetsModel(
    val List: List<SalesAchievementsAndTargetsData>,
    val Output: String,
    val TotalCount: Int
)

data class SalesAchievementsAndTargetsData(
    val CreatedBy: Int,
    val CreatedOn: String,
    val CustomerOnboardTarget: Int,
    val CustomersOnboarded: Int,
    val EmployeeID: Int,
    val EmployeeName: Any,
    val ModifiedBy: Any,
    val ModifiedOn: Any,
    val Month: String,
    val MonthCount: Int,
    val NoOfShopVisitDone: Int,
    val OrganisationID: Int,
    val RevenuePerCustomer: Double,
    val RevenuePerCustomerTarget: Double,
    val Role: Any,
    val ShopVisitTarget: Int,
    val TargetID: Int,
    val TotalRevenue: Double,
    val TotalRevenueTarget: Double
)