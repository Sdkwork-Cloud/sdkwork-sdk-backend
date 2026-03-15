package com.sdkwork.backend

data class PlusConversationOpenForm(
    val conversationId: String? = null,
    val uuid: String? = null,
    val userId: Int? = null,
    val agentId: Int? = null,
    val knowledgeBaseId: Int? = null,
    val dataSourceId: Int? = null,
    val chatOptions: PlusChatOptions? = null
)
