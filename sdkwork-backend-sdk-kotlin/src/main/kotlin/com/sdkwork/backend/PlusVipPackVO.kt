package com.sdkwork.backend

data class PlusVipPackVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
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
    val remark: String? = null,
    val vipLevel: PlusVipLevelVO? = null
)
