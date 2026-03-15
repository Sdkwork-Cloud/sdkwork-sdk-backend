package com.sdkwork.backend

data class PlusGameMatchQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val definitionId: Int? = null,
    val roomId: Int? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val seasonKey: String? = null,
    val matchNo: String? = null,
    val matchNoLike: String? = null,
    val roomType: String? = null,
    val status: String? = null,
    val ranked: Boolean? = null,
    val clubId: Int? = null,
    val tournamentId: Int? = null,
    val regionCode: String? = null,
    val winnerUserId: Int? = null,
    val replayId: Int? = null,
    val leaderboardEligible: Boolean? = null,
    val validForStats: Boolean? = null,
    val resultConfirmed: Boolean? = null,
    val abnormalFinished: Boolean? = null
)
