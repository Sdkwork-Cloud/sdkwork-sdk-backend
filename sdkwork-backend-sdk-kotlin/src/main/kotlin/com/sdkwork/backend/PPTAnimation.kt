package com.sdkwork.backend

data class PPTAnimation(
    val id: String? = null,
    val elId: String? = null,
    val effect: String? = null,
    val type: PPTAnimationType? = null,
    val duration: Int? = null,
    val trigger: PPTAnimationTrigger? = null
)
