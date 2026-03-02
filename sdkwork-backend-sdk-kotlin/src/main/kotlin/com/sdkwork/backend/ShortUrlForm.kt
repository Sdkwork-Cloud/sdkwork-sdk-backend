package com.sdkwork.backend

data class ShortUrlForm(
    val originalUrl: String? = null,
    val shortCode: String? = null,
    val expiresAt: String? = null,
    val status: String? = null,
    val createdBy: Int? = null,
    val description: String? = null
)
