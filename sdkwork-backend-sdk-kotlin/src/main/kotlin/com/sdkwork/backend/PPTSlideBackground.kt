package com.sdkwork.backend

data class PPTSlideBackground(
    val type: PPTSlideBackgroundType? = null,
    val color: String? = null,
    val image: PPTSlideBackgroundImage? = null,
    val pptgradient: PPTGradient? = null
)
