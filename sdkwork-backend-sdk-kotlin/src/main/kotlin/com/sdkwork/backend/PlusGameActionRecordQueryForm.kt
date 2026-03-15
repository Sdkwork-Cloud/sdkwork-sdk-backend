package com.sdkwork.backend

data class PlusGameActionRecordQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val roomId: Int? = null,
    val matchId: Int? = null,
    val playerUserId: Int? = null,
    val actionType: String? = null,
    val actionCode: String? = null
)
