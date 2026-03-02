package com.sdkwork.backend

data class ModelPrice(
    val unit: String? = null,
    val items: List<ModelPriceItem>? = null,
    val currency: String? = null
)
