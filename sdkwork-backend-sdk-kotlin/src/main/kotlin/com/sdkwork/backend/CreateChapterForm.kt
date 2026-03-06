package com.sdkwork.backend

data class CreateChapterForm(
    val contentWorkId: Int? = null,
    val parentDirectoryId: Int? = null,
    val fileName: String? = null,
    val isDirectory: Boolean? = null,
    val content: String? = null
)
