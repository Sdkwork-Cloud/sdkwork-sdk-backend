package com.sdkwork.backend

data class GenerateVoiceSpeakerVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val requestId: String? = null,
    val taskId: String? = null,
    val taskStatus: String? = null,
    val voiceResources: AudioMediaResourceList? = null,
    val voiceSpeakerId: String? = null,
    val voiceSpeakerName: String? = null,
    val voiceType: String? = null,
    val voiceStyle: String? = null,
    val model: String? = null,
    val duration: Int? = null,
    val errorMessage: String? = null
)
