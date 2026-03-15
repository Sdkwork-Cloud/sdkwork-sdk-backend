package com.sdkwork.backend

data class PlusGameRecordQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val userId: Int? = null,
    val roomId: Int? = null,
    val matchId: Int? = null,
    val tournamentId: Int? = null,
    val clubId: Int? = null,
    val seatNo: Int? = null,
    val winner: Boolean? = null,
    val escaped: Boolean? = null,
    val gameType: String? = null,
    val gameModeCode: String? = null,
    val resultType: String? = null
)
