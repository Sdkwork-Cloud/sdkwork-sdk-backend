package com.sdkwork.backend

data class VoiceSpeakerGenerationInput(
    val title: String? = null,
    val prompt: String? = null,
    val negativePrompt: String? = null,
    val referenceAssets: List<AssetMediaResource>? = null,
    val storyboard: VideoStoryboard? = null,
    val parameters: Map<String, Any>? = null,
    val n: Int? = null,
    val seed: Int? = null,
    val format: String? = null,
    val text: String? = null,
    val speakerName: String? = null,
    val speakerId: String? = null,
    val language: String? = null,
    val speed: Double? = null,
    val pitch: Double? = null,
    val volume: Int? = null,
    val emotion: String? = null,
    val saveSpeaker: Boolean? = null,
    val voiceClone: Boolean? = null,
    val usingExistingSpeaker: Boolean? = null,
    val referenceAssetCount: Int? = null
)
