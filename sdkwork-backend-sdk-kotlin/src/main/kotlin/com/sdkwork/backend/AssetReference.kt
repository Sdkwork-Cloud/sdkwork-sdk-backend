package com.sdkwork.backend

data class AssetReference(
    val fileId: Int? = null,
    val fileUuid: String? = null,
    val filePath: String? = null,
    val assetType: String? = null,
    val mimeType: String? = null,
    val url: String? = null
)
