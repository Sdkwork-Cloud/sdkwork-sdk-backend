package com.sdkwork.backend

data class AudioGenerationInput(
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
    val voice: String? = null,
    val voiceSpeakerId: Int? = null,
    val language: String? = null,
    val speed: Double? = null,
    val pitch: Double? = null,
    val volume: Int? = null,
    val sampleRate: Int? = null,
    val bitRate: Int? = null,
    val channels: Int? = null,
    val emotion: String? = null,
    val referenceAssetCount: Int? = null
)
