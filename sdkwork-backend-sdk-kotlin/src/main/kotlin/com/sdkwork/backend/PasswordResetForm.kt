package com.sdkwork.backend

data class PasswordResetForm(
    val token: String? = null,
    val newPassword: String? = null
)
