package com.sdkwork.backend

data class PlusRole(
    val tenantId: Int? = null,
    val organizationId: Int? = null,
    val dataScope: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val v: Int? = null,
    val code: String? = null,
    val name: String? = null,
    val description: String? = null,
    val status: String? = null,
    val permissions: List<PlusPermission>? = null,
    val permissionCodes: List<String>? = null
)
