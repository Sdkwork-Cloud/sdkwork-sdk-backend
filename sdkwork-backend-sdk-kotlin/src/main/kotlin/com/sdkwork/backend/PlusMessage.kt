package com.sdkwork.backend

data class PlusMessage(
    val id: Int? = null,
    val uuid: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val sendAt: String? = null,
    val conversationId: Int? = null,
    val type: String? = null,
    val sender: Participant? = null,
    val receiver: Participant? = null,
    val groupId: Int? = null,
    val msgId: String? = null,
    val clientMsgId: String? = null,
    val body: MessageBody? = null,
    val metadata: Map<String, Any>? = null,
    val content: String? = null
)
