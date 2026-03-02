package com.sdkwork.backend

data class ContentVoteVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val v: Int? = null,
    val userId: Int? = null,
    val contentType: String? = null,
    val rating: String? = null,
    val contentId: Int? = null,
    val metadata: ContentVoteMetadata? = null
)
