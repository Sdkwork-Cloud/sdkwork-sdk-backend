package com.sdkwork.backend

data class PlusMediaPublishItemResultDTO(
    val recordId: Int? = null,
    val noteId: Int? = null,
    val noteUuid: String? = null,
    val title: String? = null,
    val articleIndex: Int? = null,
    val success: Boolean? = null,
    val errcode: Int? = null,
    val errmsg: String? = null,
    val draftMediaId: String? = null,
    val publishId: String? = null,
    val articleId: String? = null
)
