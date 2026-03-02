package com.sdkwork.backend

data class UnionPayObject(
    val payUrl: String? = null,
    val tn: String? = null,
    val merOrderId: String? = null,
    val merId: String? = null,
    val mode: String? = null,
    val schemeStr: String? = null,
    val signature: String? = null
)
