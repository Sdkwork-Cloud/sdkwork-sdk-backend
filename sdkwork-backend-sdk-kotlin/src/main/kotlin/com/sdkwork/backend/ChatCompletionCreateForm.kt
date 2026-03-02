package com.sdkwork.backend

data class ChatCompletionCreateForm(
    val model: String? = null,
    val messages: List<ChatCompletionMessage>? = null,
    val temperature: Double? = null,
    val n: Int? = null,
    val stream: Boolean? = null,
    val stop: List<String>? = null,
    val user: String? = null,
    val tool: String? = null,
    val topP: Double? = null,
    val maxTokens: Int? = null,
    val presencePenalty: Double? = null,
    val frequencyPenalty: Double? = null,
    val logitBias: Map<String, Int>? = null,
    val responseFormat: Boolean? = null,
    val systemFingerprint: String? = null,
    val chatContext: ChatContext? = null
)
