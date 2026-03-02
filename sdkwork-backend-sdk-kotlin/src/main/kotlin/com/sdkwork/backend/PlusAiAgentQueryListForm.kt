package com.sdkwork.backend

data class PlusAiAgentQueryListForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val userId: Int? = null,
    val keyword: String? = null,
    val status: String? = null,
    val dataScope: String? = null
)
