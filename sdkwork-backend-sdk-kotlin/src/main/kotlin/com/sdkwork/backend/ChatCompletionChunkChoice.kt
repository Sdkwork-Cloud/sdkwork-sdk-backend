package com.sdkwork.backend

data class ChatCompletionChunkChoice(
    val index: Int? = null,
    val delta: ChatCompletionChunkDelta? = null,
    val logprobs: LogProbInfo? = null,
    val finishReason: String? = null
)
