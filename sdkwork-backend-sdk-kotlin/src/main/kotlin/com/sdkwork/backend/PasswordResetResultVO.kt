package com.sdkwork.backend

data class PasswordResetResultVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val success: Boolean? = null,
    val message: String? = null,
    val expiresIn: Int? = null,
    val token: String? = null
)
