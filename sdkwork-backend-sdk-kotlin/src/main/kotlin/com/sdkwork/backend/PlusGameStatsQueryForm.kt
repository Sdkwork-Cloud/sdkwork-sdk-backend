package com.sdkwork.backend

data class PlusGameStatsQueryForm(
    val userId: Int? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val seasonKey: String? = null,
    val scopeType: String? = null,
    val scopeOwnerId: Int? = null
)
