package com.sdkwork.backend

data class PlusGameTournamentBatchStatusForm(
    val userIds: List<Int>? = null,
    val playerItems: List<PlusGameTournamentBatchStatusPlayerForm>? = null,
    val status: String? = null,
    val startRankNo: Int? = null
)
