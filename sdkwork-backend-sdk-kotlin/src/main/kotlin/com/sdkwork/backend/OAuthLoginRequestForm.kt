package com.sdkwork.backend

data class OAuthLoginRequestForm(
    val provider: String? = null,
    val redirectUri: String? = null,
    val scope: String? = null,
    val state: String? = null
)
