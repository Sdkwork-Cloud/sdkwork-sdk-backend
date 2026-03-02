package com.sdkwork.backend

data class InvitationCodeForm(
    val code: String? = null,
    val creatorUserId: Int? = null,
    val status: String? = null,
    val expireTime: String? = null,
    val usageLimit: Int? = null,
    val usedCount: Int? = null
)
