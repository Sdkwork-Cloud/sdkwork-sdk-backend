package com.sdkwork.backend

data class EmailVerificationForm(
    val email: String? = null,
    val code: String? = null,
    val type: String? = null
)
