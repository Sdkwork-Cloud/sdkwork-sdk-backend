package com.sdkwork.backend

data class PlusGetPresignedUrlForm(
    val provider: String? = null,
    val name: String? = null,
    val scene: String? = null,
    val bucket: BucketObject? = null,
    val method: String? = null,
    val expirationSeconds: Int? = null
)
