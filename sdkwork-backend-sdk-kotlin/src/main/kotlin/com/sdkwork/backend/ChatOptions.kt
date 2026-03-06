package com.sdkwork.backend

data class ChatOptions(
    val model: String? = null,
    val temperature: Double? = null,
    val topP: Double? = null,
    val topK: Int? = null,
    val maxTokens: Int? = null,
    val stopSequences: List<String>? = null,
    val frequencyPenalty: Double? = null,
    val presencePenalty: Double? = null
)
