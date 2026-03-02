package com.sdkwork.backend

data class PlusDiskMemberForm(
    val diskId: Int? = null,
    val userId: Int? = null,
    val permission: DiskPermission? = null,
    val remark: String? = null,
    val isOwner: Boolean? = null
)
