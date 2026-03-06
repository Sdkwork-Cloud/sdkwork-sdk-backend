package com.sdkwork.backend

data class QrCodeStatusVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val status: String? = null,
    val userInfo: UserVO? = null,
    val token: LoginResultVO? = null
)
