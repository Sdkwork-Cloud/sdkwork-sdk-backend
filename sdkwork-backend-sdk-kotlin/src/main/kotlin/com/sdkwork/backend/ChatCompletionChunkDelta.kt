package com.sdkwork.backend

data class ChatCompletionChunkDelta(
    val role: String? = null,
    val content: String? = null,
    val audio: ChatCompletionAudio? = null,
    val reasoningContent: String? = null,
    val toolCalls: List<ChatCompletionMessageToolCall>? = null
)
