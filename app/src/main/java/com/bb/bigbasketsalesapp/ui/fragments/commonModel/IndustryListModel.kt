package com.bb.bigbasketsalesapp.ui.fragments.commonModel

data class IndustryListModel(
    val CreatedDate: String,
    val IndustryID: Int,
    val IndustryName: Any,
    val IndustryViewModel: List<IndustryViewData>,
    val OrganisationID: Int
)

data class IndustryViewData(
    val IndustryID: Int,
    val IndustryName: String
){
    override fun toString(): String {
        return IndustryName
    }
}