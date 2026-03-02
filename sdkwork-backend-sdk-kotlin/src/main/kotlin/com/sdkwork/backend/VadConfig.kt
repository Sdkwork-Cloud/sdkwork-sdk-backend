package com.sdkwork.backend

data class VadConfig(
    val speechThreshold: Double? = null,
    val minSpeechDurationMs: Int? = null,
    val minSilenceDurationMs: Int? = null,
    val maxSilenceDurationMs: Int? = null,
    val silenceTimeout: Int? = null,
    val speechTimeout: Int? = null,
    val windowSize: Int? = null,
    val stepSize: Int? = null
)
