package com.sdkwork.backend

data class PlusApiResultPasswordResetResultVO(
    val data: PasswordResetResultVO? = null,
    val code: String? = null,
    val msg: String? = null,
    val requestId: String? = null,
    val ip: String? = null,
    val hostname: String? = null,
    val errorName: String? = null
)
