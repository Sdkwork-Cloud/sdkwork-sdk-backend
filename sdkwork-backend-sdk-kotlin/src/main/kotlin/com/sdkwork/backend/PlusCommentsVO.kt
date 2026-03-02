package com.sdkwork.backend

data class PlusCommentsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val parentId: Int? = null,
    val parentUuid: String? = null,
    val userId: Int? = null,
    val content: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val status: String? = null,
    val likes: Int? = null,
    val replyCount: Int? = null,
    val isTop: Boolean? = null,
    val ipAddress: String? = null,
    val deviceInfo: String? = null,
    val author: AuthorInfo? = null
)
