package com.sdkwork.backend

data class PlusApiKeyVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val name: String? = null,
    val keyValue: String? = null,
    val type: String? = null,
    val status: String? = null,
    val expireTime: String? = null,
    val description: String? = null,
    val lastUsedTime: String? = null
)
