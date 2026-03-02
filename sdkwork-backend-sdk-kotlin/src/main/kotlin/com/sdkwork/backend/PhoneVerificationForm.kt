package com.sdkwork.backend

data class PhoneVerificationForm(
    val phone: String? = null,
    val code: String? = null,
    val type: String? = null
)
