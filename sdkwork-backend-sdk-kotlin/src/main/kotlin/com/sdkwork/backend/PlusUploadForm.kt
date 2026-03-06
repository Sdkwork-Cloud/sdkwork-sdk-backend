package com.sdkwork.backend

data class PlusUploadForm(
    val provider: String? = null,
    val name: String? = null,
    val scene: String? = null,
    val bucket: BucketObject? = null,
    val expirationSeconds: Int? = null
)
