package com.sdkwork.backend

data class PlusGameRoomSeatVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val seatId: Int? = null,
    val roomId: Int? = null,
    val definitionId: Int? = null,
    val gameType: String? = null,
    val userId: Int? = null,
    val seatNo: Int? = null,
    val status: String? = null,
    val playerType: String? = null,
    val nicknameSnapshot: String? = null,
    val avatarUrl: String? = null,
    val joinSource: String? = null,
    val teamNo: Int? = null,
    val ready: Boolean? = null,
    val trusteeship: Boolean? = null,
    val spectator: Boolean? = null,
    val roomScore: Int? = null,
    val chips: Int? = null,
    val eliminatedRankNo: Int? = null,
    val joinedAt: String? = null,
    val eliminatedAt: String? = null,
    val leftAt: String? = null,
    val handSnapshot: Map<String, Any>? = null
)
