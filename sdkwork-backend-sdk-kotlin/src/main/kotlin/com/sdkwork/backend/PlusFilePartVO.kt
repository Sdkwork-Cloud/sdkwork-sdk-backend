package com.sdkwork.backend

data class PlusFilePartVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val fileId: Int? = null,
    val chunkIndex: Int? = null,
    val chunkSize: Int? = null,
    val totalSize: Int? = null,
    val checksum: String? = null,
    val status: Int? = null,
    val storagePath: String? = null
)
