package com.sdkwork.backend

data class OAuthLoginResponse(
    val provider: String? = null,
    val authUrl: String? = null,
    val state: String? = null,
    val expiresIn: Int? = null
)
