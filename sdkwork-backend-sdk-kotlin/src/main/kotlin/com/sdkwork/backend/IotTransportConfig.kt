package com.sdkwork.backend

data class IotTransportConfig(
    val type: String? = null,
    val url: String? = null,
    val connectionTimeout: Int? = null,
    val keepAliveInterval: Int? = null,
    val qos: Int? = null,
    val clientId: String? = null,
    val authToken: String? = null,
    val username: String? = null,
    val password: String? = null,
    val sslEnabled: Boolean? = null,
    val cleanSession: Boolean? = null,
    val willTopic: String? = null,
    val willMessage: String? = null,
    val willQos: Int? = null,
    val willRetain: Boolean? = null,
    val publishTopics: List<String>? = null,
    val subscribeTopics: List<String>? = null
)
