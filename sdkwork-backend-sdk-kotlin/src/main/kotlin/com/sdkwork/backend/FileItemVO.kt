package com.sdkwork.backend

data class FileItemVO(
    val id: String? = null,
    val object: String? = null,
    val bytes: Int? = null,
    val createdAt: Int? = null,
    val filename: String? = null,
    val purpose: String? = null,
    val expiresAt: Int? = null,
    val status: String? = null,
    val statusDetails: String? = null,
    val deleted: Boolean? = null
)
