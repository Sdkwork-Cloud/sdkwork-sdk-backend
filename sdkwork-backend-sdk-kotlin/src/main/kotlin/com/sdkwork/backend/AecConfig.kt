package com.sdkwork.backend

data class AecConfig(
    val echoMode: Int? = null,
    val delayEstimation: Int? = null,
    val noiseSuppression: Int? = null,
    val echoTailMs: Int? = null,
    val sampleRate: Int? = null
)
