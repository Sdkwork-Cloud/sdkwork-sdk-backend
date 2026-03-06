package com.sdkwork.backend

data class PlusAiModelInfoQueryListForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val keyword: String? = null,
    val channel: String? = null,
    val modelType: String? = null,
    val status: String? = null,
    val family: String? = null,
    val openSource: Boolean? = null
)
