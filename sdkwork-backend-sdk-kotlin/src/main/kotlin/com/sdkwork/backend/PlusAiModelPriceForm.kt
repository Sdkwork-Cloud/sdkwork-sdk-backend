package com.sdkwork.backend

data class PlusAiModelPriceForm(
    val objectId: String? = null,
    val model: String? = null,
    val unit: String? = null,
    val price: Double? = null,
    val inputPrice: Double? = null,
    val batchInputPrice: Double? = null,
    val cachedInputPrice: Double? = null,
    val batchCachedInputPrice: Double? = null,
    val outputPrice: Double? = null,
    val batchOutputPrice: Double? = null,
    val currency: String? = null
)
