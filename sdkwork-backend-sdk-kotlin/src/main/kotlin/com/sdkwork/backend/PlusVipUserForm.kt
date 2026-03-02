package com.sdkwork.backend

data class PlusVipUserForm(
    val userId: Int? = null,
    val vipLevelId: Int? = null,
    val status: String? = null,
    val pointBalance: Int? = null,
    val totalRechargedPoints: Int? = null,
    val validFrom: String? = null,
    val validTo: String? = null,
    val lastActiveTime: String? = null,
    val remark: String? = null
)
