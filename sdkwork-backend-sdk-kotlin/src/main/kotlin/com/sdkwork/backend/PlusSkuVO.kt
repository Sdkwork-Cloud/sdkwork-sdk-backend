package com.sdkwork.backend

data class PlusSkuVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val productId: Int? = null,
    val skuCode: String? = null,
    val name: String? = null,
    val title: String? = null,
    val price: Double? = null,
    val originalPrice: Double? = null,
    val stock: Int? = null,
    val sales: Int? = null,
    val status: Int? = null,
    val image: String? = null,
    val specs: String? = null
)
