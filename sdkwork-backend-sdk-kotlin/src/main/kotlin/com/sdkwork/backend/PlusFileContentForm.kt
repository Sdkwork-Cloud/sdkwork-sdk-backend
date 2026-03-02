package com.sdkwork.backend

data class PlusFileContentForm(
    val fileId: Int? = null,
    val fileUuid: String? = null,
    val prompt: String? = null,
    val encoding: String? = null,
    val content: FileContentObject? = null
)
