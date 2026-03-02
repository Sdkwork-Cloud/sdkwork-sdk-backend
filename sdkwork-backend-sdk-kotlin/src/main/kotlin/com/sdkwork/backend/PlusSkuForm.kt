package com.sdkwork.backend

data class PlusSkuForm(
    val title: String? = null,
    val productId: Int? = null,
    val skuCode: String? = null,
    val images: ImageMediaResourceList? = null,
    val resources: AssetMediaResourceList? = null,
    val price: Double? = null,
    val originalPrice: Double? = null,
    val stock: Int? = null,
    val salesCount: Int? = null,
    val status: String? = null,
    val categoryId: Int? = null,
    val attributes: List<AttributeItem>? = null
)
