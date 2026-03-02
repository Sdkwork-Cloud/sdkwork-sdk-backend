package com.sdkwork.backend

data class InvitationCodeVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val code: String? = null,
    val creatorUserId: Int? = null,
    val status: String? = null,
    val expireTime: String? = null,
    val usageLimit: Int? = null,
    val usedCount: Int? = null
)
