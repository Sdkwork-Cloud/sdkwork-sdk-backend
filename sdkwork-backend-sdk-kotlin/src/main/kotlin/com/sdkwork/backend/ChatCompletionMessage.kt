package com.sdkwork.backend

data class ChatCompletionMessage(
    val role: String? = null,
    val content: String? = null,
    val audio: ChatCompletionAudio? = null,
    val toolCalls: List<ChatCompletionMessageToolCall>? = null
)
