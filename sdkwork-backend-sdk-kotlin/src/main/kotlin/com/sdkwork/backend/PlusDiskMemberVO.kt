package com.sdkwork.backend

data class PlusDiskMemberVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val v: Int? = null,
    val diskId: Int? = null,
    val userId: Int? = null,
    val permission: DiskPermission? = null,
    val remark: String? = null,
    val isOwner: Boolean? = null
)
