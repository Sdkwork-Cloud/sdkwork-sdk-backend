package com.sdkwork.backend

data class ChatContext(
    val indent: String? = null,
    val responseHandler: ChatResponseHandler? = null,
    val shardingContext: ShardingContext? = null,
    val conversationId: String? = null,
    val conversationUuid: String? = null,
    val userId: Int? = null,
    val knowledgeBaseId: Int? = null,
    val agentId: Int? = null,
    val flowId: Int? = null,
    val datasourceId: Int? = null,
    val parentMessageId: Int? = null,
    val saveAudio: Boolean? = null,
    val modalities: List<String>? = null,
    val chatOptions: PlusChatOptions? = null,
    val responseChannels: List<String>? = null
)
