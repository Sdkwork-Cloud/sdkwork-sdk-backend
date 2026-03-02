package com.sdkwork.backend

data class PlusProductVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val userId: Int? = null,
    val title: String? = null,
    val code: String? = null,
    val subtitle: String? = null,
    val resources: AssetMediaResourceList? = null,
    val tags: TagsContent? = null,
    val price: Double? = null,
    val originalPrice: Double? = null,
    val stock: Int? = null,
    val salesCount: Int? = null,
    val status: String? = null,
    val onSaleAt: String? = null,
    val description: String? = null,
    val categoryId: Int? = null,
    val baseAttributes: Attributes? = null,
    val specAttributes: Attributes? = null
)
