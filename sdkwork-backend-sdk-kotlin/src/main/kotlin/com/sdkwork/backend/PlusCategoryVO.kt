package com.sdkwork.backend

data class PlusCategoryVO(
    val parentUuid: String? = null,
    val parentMetadata: PlusTreeParentMetadata? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val name: String? = null,
    val description: String? = null,
    val type: String? = null,
    val icon: String? = null,
    val sortWeight: Int? = null,
    val parentId: Int? = null,
    val path: List<String>? = null,
    val visible: Int? = null,
    val status: String? = null,
    val children: List<PlusCategoryVO>? = null,
    val tags: TagsContent? = null,
    val attributeIds: List<Int>? = null
)
