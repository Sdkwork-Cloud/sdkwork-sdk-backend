package com.sdkwork.backend

data class PlusVipBenefitUsageVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val userId: Int? = null,
    val benefitType: String? = null,
    val usageTime: String? = null,
    val usageCount: Int? = null,
    val status: Int? = null,
    val sourceId: Int? = null,
    val sourceType: String? = null,
    val remark: String? = null
)
