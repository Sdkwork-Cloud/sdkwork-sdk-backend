package com.sdkwork.backend

data class AudioEffectGenerationInput(
    val title: String? = null,
    val prompt: String? = null,
    val negativePrompt: String? = null,
    val referenceAssets: List<AssetMediaResource>? = null,
    val storyboard: VideoStoryboard? = null,
    val parameters: Map<String, Any>? = null,
    val n: Int? = null,
    val seed: Int? = null,
    val format: String? = null,
    val description: String? = null,
    val category: String? = null,
    val duration: Int? = null,
    val sampleRate: Int? = null,
    val bitRate: Int? = null,
    val channels: Int? = null,
    val loop: Boolean? = null,
    val fadeIn: Double? = null,
    val fadeOut: Double? = null,
    val referenceAssetCount: Int? = null
)
