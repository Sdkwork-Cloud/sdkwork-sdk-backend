package com.sdkwork.backend

data class PlusRolePermissionForm(
    val roleId: Int? = null,
    val roleUuid: String? = null,
    val permissionId: Int? = null,
    val permissionUuid: String? = null,
    val enabled: Boolean? = null,
    val description: String? = null,
    val operatorId: Int? = null
)
