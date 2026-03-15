package com.sdkwork.backend

data class PlusFeedsForm(
    val title: String? = null,
    val summary: String? = null,
    val categoryId: Int? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val coverImages: ImageMediaResourceList? = null,
    val source: String? = null,
    val publishTime: String? = null,
    val tags: TagsContent? = null,
    val status: String? = null
)
