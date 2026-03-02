package com.sdkwork.backend

data class SendVerificationCodeForm(
    val identifier: String? = null,
    val method: String? = null,
    val type: String? = null
)
