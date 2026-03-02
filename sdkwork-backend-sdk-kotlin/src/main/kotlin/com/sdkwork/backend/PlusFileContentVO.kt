package com.sdkwork.backend

data class PlusFileContentVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val fileId: Int? = null,
    val fileUuid: String? = null,
    val prompt: String? = null,
    val encoding: String? = null,
    val content: FileContentObject? = null
)
