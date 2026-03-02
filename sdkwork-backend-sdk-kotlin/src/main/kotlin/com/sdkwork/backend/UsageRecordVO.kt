package com.sdkwork.backend

data class UsageRecordVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val userId: Int? = null,
    val requestId: String? = null,
    val modelName: String? = null,
    val channel: String? = null,
    val usageType: String? = null,
    val billingType: String? = null,
    val promptTokens: Int? = null,
    val completionTokens: Int? = null,
    val cachedTokens: Int? = null,
    val totalTokens: Int? = null,
    val callCount: Int? = null,
    val processingTime: Int? = null,
    val imageCount: Int? = null,
    val imageSize: String? = null,
    val videoDuration: Int? = null,
    val audioDuration: Int? = null,
    val cost: Double? = null,
    val currencyCode: String? = null,
    val status: String? = null,
    val requestTime: String? = null,
    val responseTime: String? = null,
    val promptId: Int? = null,
    val toolId: Int? = null
)
