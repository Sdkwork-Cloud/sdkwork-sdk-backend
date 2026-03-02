package com.sdkwork.backend

data class PlusUserOAuthAccountForm(
    val userId: Int? = null,
    val oauthProvider: String? = null,
    val openId: String? = null,
    val unionId: String? = null,
    val appId: String? = null,
    val channelAccountId: Int? = null,
    val accessTokenExpiresAt: String? = null
)
