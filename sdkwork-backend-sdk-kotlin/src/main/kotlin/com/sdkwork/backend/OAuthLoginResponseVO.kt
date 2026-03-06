package com.sdkwork.backend

data class OAuthLoginResponseVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val provider: String? = null,
    val authUrl: String? = null,
    val qrCodeUrl: String? = null,
    val qrCodeContent: String? = null,
    val expiresIn: Int? = null
)
