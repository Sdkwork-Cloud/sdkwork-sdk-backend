package com.sdkwork.backend

data class PlusImageVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val title: String? = null,
    val description: String? = null,
    val resource: ImageMediaResource? = null,
    val author: AuthorInfo? = null,
    val url: String? = null,
    val aspectRatio: String? = null,
    val width: Int? = null,
    val height: Int? = null,
    val fileSize: Int? = null,
    val format: String? = null,
    val status: String? = null
)
