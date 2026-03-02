package com.sdkwork.backend

data class CartGroupList(
    val groups: List<CartGroup>? = null,
    val totalQuantity: Int? = null,
    val totalPrice: Double? = null,
    val selectedQuantity: Int? = null,
    val selectedPrice: Double? = null,
    val allItems: List<CartItem>? = null
)
