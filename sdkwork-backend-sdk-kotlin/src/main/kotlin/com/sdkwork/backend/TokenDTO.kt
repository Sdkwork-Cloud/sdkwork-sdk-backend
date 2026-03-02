package com.sdkwork.backend

data class TokenDTO(
    val token: String? = null,
    val refreshToken: String? = null,
    val expiresIn: Int? = null,
    val refreshExpiresIn: Int? = null,
    val userId: Int? = null,
    val im: Map<String, Any>? = null
)
