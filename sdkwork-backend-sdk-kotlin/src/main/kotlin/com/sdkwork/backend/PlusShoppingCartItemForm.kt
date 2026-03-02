package com.sdkwork.backend

data class PlusShoppingCartItemForm(
    val cartId: Int? = null,
    val cartGroupUuid: String? = null,
    val productId: Int? = null,
    val skuId: Int? = null,
    val quantity: Int? = null,
    val price: Double? = null,
    val selected: Boolean? = null
)
