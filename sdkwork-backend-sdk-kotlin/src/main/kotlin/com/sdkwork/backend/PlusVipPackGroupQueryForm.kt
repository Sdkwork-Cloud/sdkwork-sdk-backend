package com.sdkwork.backend

data class PlusVipPackGroupQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val appId: Int? = null,
    val appIdIn: List<Int>? = null
)
