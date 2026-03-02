package com.sdkwork.backend

data class GenerateMusicVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val requestId: String? = null,
    val taskId: String? = null,
    val taskStatus: String? = null,
    val audios: AudioMediaResourceList? = null,
    val lyrics: String? = null
)
