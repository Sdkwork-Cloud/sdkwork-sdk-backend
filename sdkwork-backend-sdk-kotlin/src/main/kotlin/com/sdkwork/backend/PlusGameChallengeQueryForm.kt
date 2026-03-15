package com.sdkwork.backend

data class PlusGameChallengeQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val challengerUserId: Int? = null,
    val targetUserId: Int? = null,
    val arenaId: Int? = null,
    val winnerUserId: Int? = null,
    val gameType: String? = null,
    val status: String? = null,
    val sourceType: String? = null
)
