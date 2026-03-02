package com.sdkwork.backend

data class PlusApiKeyForm(
    val name: String? = null,
    val keyValue: String? = null,
    val type: String? = null,
    val status: String? = null,
    val expireTime: String? = null,
    val description: String? = null,
    val lastUsedTime: String? = null
)
