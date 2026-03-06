package com.sdkwork.backend

data class PlusNotesForm(
    val id: Int? = null,
    val title: String? = null,
    val content: String? = null,
    val userId: Int? = null,
    val categoryId: Int? = null,
    val tags: String? = null,
    val accessScope: String? = null,
    val password: String? = null,
    val coverImage: ImageMediaResource? = null,
    val status: String? = null,
    val remark: String? = null,
    val diskId: Int? = null,
    val parentId: Int? = null,
    val type: String? = null,
    val tagsAsTagsContent: TagsContent? = null
)
