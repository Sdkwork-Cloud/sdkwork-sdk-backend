package com.sdkwork.backend

data class GenerateImageVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val requestId: String? = null,
    val taskId: String? = null,
    val taskStatus: String? = null,
    val images: ImageMediaResourceList? = null
)
