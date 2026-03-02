package com.sdkwork.backend

data class PPTGradient(
    val type: PPTGradientType? = null,
    val colors: List<PPTGradientColor>? = null,
    val rotate: Int? = null
)
