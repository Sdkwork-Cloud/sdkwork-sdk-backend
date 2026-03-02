package com.sdkwork.backend

data class OrderCloseVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val success: Boolean? = null,
    val message: String? = null,
    val operationTime: String? = null,
    val orderId: Int? = null,
    val closeReason: String? = null,
    val closeTime: String? = null,
    val reopenable: Boolean? = null
)
