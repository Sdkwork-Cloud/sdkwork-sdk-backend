package com.sdkwork.backend

data class VipLevelBenefitMetadata(
    val maxUsageCount: Int? = null,
    val maxDailyUsage: Int? = null,
    val maxMonthlyUsage: Int? = null,
    val isUnlimited: Boolean? = null,
    val validPeriod: String? = null,
    val extendInfo: String? = null
)
