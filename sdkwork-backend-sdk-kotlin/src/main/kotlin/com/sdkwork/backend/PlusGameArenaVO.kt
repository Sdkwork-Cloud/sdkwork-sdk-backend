package com.sdkwork.backend

data class PlusGameArenaVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val arenaId: Int? = null,
    val arenaNo: String? = null,
    val name: String? = null,
    val description: String? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val status: String? = null,
    val ownerUserId: Int? = null,
    val currentChampionUserId: Int? = null,
    val currentChallengeId: Int? = null,
    val stakeScore: Int? = null,
    val totalChallengeCount: Int? = null,
    val successfulDefenseCount: Int? = null,
    val failedDefenseCount: Int? = null,
    val currentDefenseStreak: Int? = null,
    val bestDefenseStreak: Int? = null,
    val totalRewardScore: Int? = null,
    val roomId: Int? = null,
    val matchId: Int? = null,
    val openedAt: String? = null,
    val lastChallengeAt: String? = null,
    val lastSettledAt: String? = null,
    val closedAt: String? = null
)
