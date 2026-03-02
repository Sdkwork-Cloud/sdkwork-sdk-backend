package com.sdkwork.backend

data class VideoGenerationInput(
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
    val duration: Int? = null,
    val fps: Int? = null,
    val style: String? = null,
    val aspectRatio: String? = null,
    val motionStrength: Int? = null,
    val cameraMotion: String? = null,
    val loop: Boolean? = null,
    val hd: Boolean? = null,
    val subtitle: Boolean? = null,
    val textToVideo: Boolean? = null,
    val referenceAssetCount: Int? = null
)
