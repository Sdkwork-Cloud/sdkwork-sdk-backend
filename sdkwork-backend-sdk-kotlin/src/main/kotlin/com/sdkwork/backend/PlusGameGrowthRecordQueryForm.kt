package com.sdkwork.backend

data class PlusGameGrowthRecordQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val userId: Int? = null,
    val accountType: String? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val seasonKey: String? = null,
    val roomId: Int? = null,
    val matchId: Int? = null,
    val tournamentId: Int? = null,
    val sourceType: String? = null
)
