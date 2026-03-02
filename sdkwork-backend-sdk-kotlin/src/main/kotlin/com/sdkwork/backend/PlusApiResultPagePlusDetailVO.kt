package com.sdkwork.backend

data class PlusApiResultPagePlusDetailVO(
    val data: PagePlusDetailVO? = null,
    val code: String? = null,
    val msg: String? = null,
    val requestId: String? = null,
    val ip: String? = null,
    val hostname: String? = null,
    val errorName: String? = null
)
