package com.sdkwork.backend

data class PlusAiAgentConfig(
    val welcome: String? = null,
    val questions: List<String>? = null,
    val saveFiles: Boolean? = null,
    val enableMemory: Boolean? = null,
    val maxHistoryMessages: Int? = null,
    val useKnowledgeBase: Boolean? = null,
    val properties: Map<String, Any>? = null
)
