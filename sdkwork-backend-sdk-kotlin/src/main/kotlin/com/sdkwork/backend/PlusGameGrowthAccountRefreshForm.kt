package com.sdkwork.backend

data class PlusGameGrowthAccountRefreshForm(
    val userId: Int? = null,
    val accountType: String? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val seasonKey: String? = null
)
