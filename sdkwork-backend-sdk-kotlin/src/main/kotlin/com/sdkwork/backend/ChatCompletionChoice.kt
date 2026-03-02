package com.sdkwork.backend

data class ChatCompletionChoice(
    val index: Int? = null,
    val message: ChatCompletionMessage? = null,
    val logprobs: LogProbInfo? = null,
    val finishReason: String? = null
)
