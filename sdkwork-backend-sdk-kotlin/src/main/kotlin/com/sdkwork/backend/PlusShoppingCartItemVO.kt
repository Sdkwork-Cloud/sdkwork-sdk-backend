package com.sdkwork.backend

data class PlusShoppingCartItemVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val cartId: Int? = null,
    val cartGroupUuid: String? = null,
    val productId: Int? = null,
    val skuId: Int? = null,
    val quantity: Int? = null,
    val price: Double? = null,
    val selected: Boolean? = null
)
