package com.sdkwork.backend

data class PlusApiResultListPlusChatMessageVO(
    val data: List<PlusChatMessageVO>? = null,
    val code: String? = null,
    val msg: String? = null,
    val requestId: String? = null,
    val ip: String? = null,
    val hostname: String? = null,
    val errorName: String? = null
)
