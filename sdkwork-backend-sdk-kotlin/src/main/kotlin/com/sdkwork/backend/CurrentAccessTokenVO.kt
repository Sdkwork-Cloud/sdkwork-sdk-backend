package com.sdkwork.backend

data class CurrentAccessTokenVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val appId: Int? = null,
    val appName: String? = null,
    val platform: String? = null,
    val tenantId: Int? = null,
    val organizationId: Int? = null,
    val tenantAccessToken: TokenResult? = null,
    val organizationAccessToken: TokenResult? = null
)
