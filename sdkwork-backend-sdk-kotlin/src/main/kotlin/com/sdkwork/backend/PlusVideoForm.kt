package com.sdkwork.backend

data class PlusVideoForm(
    val title: String? = null,
    val description: String? = null,
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
