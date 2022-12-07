package com.bb.bigbasketsalesapp.ui.fragments.commonModel

data class TileDataModel(
    val Data: TileData,
    val Output: String
)

data class TileData(
    val CustomerOnboardTarget: Int,
    val CustomerOnboarded: Int,
    val Dashboard: Dashboard,
    val NoofShopvisitsdone: Int,
    val RevenuePerCustomer: Double,
    val RevenuePerCustomerTarget: Double,
    val ShopVisitTarget: Int,
    val TotalRevenue: Double,
    val TotalRevenueTarget: Double
)


data class Dashboard(
    val OrganisationId: Int,
    val PurchaseXaxisdata: Any,
    val PurchaseYaxisdata: Any,
    val SDate: String,
    val SalesXaxisdata: List<SalesXaxisdata>,
    val SalesYaxisdata: List<SalesYaxisdata>,
    val Status: Any,
    val StockXaxisdata: Any,
    val StockYaxisdata: Any,
    val TotalAmount: Double
)

data class SalesXaxisdata(
    val AmtPercentage: Double,
    val AmtPercentagePrev: Double,
    val XAmount: Double,
    val XAmountPrev: Double,
    val Xdata: String
)

data class SalesYaxisdata(
    val YAmount: Double
)