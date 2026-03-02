package com.sdkwork.backend

data class PayAccountConfig(
    val id: Int? = null,
    val uuid: String? = null,
    val region: String? = null,
    val weight: Int? = null,
    val channel: String? = null,
    val product: String? = null,
    val functions: List<String>? = null,
    val metadata: AccountConfigMetadata? = null,
    val properties: Map<String, Any>? = null,
    val merchantId: String? = null,
    val appId: String? = null,
    val privateKey: String? = null,
    val publicKey: String? = null,
    val secretKey: String? = null,
    val notifyUrl: String? = null,
    val returnUrl: String? = null,
    val gatewayUrl: String? = null,
    val payType: String? = null
)
