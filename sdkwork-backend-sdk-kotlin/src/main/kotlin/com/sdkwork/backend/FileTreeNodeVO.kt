package com.sdkwork.backend

data class FileTreeNodeVO(
    val id: Int? = null,
    val uuid: String? = null,
    val name: String? = null,
    val type: String? = null,
    val isDirectory: Boolean? = null,
    val path: String? = null,
    val relativePath: String? = null,
    val size: Int? = null,
    val content: String? = null,
    val parentId: Int? = null,
    val children: List<FileTreeNodeVO>? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val extension: String? = null,
    val description: String? = null,
    val readOnly: Boolean? = null
)
