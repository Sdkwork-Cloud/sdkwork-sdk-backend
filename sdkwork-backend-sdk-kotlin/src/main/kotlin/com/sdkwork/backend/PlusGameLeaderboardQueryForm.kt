package com.sdkwork.backend

data class PlusGameLeaderboardQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val seasonKey: String? = null,
    val scopeOwnerId: Int? = null,
    val rankingType: String? = null,
    val periodType: String? = null,
    val scopeType: String? = null
)
