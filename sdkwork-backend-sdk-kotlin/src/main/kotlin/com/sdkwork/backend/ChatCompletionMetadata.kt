package com.sdkwork.backend

data class ChatCompletionMetadata(
    val actions: List<String>? = null,
    val agent: Map<String, Any>? = null,
    val parentMessageId: Int? = null,
    val parentMessageUuid: String? = null
)
