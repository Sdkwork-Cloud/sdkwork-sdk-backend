package com.sdkwork.backend

data class Message(
    val messageType: String? = null,
    val text: String? = null,
    val metadata: Map<String, Any>? = null
)
