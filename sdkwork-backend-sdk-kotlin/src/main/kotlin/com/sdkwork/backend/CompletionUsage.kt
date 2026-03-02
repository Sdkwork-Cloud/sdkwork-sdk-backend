package com.sdkwork.backend

data class CompletionUsage(
    val promptTokens: Int? = null,
    val completionTokens: Int? = null,
    val totalTokens: Int? = null,
    val promptCacheHitTokens: Int? = null,
    val promptCacheMissTokens: Int? = null,
    val promptTokensDetails: PromptTokensDetails? = null,
    val completionTokensDetails: CompletionTokensDetails? = null
)
