package com.sdkwork.backend

data class VirtualOrderVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val orderId: Int? = null,
    val orderSn: String? = null,
    val success: Boolean? = null,
    val message: String? = null
)
