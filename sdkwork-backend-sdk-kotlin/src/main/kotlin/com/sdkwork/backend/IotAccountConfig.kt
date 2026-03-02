package com.sdkwork.backend

data class IotAccountConfig(
    val id: Int? = null,
    val uuid: String? = null,
    val region: String? = null,
    val weight: Int? = null,
    val channel: String? = null,
    val product: String? = null,
    val functions: List<String>? = null,
    val metadata: AccountConfigMetadata? = null,
    val properties: Map<String, Any>? = null,
    val transports: List<IotTransportConfig>? = null,
    val firmwareDownloadUrl: String? = null,
    val otaUpgradeUrl: String? = null,
    val deviceRegistryUrl: String? = null,
    val certificatePath: String? = null,
    val privateKeyPath: String? = null,
    val caCertificatePath: String? = null,
    val reportingInterval: Int? = null,
    val maxRetryAttempts: Int? = null,
    val retryInterval: Int? = null
)
