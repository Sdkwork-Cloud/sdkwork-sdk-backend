package com.sdkwork.backend

data class PlusGameTournamentQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val gameType: String? = null,
    val status: String? = null
)
