package com.sdkwork.backend

data class PlusGameMatchManageForm(
    val status: String? = null,
    val currentRoundNo: Int? = null,
    val maxRoundCount: Int? = null,
    val currentTurnSeatNo: Int? = null,
    val dealerSeatNo: Int? = null,
    val winnerSeatNo: Int? = null,
    val winnerUserId: Int? = null,
    val leaderboardEligible: Boolean? = null,
    val validForStats: Boolean? = null,
    val resultConfirmed: Boolean? = null,
    val abnormalFinished: Boolean? = null,
    val invalidReason: String? = null
)
