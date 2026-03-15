package com.sdkwork.backend

data class PlusGameRoomSeatQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val roomId: Int? = null,
    val userId: Int? = null,
    val status: String? = null
)
