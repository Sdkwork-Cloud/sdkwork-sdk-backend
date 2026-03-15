package com.sdkwork.backend

data class PlusGameTournamentPlayerVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val playerId: Int? = null,
    val tournamentId: Int? = null,
    val userId: Int? = null,
    val gameType: String? = null,
    val clubId: Int? = null,
    val teamNo: Int? = null,
    val status: String? = null,
    val seedNo: Int? = null,
    val rankNo: Int? = null,
    val nicknameSnapshot: String? = null,
    val avatarUrl: String? = null,
    val scoreValue: Double? = null,
    val totalMatchCount: Int? = null,
    val winCount: Int? = null,
    val loseCount: Int? = null,
    val registeredAt: String? = null,
    val checkedInAt: String? = null,
    val finishedAt: String? = null
)
