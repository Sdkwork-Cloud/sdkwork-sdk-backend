package com.sdkwork.backend

data class PlusGameTournamentManageForm(
    val status: String? = null,
    val signUpStartAt: String? = null,
    val signUpEndAt: String? = null,
    val startAt: String? = null,
    val endAt: String? = null,
    val winnerUserId: Int? = null,
    val winnerClubId: Int? = null
)
