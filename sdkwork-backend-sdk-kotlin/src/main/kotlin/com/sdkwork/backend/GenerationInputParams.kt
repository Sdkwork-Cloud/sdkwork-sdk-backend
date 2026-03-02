package com.sdkwork.backend

data class GenerationInputParams(
    val image: ImageGenerationInput? = null,
    val video: VideoGenerationInput? = null,
    val audio: AudioGenerationInput? = null,
    val music: MusicGenerationInput? = null,
    val voice: VoiceSpeakerGenerationInput? = null,
    val character: CharacterGenerationInput? = null,
    val audioEffect: AudioEffectGenerationInput? = null
)
