package com.sdkwork.backend

data class SpeechTranscriptionConfig(
    val channel: String? = null,
    val product: String? = null,
    val options: AudioTranscriptionOptions? = null
)
