package com.sdkwork.backend

data class PlusGameScoreRecordQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val userId: Int? = null,
    val gameType: String? = null,
    val changeType: String? = null,
    val tournamentId: Int? = null,
    val roomId: Int? = null,
    val matchId: Int? = null,
    val leaderboardId: Int? = null,
    val bizNo: String? = null,
    val operatorUserId: Int? = null
)
