package com.sdkwork.backend

data class TagsContent(
    val tags: List<String>? = null,
    val children: List<TagsContent>? = null
)
