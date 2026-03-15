package com.sdkwork.backend

data class PlusGameGrowthRewardClaimQueryForm(
    val accountId: Int? = null,
    val userId: Int? = null,
    val accountType: String? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val seasonKey: String? = null
)
