package com.sdkwork.backend

data class PlusOrganizationMemberForm(
    val userId: Int? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val isActive: Boolean? = null,
    val joinedAt: String? = null,
    val leftAt: String? = null,
    val remark: String? = null
)
