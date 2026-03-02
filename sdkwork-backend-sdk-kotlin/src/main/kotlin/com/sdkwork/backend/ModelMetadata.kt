package com.sdkwork.backend

data class ModelMetadata(
    val durations: List<Int>? = null,
    val resolutions: List<String>? = null,
    val ratios: List<AspectRatio>? = null,
    val isMultimodal: Boolean? = null,
    val isReasoning: Boolean? = null,
    val isToolCall: Boolean? = null
)
