package com.sdkwork.backend

data class CartGroup(
    val uuid: String? = null,
    val name: String? = null,
    val items: List<CartItem>? = null,
    val totalQuantity: Int? = null,
    val totalPrice: Double? = null
)
