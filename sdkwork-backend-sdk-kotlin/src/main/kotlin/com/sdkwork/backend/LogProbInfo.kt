package com.sdkwork.backend

data class LogProbInfo(
    val tokens: List<String>? = null,
    val tokenLogprobs: List<Double>? = null,
    val textOffset: List<Int>? = null
)
