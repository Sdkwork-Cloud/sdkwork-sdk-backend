package com.sdkwork.backend

data class ChatCompletionMessageToolCall(
    val id: String? = null,
    val type: String? = null,
    val function: FunctionCall? = null
)
