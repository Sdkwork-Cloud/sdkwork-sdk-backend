package com.sdkwork.backend

data class PlusArticleForm(
    val title: String? = null,
    val subtitle: String? = null,
    val content: String? = null,
    val wordCount: Int? = null,
    val readingTime: Int? = null,
    val coverImages: ImageMediaResourceList? = null,
    val author: AuthorInfo? = null,
    val source: String? = null,
    val status: String? = null,
    val keywords: List<String>? = null,
    val summary: String? = null
)
