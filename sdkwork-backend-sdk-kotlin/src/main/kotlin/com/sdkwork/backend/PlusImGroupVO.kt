package com.sdkwork.backend

data class PlusImGroupVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
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
