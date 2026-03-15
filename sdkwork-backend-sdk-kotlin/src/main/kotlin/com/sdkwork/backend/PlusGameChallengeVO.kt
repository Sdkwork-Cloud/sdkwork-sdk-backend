package com.sdkwork.backend

data class PlusGameChallengeVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val challengeId: Int? = null,
    val challengeNo: String? = null,
    val arenaId: Int? = null,
    val sourceType: String? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val status: String? = null,
    val challengerUserId: Int? = null,
    val targetUserId: Int? = null,
    val winnerUserId: Int? = null,
    val loserUserId: Int? = null,
    val stakeScore: Int? = null,
    val challengerStakeLocked: Int? = null,
    val targetStakeLocked: Int? = null,
    val leaderboardId: Int? = null,
    val roomId: Int? = null,
    val matchId: Int? = null,
    val reason: String? = null,
    val challengedAt: String? = null,
    val acceptedAt: String? = null,
    val settledAt: String? = null,
    val expiredAt: String? = null,
    val canceledAt: String? = null
)
