package com.sdkwork.backend

data class ChatOptions(
    val topP: Double? = null,
    val topK: Int? = null,
    val presencePenalty: Double? = null,
    val maxTokens: Int? = null,
    val stopSequences: List<String>? = null,
    val frequencyPenalty: Double? = null,
    val model: String? = null,
    val temperature: Double? = null
)
