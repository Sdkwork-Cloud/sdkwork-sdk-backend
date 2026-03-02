package com.sdkwork.backend

data class PlusMemberRelationsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val memberId: Int? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val type: String? = null,
    val parentId: Int? = null,
    val targetId: Int? = null,
    val isPrimary: Boolean? = null,
    val isActive: Boolean? = null,
    val effectiveAt: String? = null,
    val expiredAt: String? = null,
    val sortOrder: Int? = null,
    val remark: String? = null
)
