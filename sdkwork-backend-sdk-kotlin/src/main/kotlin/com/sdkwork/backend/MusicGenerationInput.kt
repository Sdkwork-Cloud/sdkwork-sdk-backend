package com.sdkwork.backend

data class MusicGenerationInput(
    val title: String? = null,
    val prompt: String? = null,
    val negativePrompt: String? = null,
    val referenceAssets: List<AssetMediaResource>? = null,
    val storyboard: VideoStoryboard? = null,
    val parameters: Map<String, Any>? = null,
    val n: Int? = null,
    val seed: Int? = null,
    val format: String? = null,
    val lyrics: String? = null,
    val duration: Int? = null,
    val genre: String? = null,
    val style: String? = null,
    val tempo: Int? = null,
    val key: String? = null,
    val timeSignature: String? = null,
    val mood: String? = null,
    val instruments: String? = null,
    val instrumental: Boolean? = null,
    val hd: Boolean? = null,
    val referenceAssetCount: Int? = null
)
