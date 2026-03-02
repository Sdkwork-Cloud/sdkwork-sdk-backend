package com.sdkwork.backend

data class PlusCollectionVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val contentId: Int? = null,
    val coverImage: String? = null,
    val isPublic: Boolean? = null,
    val isPinned: Boolean? = null,
    val sort: Int? = null,
    val itemCount: Int? = null,
    val viewCount: Int? = null,
    val favoriteCount: Int? = null,
    val lastUpdatedAt: String? = null,
    val parentId: Int? = null,
    val childrenIds: List<Int>? = null
)
