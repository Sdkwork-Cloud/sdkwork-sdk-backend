package com.sdkwork.backend

data class PlusAiPromptForm(
    val title: String? = null,
    val content: String? = null,
    val description: String? = null,
    val categoryId: Int? = null,
    val enabled: Boolean? = null,
    val sort: Int? = null,
    val parameters: Map<String, Any>? = null,
    val creator: String? = null,
    val model: String? = null,
    val tags: TagsContent? = null,
    val usageCount: Int? = null,
    val avgResponseTime: Int? = null
)
