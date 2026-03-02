package com.sdkwork.backend

data class PlusNewsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val userId: Int? = null,
    val title: String? = null,
    val url: String? = null,
    val source: String? = null,
    val summary: String? = null,
    val publishTime: String? = null,
    val tags: TagsContent? = null
)
