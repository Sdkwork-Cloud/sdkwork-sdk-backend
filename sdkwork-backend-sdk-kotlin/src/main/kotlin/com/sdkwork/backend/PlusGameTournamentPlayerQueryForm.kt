package com.sdkwork.backend

data class PlusGameTournamentPlayerQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val tournamentId: Int? = null,
    val userId: Int? = null,
    val status: String? = null
)
