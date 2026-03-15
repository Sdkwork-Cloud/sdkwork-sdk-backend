package com.sdkwork.backend

data class GenerationContext(
    val generationId: Int? = null,
    val generationType: String? = null,
    val generationStatus: String? = null,
    val channel: String? = null,
    val requestId: String? = null,
    val channelTaskId: String? = null,
    val routingStrategy: String? = null,
    val routingProduct: String? = null,
    val routingProvider: String? = null
)
