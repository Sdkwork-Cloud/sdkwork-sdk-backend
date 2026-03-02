package com.sdkwork.backend

data class PlusShardingKeyForm(
    val shardingKey: String? = null,
    val tenantId: Int? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val status: String? = null,
    val description: String? = null
)
