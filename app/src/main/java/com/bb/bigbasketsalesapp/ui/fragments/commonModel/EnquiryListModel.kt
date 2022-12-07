package com.bb.bigbasketsalesapp.ui.fragments.commonModel

data class EnquiryListModel(
    val CreatedDate: String,
    val EnquiryTypeID: Int,
    val EnquiryTypeName: Any,
    val EnquiryTypeViewModel: List<EnquiryTypeViewData>,
    val OrganisationID: Int
)

data class EnquiryTypeViewData(
    val EnquiryTypeID: Int,
    val EnquiryTypeName: String
){
    override fun toString(): String {
        return EnquiryTypeName
    }
}