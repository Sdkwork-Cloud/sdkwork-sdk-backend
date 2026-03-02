package com.sdkwork.backend

data class PlusChatMessageContentForm(
    val role: String? = null,
    val type: String? = null,
    val status: String? = null,
    val conversationId: Int? = null,
    val conversationUuid: String? = null,
    val agentId: Int? = null,
    val agentType: String? = null,
    val agentBizType: String? = null,
    val content: MessageBody? = null,
    val metadata: Map<String, Any>? = null
)
