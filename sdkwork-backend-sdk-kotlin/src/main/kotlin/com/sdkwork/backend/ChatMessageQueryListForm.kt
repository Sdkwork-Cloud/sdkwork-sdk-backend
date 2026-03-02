package com.sdkwork.backend

data class ChatMessageQueryListForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val conversationId: Int? = null,
    val conversationUuid: String? = null,
    val lastSyncMessageId: String? = null
)
