package com.sdkwork.backend

data class ContentSegment(
    val id: String? = null,
    val order: Int? = null,
    val type: String? = null,
    val text: String? = null,
    val startMs: Int? = null,
    val endMs: Int? = null,
    val metadata: Map<String, Any>? = null
)
