package com.sdkwork.backend

data class OrderCancelVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val success: Boolean? = null,
    val message: String? = null,
    val operationTime: String? = null,
    val orderId: Int? = null,
    val cancelReason: String? = null,
    val refundable: Boolean? = null,
    val refundAmount: String? = null,
    val cancelTime: String? = null
)
