package com.sdkwork.backend

data class PlusParticipantForm(
    val type: String? = null,
    val name: String? = null,
    val face: ImageMediaResource? = null,
    val userId: Int? = null,
    val agentId: Int? = null,
    val role: String? = null,
    val contextType: String? = null,
    val contextId: Int? = null,
    val conversationId: Int? = null,
    val groupType: String? = null,
    val conversationType: String? = null,
    val isCreator: Boolean? = null,
    val isOnline: Boolean? = null,
    val lastActiveTime: String? = null,
    val isTemporary: Boolean? = null
)
