package com.sdkwork.backend

data class ChatCompletion(
    val id: String? = null,
    val object: String? = null,
    val created: Int? = null,
    val model: String? = null,
    val choices: List<ChatCompletionChoice>? = null,
    val usage: CompletionUsage? = null,
    val metadata: ChatCompletionMetadata? = null,
    val content: String? = null,
    val agent: PlusAgent? = null,
    val systemFingerprint: String? = null
)
