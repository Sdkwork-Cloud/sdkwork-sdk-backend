package com.sdkwork.backend

data class GenerateMusicForm(
    val prompt: String? = null,
    val lyrics: String? = null,
    val n: Int? = null,
    val model: String? = null,
    val tempo: Int? = null,
    val style: String? = null,
    val instrument: String? = null
)
