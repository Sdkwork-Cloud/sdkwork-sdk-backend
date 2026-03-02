package com.sdkwork.backend

data class PlusConversationForm(
    val uuid: String? = null,
    val title: String? = null,
    val description: String? = null,
    val userId: Int? = null,
    val status: String? = null,
    val agentId: Int? = null,
    val summary: String? = null,
    val lastMessageId: Int? = null,
    val messageCount: Int? = null,
    val tags: TagsContent? = null,
    val systemContext: String? = null,
    val userContext: String? = null,
    val lastInteractionTime: String? = null,
    val modelId: Int? = null,
    val model: String? = null,
    val knowledgeBaseId: Int? = null,
    val dataSourceId: Int? = null,
    val chatOptions: PlusChatOptions? = null,
    val pinned: Boolean? = null,
    val sortOrder: Int? = null
)
