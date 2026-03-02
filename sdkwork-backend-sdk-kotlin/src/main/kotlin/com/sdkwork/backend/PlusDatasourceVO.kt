package com.sdkwork.backend

data class PlusDatasourceVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val type: Int? = null,
    val status: Int? = null,
    val description: String? = null,
    val connectionConfig: Any? = null,
    val url: String? = null,
    val owner: String? = null,
    val lastConnectedAt: String? = null,
    val connectionTimeout: Int? = null,
    val tags: TagsContent? = null,
    val dbVersion: String? = null,
    val securityLevel: Int? = null,
    val accessCount: Int? = null,
    val icon: String? = null,
    val color: String? = null,
    val schemaIds: List<Int>? = null
)
