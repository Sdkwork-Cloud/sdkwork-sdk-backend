package com.sdkwork.backend

data class PlusVipBenefitUsageForm(
    val userId: Int? = null,
    val benefitType: String? = null,
    val usageTime: String? = null,
    val usageCount: Int? = null,
    val status: Int? = null,
    val sourceId: Int? = null,
    val sourceType: String? = null,
    val remark: String? = null
)
