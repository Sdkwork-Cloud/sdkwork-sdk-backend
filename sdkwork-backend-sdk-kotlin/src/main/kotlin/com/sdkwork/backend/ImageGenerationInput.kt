package com.sdkwork.backend

data class ImageGenerationInput(
    val title: String? = null,
    val prompt: String? = null,
    val negativePrompt: String? = null,
    val referenceAssets: List<AssetMediaResource>? = null,
    val storyboard: VideoStoryboard? = null,
    val parameters: Map<String, Any>? = null,
    val n: Int? = null,
    val seed: Int? = null,
    val format: String? = null,
    val width: Int? = null,
    val height: Int? = null,
    val size: String? = null,
    val quality: String? = null,
    val style: String? = null,
    val cfgScale: Double? = null,
    val steps: Int? = null,
    val sampler: String? = null,
    val strength: Double? = null,
    val safetyChecker: Boolean? = null,
    val aspectRatio: String? = null,
    val referenceAssetCount: Int? = null
)
