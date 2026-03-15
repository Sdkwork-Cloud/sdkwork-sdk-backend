package com.sdkwork.backend

data class PlusNewsForm(
    val title: String? = null,
    val url: String? = null,
    val source: String? = null,
    val summary: String? = null,
    val publishTime: String? = null,
    val tags: TagsContent? = null,
    val categoryId: Int? = null,
    val userId: Int? = null
)
