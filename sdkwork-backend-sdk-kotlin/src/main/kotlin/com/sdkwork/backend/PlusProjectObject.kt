package com.sdkwork.backend

data class PlusProjectObject(
    val name: String? = null,
    val id: String? = null,
    val type: String? = null,
    val owner: String? = null,
    val lastModifiedTime: String? = null,
    val version: String? = null,
    val tags: TagsContent? = null,
    val description: String? = null,
    val title: String? = null,
    val createdAt: String? = null,
    val ownerId: Int? = null,
    val uuid: String? = null,
    val diskId: Int? = null,
    val author: String? = null,
    val files: List<PlusFileObject>? = null,
    val screenType: String? = null
)
