package com.sdkwork.backend

data class PlusVipRechargeForm(
    val userId: Int? = null,
    val vipLevelId: Int? = null,
    val amount: Double? = null,
    val pointAmount: Int? = null,
    val rechargeType: String? = null,
    val rechargeTime: String? = null,
    val transactionNo: String? = null,
    val status: Int? = null,
    val remark: String? = null
)
