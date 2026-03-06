package com.sdkwork.backend

data class CreatePointsOrderForm(
    val items: List<OrderContentItem>? = null,
    val pointsAmount: Int? = null,
    val expireTime: String? = null
)
