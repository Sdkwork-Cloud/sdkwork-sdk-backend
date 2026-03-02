package com.sdkwork.backend

data class OAuthAccountConfig(
    val id: Int? = null,
    val uuid: String? = null,
    val region: String? = null,
    val weight: Int? = null,
    val channel: String? = null,
    val product: String? = null,
    val functions: List<String>? = null,
    val metadata: AccountConfigMetadata? = null,
    val properties: Map<String, Any>? = null,
    val authProvider: String? = null,
    val appId: String? = null,
    val appSecret: String? = null,
    val token: String? = null,
    val redirectUri: String? = null,
    val scope: String? = null,
    val isServiceAccount: Boolean? = null,
    val teamId: String? = null,
    val keyId: String? = null,
    val privateKey: String? = null,
    val publicKey: String? = null,
    val encodingAESKey: String? = null
)
