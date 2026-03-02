package com.sdkwork.backend

data class ShortUrlVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val originalUrl: String? = null,
    val shortCode: String? = null,
    val expiresAt: String? = null,
    val clickCount: Int? = null,
    val status: String? = null,
    val createdBy: Int? = null,
    val description: String? = null
)
