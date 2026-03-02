package com.sdkwork.backend

data class InvitationRelationForm(
    val inviterUserId: Int? = null,
    val inviteeUserId: Int? = null,
    val inviteCode: String? = null,
    val usedTime: String? = null,
    val relationLevel: Int? = null,
    val rewardStatus: String? = null,
    val rewardAmount: Double? = null,
    val rewardType: String? = null
)
