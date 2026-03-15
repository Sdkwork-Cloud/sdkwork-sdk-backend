package com.sdkwork.backend

data class PlusGameChallengeManageForm(
    val status: String? = null,
    val winnerUserId: Int? = null,
    val roomId: Int? = null,
    val matchId: Int? = null,
    val reason: String? = null
)
