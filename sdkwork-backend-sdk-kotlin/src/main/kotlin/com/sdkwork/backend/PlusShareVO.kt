package com.sdkwork.backend

data class PlusShareVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val title: String? = null,
    val description: String? = null,
    val type: String? = null,
    val contents: ShareContents? = null,
    val contentType: String? = null,
    val status: String? = null,
    val shareUrl: String? = null,
    val contentIds: List<String>? = null,
    val password: String? = null,
    val expireAt: String? = null,
    val clickCount: Int? = null,
    val tags: TagsContent? = null,
    val shareCode: String? = null
)
