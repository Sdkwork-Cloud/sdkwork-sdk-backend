package com.sdkwork.backend

data class GenerateCharacterForm(
    val name: String? = null,
    val description: String? = null,
    val appearance: String? = null,
    val personality: String? = null,
    val background: String? = null,
    val style: String? = null,
    val responseFormat: String? = null,
    val model: String? = null,
    val n: Int? = null,
    val width: Int? = null,
    val height: Int? = null,
    val quality: String? = null,
    val prompt: String? = null,
    val negativePrompt: String? = null
)
