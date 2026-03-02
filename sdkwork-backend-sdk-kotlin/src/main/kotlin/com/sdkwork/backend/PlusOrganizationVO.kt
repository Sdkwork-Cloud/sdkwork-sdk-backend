package com.sdkwork.backend

data class PlusOrganizationVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val code: String? = null,
    val status: String? = null,
    val description: String? = null,
    val parentId: Int? = null,
    val installAppList: InstallAppList? = null
)
