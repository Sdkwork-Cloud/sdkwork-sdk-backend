package com.sdkwork.backend

data class OrderCompleteVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val success: Boolean? = null,
    val message: String? = null,
    val operationTime: String? = null,
    val orderId: Int? = null,
    val completeTime: String? = null,
    val reviewed: Boolean? = null,
    val pointsEarned: Int? = null
)
