package com.sdkwork.backend

data class PlusFavoriteVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val folderId: Int? = null,
    val remark: String? = null,
    val tags: String? = null,
    val sortWeight: Int? = null,
    val title: String? = null,
    val image: ImageMediaResource? = null,
    val isPrivate: Boolean? = null,
    val status: String? = null,
    val viewCount: Int? = null,
    val lastViewedAt: String? = null
)
