package com.sdkwork.backend

data class PlusOrganizationMemberVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val userId: Int? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val isActive: Boolean? = null,
    val joinedAt: String? = null,
    val leftAt: String? = null,
    val remark: String? = null,
    val departmentIds: List<Int>? = null,
    val positionIds: List<Int>? = null,
    val roleIds: List<Int>? = null,
    val primaryDepartmentId: Int? = null,
    val primaryPositionId: Int? = null,
    val valid: Boolean? = null
)
