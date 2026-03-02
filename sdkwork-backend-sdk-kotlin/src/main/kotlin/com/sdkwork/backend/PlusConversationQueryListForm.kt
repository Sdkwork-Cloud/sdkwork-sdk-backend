package com.sdkwork.backend

data class PlusConversationQueryListForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val initDefaults: Boolean? = null
)
