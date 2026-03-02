package com.sdkwork.backend

data class PlusImGroupForm(
    val name: String? = null,
    val description: String? = null,
    val avatar: ImageMediaResource? = null,
    val announcement: String? = null,
    val memberCount: Int? = null,
    val maxMembers: Int? = null,
    val creatorId: Int? = null,
    val type: String? = null,
    val status: String? = null,
    val allowMemberInvite: Boolean? = null,
    val requireApproval: Boolean? = null
)
