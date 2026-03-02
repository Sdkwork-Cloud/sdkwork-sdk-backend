package com.sdkwork.backend

data class MiniProgramAccountConfig(
    val id: Int? = null,
    val uuid: String? = null,
    val region: String? = null,
    val weight: Int? = null,
    val channel: String? = null,
    val product: String? = null,
    val functions: List<String>? = null,
    val metadata: AccountConfigMetadata? = null,
    val properties: Map<String, Any>? = null,
    val appId: String? = null,
    val secret: String? = null,
    val baseUrl: String? = null,
    val accessKey: String? = null,
    val secretKey: String? = null,
    val defaultModel: String? = null
)
