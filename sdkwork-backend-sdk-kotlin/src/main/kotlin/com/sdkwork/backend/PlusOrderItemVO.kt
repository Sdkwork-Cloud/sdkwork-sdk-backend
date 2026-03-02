package com.sdkwork.backend

data class PlusOrderItemVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val orderId: Int? = null,
    val productType: String? = null,
    val productId: Int? = null,
    val skuId: Int? = null,
    val quantity: Int? = null,
    val unitPrice: Double? = null,
    val totalAmount: Double? = null,
    val expireTime: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null
)
