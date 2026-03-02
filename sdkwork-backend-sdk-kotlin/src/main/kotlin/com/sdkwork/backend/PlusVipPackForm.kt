package com.sdkwork.backend

data class PlusVipPackForm(
    val name: String? = null,
    val description: String? = null,
    val groupId: Int? = null,
    val vipLevelId: Int? = null,
    val price: Double? = null,
    val pointAmount: Int? = null,
    val vipDurationDays: Int? = null,
    val status: String? = null,
    val sortWeight: Int? = null,
    val validFrom: String? = null,
    val validTo: String? = null,
    val remark: String? = null
)
