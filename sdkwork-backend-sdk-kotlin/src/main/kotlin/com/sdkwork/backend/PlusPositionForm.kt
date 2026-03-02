package com.sdkwork.backend

data class PlusPositionForm(
    val parentId: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val code: String? = null,
    val level: Int? = null,
    val sortOrder: Int? = null,
    val isActive: Boolean? = null
)
