package com.sdkwork.backend

data class PlusRolePermissionVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val roleId: Int? = null,
    val roleUuid: String? = null,
    val permissionId: Int? = null,
    val permissionUuid: String? = null,
    val enabled: Boolean? = null,
    val description: String? = null,
    val operatorId: Int? = null,
    val status: String? = null
)
