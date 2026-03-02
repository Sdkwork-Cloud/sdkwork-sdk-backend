package com.sdkwork.backend

data class DatasourceConfig(
    val type: String? = null,
    val host: String? = null,
    val port: Int? = null,
    val database: String? = null,
    val username: String? = null,
    val password: String? = null,
    val params: String? = null,
    val poolConfig: PoolConfig? = null,
    val driverClassName: String? = null,
    val jdbcUrl: String? = null
)
