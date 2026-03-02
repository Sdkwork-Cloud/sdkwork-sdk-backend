package com.sdkwork.backend

data class PlusFileForm(
    val name: String? = null,
    val path: String? = null,
    val objectKey: String? = null,
    val size: Int? = null,
    val contentType: String? = null,
    val extension: String? = null,
    val storageClass: String? = null,
    val versionId: String? = null,
    val resource: FileMediaResource? = null,
    val uploadTime: String? = null,
    val lastAccessTime: String? = null,
    val description: String? = null,
    val tags: TagsContent? = null,
    val fileType: String? = null,
    val fileCategory: String? = null,
    val isPublic: Boolean? = null,
    val status: String? = null,
    val parentId: Int? = null,
    val etag: String? = null
)
