package com.sdkwork.backend

data class UserMessage(
    val messageType: String? = null,
    val metadata: Map<String, Any>? = null,
    val media: List<Media>? = null,
    val text: String? = null
)
