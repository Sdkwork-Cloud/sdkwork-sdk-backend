package com.sdkwork.backend

data class PlusTenantAuditLogVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val tenantId: Int? = null,
    val action: String? = null,
    val module: String? = null,
    val operator: String? = null,
    val description: String? = null,
    val result: String? = null,
    val createTime: String? = null,
    val ip: String? = null
)
