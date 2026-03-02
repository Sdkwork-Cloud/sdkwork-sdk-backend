package com.sdkwork.backend

data class TokenResult(
    val token: String? = null,
    val expiresInMs: String? = null,
    val createdAt: String? = null,
    val expired: Boolean? = null
)
