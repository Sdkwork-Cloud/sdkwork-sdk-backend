package com.sdkwork.backend

data class SceneContent(
    val scenes: List<String>? = null,
    val children: List<SceneContent>? = null
)
