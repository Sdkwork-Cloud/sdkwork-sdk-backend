package com.sdkwork.backend

data class OrderShipVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val success: Boolean? = null,
    val message: String? = null,
    val operationTime: String? = null,
    val orderId: Int? = null,
    val shippingCompany: String? = null,
    val trackingNumber: String? = null,
    val shipTime: String? = null,
    val estimatedArrivalTime: String? = null
)
