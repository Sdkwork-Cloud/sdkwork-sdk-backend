package com.sdkwork.backend

data class PlusPermission(
    val tenantId: Int? = null,
    val organizationId: Int? = null,
    val dataScope: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val v: Int? = null,
    val name: String? = null,
    val code: String? = null,
    val description: String? = null,
    val status: String? = null,
    val sortOrder: Int? = null,
    val resourceUrl: String? = null,
    val httpMethod: String? = null
)
