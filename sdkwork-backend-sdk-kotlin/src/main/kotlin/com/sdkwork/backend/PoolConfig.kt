package com.sdkwork.backend

data class PoolConfig(
    val minIdle: Int? = null,
    val maxPoolSize: Int? = null,
    val connectionTimeout: Int? = null,
    val idleTimeout: Int? = null,
    val maxLifetime: Int? = null,
    val autoCommit: Boolean? = null,
    val connectionTestQuery: String? = null,
    val poolName: String? = null
)
