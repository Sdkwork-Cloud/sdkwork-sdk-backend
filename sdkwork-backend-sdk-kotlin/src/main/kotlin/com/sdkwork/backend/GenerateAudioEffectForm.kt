package com.sdkwork.backend

data class GenerateAudioEffectForm(
    val title: String? = null,
    val prompt: String? = null,
    val audioType: String? = null,
    val effectType: String? = null,
    val intensity: Int? = null,
    val effectParams: String? = null,
    val model: String? = null,
    val channel: String? = null
)
