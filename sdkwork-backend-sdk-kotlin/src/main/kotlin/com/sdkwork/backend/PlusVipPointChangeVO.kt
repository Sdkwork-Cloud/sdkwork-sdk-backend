package com.sdkwork.backend

data class PlusVipPointChangeVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val userId: Int? = null,
    val changeType: String? = null,
    val changeAmount: Int? = null,
    val beforeBalance: Int? = null,
    val afterBalance: Int? = null,
    val sourceId: Int? = null,
    val sourceType: String? = null,
    val remark: String? = null
)
