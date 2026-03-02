package com.sdkwork.backend

data class PlusUserOAuthAccountVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val userId: Int? = null,
    val oauthProvider: String? = null,
    val openId: String? = null,
    val unionId: String? = null,
    val appId: String? = null,
    val channelAccountId: Int? = null,
    val accessTokenExpiresAt: String? = null
)
