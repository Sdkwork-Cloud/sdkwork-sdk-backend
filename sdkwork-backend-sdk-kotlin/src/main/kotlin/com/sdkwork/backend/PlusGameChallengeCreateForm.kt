package com.sdkwork.backend

data class PlusGameChallengeCreateForm(
    val challengerUserId: Int? = null,
    val targetUserId: Int? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val stakeScore: Int? = null,
    val sourceType: String? = null,
    val arenaId: Int? = null,
    val leaderboardId: Int? = null,
    val reason: String? = null
)
