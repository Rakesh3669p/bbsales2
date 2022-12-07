package com.bb.bigbasketsalesapp.ui.fragments.commonModel

data class EnquiryStatusListModel(
    val CreatedDate: String,
    val EnquiryStatusID: Int,
    val EnquiryStatusName: Any,
    val EnquiryStatusViewModel: List<EnquiryStatusViewData>,
    val OrganisationID: Int
)

data class EnquiryStatusViewData(
    val EnquiryStatusID: Int,
    val EnquiryStatusName: String
) {
    override fun toString(): String {
        return EnquiryStatusName
    }
}