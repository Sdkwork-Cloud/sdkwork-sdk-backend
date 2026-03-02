package com.sdkwork.backend

data class InvitationRelationVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val inviterUserId: Int? = null,
    val inviteeUserId: Int? = null,
    val inviteCode: String? = null,
    val usedTime: String? = null,
    val relationLevel: Int? = null,
    val rewardStatus: String? = null,
    val rewardAmount: Double? = null,
    val rewardType: String? = null
)
