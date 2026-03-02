package com.sdkwork.backend

data class SystemMessage(
    val messageType: String? = null,
    val metadata: Map<String, Any>? = null,
    val text: String? = null
)
