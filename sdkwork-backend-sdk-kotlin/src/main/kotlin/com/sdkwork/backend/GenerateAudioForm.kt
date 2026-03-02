package com.sdkwork.backend

data class GenerateAudioForm(
    val title: String? = null,
    val prompt: String? = null,
    val voice: String? = null,
    val model: String? = null,
    val format: String? = null,
    val speed: Double? = null
)
