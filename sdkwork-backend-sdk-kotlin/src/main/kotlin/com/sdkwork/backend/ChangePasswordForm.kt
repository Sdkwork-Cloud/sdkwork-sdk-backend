package com.sdkwork.backend

data class ChangePasswordForm(
    val userId: String? = null,
    val oldPassword: String? = null,
    val newPassword: String? = null
)
