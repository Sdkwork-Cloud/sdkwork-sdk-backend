package com.sdkwork.backend

data class OAuthCallbackForm(
    val provider: String? = null,
    val code: String? = null,
    val state: String? = null
)
