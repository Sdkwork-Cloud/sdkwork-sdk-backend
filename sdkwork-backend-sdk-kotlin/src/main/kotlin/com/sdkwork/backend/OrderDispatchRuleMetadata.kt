package com.sdkwork.backend

data class OrderDispatchRuleMetadata(
    val ratingConcurrentLimits: Map<String, Int>? = null,
    val allowedRatingLevels: List<String>? = null
)
