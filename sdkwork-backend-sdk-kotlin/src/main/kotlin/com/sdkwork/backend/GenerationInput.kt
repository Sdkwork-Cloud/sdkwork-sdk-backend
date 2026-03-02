package com.sdkwork.backend

data class GenerationInput(
    val type: String? = null,
    val image: ImageGenerationInput? = null,
    val video: VideoGenerationInput? = null,
    val audio: AudioGenerationInput? = null,
    val music: MusicGenerationInput? = null,
    val character: CharacterGenerationInput? = null,
    val voiceSpeaker: VoiceSpeakerGenerationInput? = null,
    val audioEffect: AudioEffectGenerationInput? = null,
    val input: BaseGenerationInput? = null,
    val prompt: String? = null
)
