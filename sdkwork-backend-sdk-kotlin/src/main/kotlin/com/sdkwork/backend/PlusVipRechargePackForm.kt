package com.sdkwork.backend

data class PlusVipRechargePackForm(
    val name: String? = null,
    val description: String? = null,
    val price: Double? = null,
    val pointAmount: Int? = null,
    val vipDurationDays: Int? = null,
    val status: Int? = null,
    val sortWeight: Int? = null,
    val validFrom: String? = null,
    val validTo: String? = null,
    val remark: String? = null
)
