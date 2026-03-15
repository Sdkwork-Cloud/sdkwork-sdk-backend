package com.sdkwork.backend

data class PlusGameRoomQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val userId: Int? = null,
    val definitionId: Int? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val seasonKey: String? = null,
    val roomNo: String? = null,
    val roomNoLike: String? = null,
    val nameLike: String? = null,
    val roomType: String? = null,
    val status: String? = null,
    val visibility: String? = null,
    val ranked: Boolean? = null,
    val allowSpectator: Boolean? = null,
    val leaderboardEligible: Boolean? = null,
    val replayEnabled: Boolean? = null,
    val clubId: Int? = null,
    val tournamentId: Int? = null,
    val regionCode: String? = null,
    val currentMatchId: Int? = null
)
