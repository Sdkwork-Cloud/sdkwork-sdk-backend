package com.sdkwork.backend

data class CartItem(
    val id: Int? = null,
    val sku: PlusSku? = null,
    val quantity: Int? = null,
    val unitPrice: Double? = null,
    val totalPrice: Double? = null,
    val selected: Boolean? = null
)
