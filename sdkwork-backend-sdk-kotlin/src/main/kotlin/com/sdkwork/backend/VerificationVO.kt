package com.sdkwork.backend

data class VerificationVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val success: Boolean? = null,
    val message: String? = null,
    val token: String? = null
)
