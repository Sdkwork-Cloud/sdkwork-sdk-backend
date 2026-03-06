package com.sdkwork.backend

data class OrderContentItem(
    val id: Int? = null,
    val productId: Int? = null,
    val skuId: Int? = null,
    val name: String? = null,
    val type: String? = null,
    val quantity: Int? = null,
    val unitPrice: Double? = null,
    val totalPrice: Double? = null
)
