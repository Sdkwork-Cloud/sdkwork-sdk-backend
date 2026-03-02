package com.sdkwork.backend

data class PlusVipLevelVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val levelValue: Int? = null,
    val requiredPoints: Int? = null,
    val description: String? = null,
    val benefitIds: List<Int>? = null,
    val benefits: List<PlusVipBenefitVO>? = null
)
