package com.sdkwork.backend

data class PlusShardingKeyVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val shardingKey: String? = null,
    val tenantId: Int? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val status: String? = null,
    val description: String? = null
)
