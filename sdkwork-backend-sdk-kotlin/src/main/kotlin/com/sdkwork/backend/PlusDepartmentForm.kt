package com.sdkwork.backend

data class PlusDepartmentForm(
    val name: String? = null,
    val description: String? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val code: String? = null,
    val sortOrder: Int? = null,
    val isActive: Boolean? = null,
    val parentId: Int? = null
)
