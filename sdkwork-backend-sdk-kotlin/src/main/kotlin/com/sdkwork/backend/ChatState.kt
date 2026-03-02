package com.sdkwork.backend

data class ChatState(
    val content: String? = null,
    val reasoningContent: String? = null,
    val thinking: Boolean? = null
)
