package com.sdkwork.backend

data class PlusApiResultListPlusUserOAuthAccountVO(
    val data: List<PlusUserOAuthAccountVO>? = null,
    val code: String? = null,
    val msg: String? = null,
    val requestId: String? = null,
    val ip: String? = null,
    val hostname: String? = null,
    val errorName: String? = null
)
