package com.sdkwork.backend

data class PlusMallHomeVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val gridCategories: List<PlusCategoryVO>? = null,
    val products: List<PlusProductVO>? = null,
    val banners: List<PlusProductVO>? = null,
    val hotProducts: List<PlusProductVO>? = null,
    val newProducts: List<PlusProductVO>? = null,
    val recommendProducts: List<PlusProductVO>? = null,
    val hotSalesProducts: List<PlusProductVO>? = null
)
