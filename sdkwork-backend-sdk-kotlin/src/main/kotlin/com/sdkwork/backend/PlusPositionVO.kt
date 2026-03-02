package com.sdkwork.backend

data class PlusPositionVO(
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
    val level: Int? = null,
    val sortOrder: Int? = null,
    val isActive: Boolean? = null,
    val organizationName: String? = null,
    val memberIds: List<Int>? = null
)
