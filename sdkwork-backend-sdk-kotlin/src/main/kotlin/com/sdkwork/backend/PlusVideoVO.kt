package com.sdkwork.backend

data class PlusVideoVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val version: Int? = null,
    val title: String? = null,
    val description: String? = null,
    val resource: VideoMediaResource? = null,
    val author: AuthorInfo? = null,
    val contentUrl: String? = null,
    val aspectRatio: String? = null,
    val duration: Int? = null,
    val resolution: String? = null,
    val width: Int? = null,
    val height: Int? = null,
    val fileSize: Int? = null,
    val format: String? = null,
    val thumbnailUrl: String? = null,
    val status: String? = null
)
