package com.sdkwork.backend

data class PlusVipLevelBenefitVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val vipLevelId: Int? = null,
    val benefitId: Int? = null,
    val dailyLimit: Int? = null,
    val monthlyLimit: Int? = null,
    val totalLimit: Int? = null,
    val status: String? = null,
    val metadata: VipLevelBenefitMetadata? = null,
    val remark: String? = null
)
