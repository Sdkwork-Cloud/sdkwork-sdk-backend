package com.sdkwork.backend

data class PlusCommentsForm(
    val content: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val status: String? = null,
    val likes: Int? = null,
    val replyCount: Int? = null,
    val isTop: Boolean? = null,
    val ipAddress: String? = null,
    val deviceInfo: String? = null,
    val parentId: Int? = null,
    val parentUuid: String? = null,
    val userId: Int? = null,
    val parentMetadata: PlusTreeParentMetadata? = null
)
