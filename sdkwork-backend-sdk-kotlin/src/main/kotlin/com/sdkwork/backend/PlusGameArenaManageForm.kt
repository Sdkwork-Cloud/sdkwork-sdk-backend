package com.sdkwork.backend

data class PlusGameArenaManageForm(
    val ownerUserId: Int? = null,
    val currentChampionUserId: Int? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val status: String? = null,
    val name: String? = null,
    val description: String? = null,
    val stakeScore: Int? = null,
    val roomId: Int? = null,
    val matchId: Int? = null,
    val reason: String? = null
)
