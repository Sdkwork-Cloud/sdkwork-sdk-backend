package com.sdkwork.backend

data class PlusTempSessionVO(
    val fileId: Int? = null,
    val tmpAccessKeyId: String? = null,
    val tmpAccessKeySecret: String? = null,
    val sessionToken: String? = null,
    val expirationSeconds: Int? = null,
    val uploadUrl: String? = null,
    val objectKey: String? = null,
    val bucket: BucketObject? = null,
    val createTime: String? = null
)
