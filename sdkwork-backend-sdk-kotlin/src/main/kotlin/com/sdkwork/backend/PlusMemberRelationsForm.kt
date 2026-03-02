package com.sdkwork.backend

data class PlusMemberRelationsForm(
    val memberId: Int? = null,
    val owner: String? = null,
    val ownerId: Int? = null,
    val type: String? = null,
    val targetId: Int? = null,
    val isPrimary: Boolean? = null,
    val isActive: Boolean? = null,
    val effectiveAt: String? = null,
    val expiredAt: String? = null,
    val sortOrder: Int? = null,
    val remark: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null
)
