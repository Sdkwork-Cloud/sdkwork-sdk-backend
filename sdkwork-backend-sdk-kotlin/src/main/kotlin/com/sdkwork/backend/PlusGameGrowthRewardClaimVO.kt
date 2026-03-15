package com.sdkwork.backend

data class PlusGameGrowthRewardClaimVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val accountId: Int? = null,
    val userId: Int? = null,
    val accountType: String? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val seasonKey: String? = null,
    val currentLevelNo: Int? = null,
    val levelNo: Int? = null,
    val levelCode: String? = null,
    val levelName: String? = null,
    val title: String? = null,
    val badgeCode: String? = null,
    val claimedAt: String? = null,
    val rewardIssuedAt: String? = null,
    val operatorUserId: Int? = null,
    val rewardConfig: Map<String, Any>? = null,
    val rewardSummary: Map<String, Any>? = null
)
