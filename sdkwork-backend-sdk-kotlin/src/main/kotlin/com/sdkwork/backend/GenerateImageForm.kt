package com.sdkwork.backend

data class GenerateImageForm(
    val prompt: String? = null,
    val negativePrompt: String? = null,
    val n: Int? = null,
    val width: Int? = null,
    val height: Int? = null,
    val model: String? = null,
    val responseFormat: String? = null,
    val style: String? = null,
    val aspectRatio: String? = null
)
