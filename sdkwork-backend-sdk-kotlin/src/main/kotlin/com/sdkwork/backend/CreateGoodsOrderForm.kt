package com.sdkwork.backend

data class CreateGoodsOrderForm(
    val items: List<CartItem>? = null,
    val expireTime: String? = null
)
