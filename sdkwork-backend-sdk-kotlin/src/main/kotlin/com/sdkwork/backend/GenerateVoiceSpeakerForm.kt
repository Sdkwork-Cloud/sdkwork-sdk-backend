package com.sdkwork.backend

data class GenerateVoiceSpeakerForm(
    val voiceSpeakerName: String? = null,
    val voiceType: String? = null,
    val text: String? = null,
    val speed: Double? = null,
    val pitch: Double? = null,
    val volume: Int? = null,
    val model: String? = null,
    val responseFormat: String? = null,
    val prompt: String? = null
)
