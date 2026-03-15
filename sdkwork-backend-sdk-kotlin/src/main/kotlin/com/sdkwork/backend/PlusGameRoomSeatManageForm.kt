package com.sdkwork.backend

data class PlusGameRoomSeatManageForm(
    val userId: Int? = null,
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
    val eliminatedRankNo: Int? = null
)
