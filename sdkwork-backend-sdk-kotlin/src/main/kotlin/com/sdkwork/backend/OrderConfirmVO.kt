package com.sdkwork.backend

data class OrderConfirmVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val success: Boolean? = null,
    val message: String? = null,
    val operationTime: String? = null,
    val orderId: Int? = null,
    val confirmTime: String? = null,
    val estimatedShipTime: String? = null
)
