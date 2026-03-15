package com.sdkwork.backend

data class PlusGameTournamentBatchStatusPlayerForm(
    val userId: Int? = null,
    val status: String? = null,
    val rankNo: Int? = null,
    val scoreValue: Double? = null,
    val totalMatchCount: Int? = null,
    val winCount: Int? = null,
    val loseCount: Int? = null
)
