package com.bb.bigbasketsalesapp.ui.fragments.commonModel

data class SourceListModel(
    val CreatedDate: String,
    val OrganisationID: Int,
    val SourceID: Int,
    val SourceName: Any,
    val SourceViewModel: List<SourceViewData>
)

data class SourceViewData(
    val SourceID: Int,
    val SourceName: String
)