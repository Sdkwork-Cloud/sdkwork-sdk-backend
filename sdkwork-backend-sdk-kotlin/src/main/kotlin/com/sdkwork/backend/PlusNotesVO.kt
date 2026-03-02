package com.sdkwork.backend

data class PlusNotesVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val title: String? = null,
    val content: String? = null,
    val userId: Int? = null,
    val userName: String? = null,
    val categoryId: Int? = null,
    val categoryName: String? = null,
    val tags: String? = null,
    val accessScope: String? = null,
    val password: String? = null,
    val coverImage: ImageMediaResource? = null,
    val status: String? = null,
    val remark: String? = null,
    val diskId: Int? = null,
    val parentId: Int? = null,
    val type: String? = null,
    val path: String? = null,
    val relativePath: String? = null
)
