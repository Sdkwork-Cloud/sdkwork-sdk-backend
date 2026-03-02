package com.sdkwork.backend

data class PlusChatMessageForm(
    val content: MessageBody? = null,
    val role: String? = null,
    val type: String? = null,
    val status: String? = null,
    val conversationId: Int? = null,
    val userId: Int? = null,
    val parentMessageId: Int? = null,
    val metadata: Map<String, Any>? = null,
    val tokenCount: Int? = null,
    val processingTime: Int? = null,
    val isError: Boolean? = null,
    val errorCode: String? = null,
    val errorMessage: String? = null,
    val modelId: Int? = null,
    val model: String? = null,
    val temperature: Double? = null,
    val usedRag: Boolean? = null,
    val chatOptions: PlusChatOptions? = null
)
