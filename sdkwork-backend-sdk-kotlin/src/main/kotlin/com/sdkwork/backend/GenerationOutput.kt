package com.sdkwork.backend

data class GenerationOutput(
    val resources: List<AssetMediaResource>? = null,
    val primaryUrl: String? = null,
    val urls: List<String>? = null,
    val durationMs: Int? = null,
    val tokenUsage: Int? = null,
    val cost: Double? = null,
    val modelVersion: String? = null,
    val seed: Int? = null,
    val metadata: Map<String, Any>? = null,
    val createdAt: String? = null,
    val resourceCount: Int? = null,
    val primaryResource: AssetMediaResource? = null
)
