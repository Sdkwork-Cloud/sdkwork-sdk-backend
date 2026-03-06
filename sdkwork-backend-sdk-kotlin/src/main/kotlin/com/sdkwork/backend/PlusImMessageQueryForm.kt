package com.sdkwork.backend

data class PlusImMessageQueryForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val conversationId: Int? = null,
    val senderId: Int? = null,
    val receiverId: Int? = null,
    val groupId: Int? = null,
    val type: String? = null
)
