package com.sdkwork.backend

data class PlusMediaPublishResultDTO(
    val batchId: String? = null,
    val platform: String? = null,
    val action: String? = null,
    val success: Boolean? = null,
    val errcode: Int? = null,
    val errmsg: String? = null,
    val draftMediaId: String? = null,
    val publishId: String? = null,
    val articleId: String? = null,
    val previewData: Any? = null,
    val items: List<PlusMediaPublishItemResultDTO>? = null
)
