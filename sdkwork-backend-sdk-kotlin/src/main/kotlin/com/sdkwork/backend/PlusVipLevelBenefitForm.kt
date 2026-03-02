package com.sdkwork.backend

data class PlusVipLevelBenefitForm(
    val vipLevelId: Int? = null,
    val benefitId: Int? = null,
    val dailyLimit: Int? = null,
    val monthlyLimit: Int? = null,
    val totalLimit: Int? = null,
    val status: String? = null,
    val metadata: VipLevelBenefitMetadata? = null,
    val remark: String? = null
)
