package com.sdkwork.backend

data class PlusGameReplayQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val roomId: Int? = null,
    val matchId: Int? = null,
    val gameType: String? = null,
    val roomType: String? = null,
    val gameModeCode: String? = null,
    val seasonKey: String? = null,
    val clubId: Int? = null,
    val tournamentId: Int? = null,
    val regionCode: String? = null,
    val ownerUserId: Int? = null,
    val titleLike: String? = null,
    val status: String? = null,
    val publicVisible: Boolean? = null,
    val allowShare: Boolean? = null
)
