package com.sdkwork.backend

data class PlusApiResultListPlusCollectionVO(
    val data: List<PlusCollectionVO>? = null,
    val code: String? = null,
    val msg: String? = null,
    val requestId: String? = null,
    val ip: String? = null,
    val hostname: String? = null,
    val errorName: String? = null
)
