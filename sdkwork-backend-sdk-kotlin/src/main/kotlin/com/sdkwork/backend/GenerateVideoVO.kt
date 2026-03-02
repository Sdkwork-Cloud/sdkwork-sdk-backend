package com.sdkwork.backend

data class GenerateVideoVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val requestId: String? = null,
    val taskId: String? = null,
    val taskStatus: String? = null,
    val videos: VideoMediaResourceList? = null,
    val status: String? = null
)
