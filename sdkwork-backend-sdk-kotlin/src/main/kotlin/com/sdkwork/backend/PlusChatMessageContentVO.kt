package com.sdkwork.backend

data class PlusChatMessageContentVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val version: Int? = null,
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
