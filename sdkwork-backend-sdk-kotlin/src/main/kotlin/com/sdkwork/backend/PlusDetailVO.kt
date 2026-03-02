package com.sdkwork.backend

data class PlusDetailVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val content: DetailContent? = null,
    val productId: Int? = null,
    val skuId: Int? = null
)
