package com.sdkwork.backend

data class VoiceSpeakerInfo(
    val channel: String? = null,
    val provider: String? = null,
    val product: String? = null,
    val id: String? = null,
    val models: List<String>? = null,
    val speakerId: String? = null,
    val displayName: String? = null,
    val tags: TagsContent? = null,
    val motion: VoiceMotion? = null,
    val style: VoiceStyle? = null,
    val description: String? = null
)
