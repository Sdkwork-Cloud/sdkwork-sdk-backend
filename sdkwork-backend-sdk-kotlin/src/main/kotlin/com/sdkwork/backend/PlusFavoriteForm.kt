package com.sdkwork.backend

data class PlusFavoriteForm(
    val contentType: String? = null,
    val contentId: Int? = null,
    val folderName: String? = null,
    val remark: String? = null,
    val sortWeight: Int? = null,
    val title: String? = null,
    val image: ImageMediaResource? = null,
    val isPrivate: Boolean? = null,
    val status: String? = null
)
