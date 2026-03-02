package com.sdkwork.backend

data class PlusFileObject(
    val id: Int? = null,
    val uuid: String? = null,
    val diskId: Int? = null,
    val name: String? = null,
    val size: Int? = null,
    val path: String? = null,
    val relativePath: String? = null,
    val type: String? = null,
    val extension: String? = null,
    val lastModifiedTime: String? = null,
    val createdAt: String? = null,
    val versionId: String? = null,
    val description: String? = null,
    val projectUuid: String? = null,
    val projectId: Int? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val author: String? = null,
    val prompt: String? = null,
    val content: String? = null,
    val tags: TagsContent? = null,
    val readonly: Boolean? = null,
    val permission: List<String>? = null,
    val referenceFileId: Int? = null,
    val children: List<PlusFileObject>? = null
)
