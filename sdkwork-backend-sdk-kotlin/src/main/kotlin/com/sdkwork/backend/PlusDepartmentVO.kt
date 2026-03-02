package com.sdkwork.backend

data class PlusDepartmentVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val parentId: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val code: String? = null,
    val sortOrder: Int? = null,
    val isActive: Boolean? = null,
    val organizationId: Int? = null,
    val memberIds: List<Int>? = null
)
