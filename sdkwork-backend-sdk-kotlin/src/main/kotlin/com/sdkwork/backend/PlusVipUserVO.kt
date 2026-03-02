package com.sdkwork.backend

data class PlusVipUserVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val userId: Int? = null,
    val vipLevelId: Int? = null,
    val status: String? = null,
    val pointBalance: Int? = null,
    val totalRechargedPoints: Int? = null,
    val validFrom: String? = null,
    val validTo: String? = null,
    val lastActiveTime: String? = null,
    val remark: String? = null,
    val vipLevel: PlusVipLevelVO? = null
)
