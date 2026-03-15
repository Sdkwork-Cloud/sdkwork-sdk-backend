package com.sdkwork.backend

data class PlusGameArenaQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val ownerUserId: Int? = null,
    val currentChampionUserId: Int? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val status: String? = null
)
