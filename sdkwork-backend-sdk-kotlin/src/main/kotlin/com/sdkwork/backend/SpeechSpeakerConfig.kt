package com.sdkwork.backend

data class SpeechSpeakerConfig(
    val speaker: VoiceSpeakerInfo? = null,
    val speakerId: Int? = null,
    val volume: Double? = null,
    val pitch: Double? = null,
    val language: String? = null,
    val speed: Double? = null,
    val format: String? = null
)
