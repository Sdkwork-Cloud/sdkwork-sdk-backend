package com.sdkwork.backend

data class PlusFilePartForm(
    val fileId: Int? = null,
    val chunkIndex: Int? = null,
    val chunkSize: Int? = null,
    val totalSize: Int? = null,
    val checksum: String? = null,
    val status: Int? = null,
    val storagePath: String? = null
)
