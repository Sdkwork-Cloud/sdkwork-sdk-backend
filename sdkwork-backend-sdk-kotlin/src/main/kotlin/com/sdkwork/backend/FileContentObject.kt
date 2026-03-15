package com.sdkwork.backend

data class FileContentObject(
    val schemaVersion: String? = null,
    val source: String? = null,
    val text: String? = null,
    val contents: Map<String, String>? = null,
    val metadata: Map<String, Any>? = null,
    val generation: GenerationContext? = null,
    val segments: List<ContentSegment>? = null,
    val references: List<AssetReference>? = null
)
