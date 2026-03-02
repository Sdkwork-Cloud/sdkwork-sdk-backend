package com.sdkwork.backend

data class PlusImageForm(
    val title: String? = null,
    val description: String? = null,
    val url: String? = null,
    val aspectRatio: String? = null,
    val width: Int? = null,
    val height: Int? = null,
    val fileSize: Int? = null,
    val format: String? = null,
    val status: String? = null
)
