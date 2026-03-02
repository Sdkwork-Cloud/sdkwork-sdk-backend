package com.sdkwork.backend

data class ShardingContext(
    val platform: String? = null,
    val owner: String? = null,
    val shardingKey: String? = null,
    val tenantId: Int? = null,
    val organizationId: Int? = null,
    val userId: Int? = null
)
