package com.sdkwork.backend

data class SpeechConfig(
    val speakerConfig: SpeechSpeakerConfig? = null,
    val transcriptionConfig: SpeechTranscriptionConfig? = null,
    val vadConfig: VadConfig? = null,
    val aecConfig: AecConfig? = null
)
