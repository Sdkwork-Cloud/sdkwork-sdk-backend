package com.sdkwork.backend

data class DnsServer(
    val address: String? = null,
    val port: Int? = null,
    val type: String? = null,
    val priority: Int? = null,
    val enabled: Boolean? = null
)
