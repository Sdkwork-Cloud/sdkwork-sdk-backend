package com.sdkwork.backend

data class CreateVipOrderForm(
    val items: List<OrderContentItem>? = null,
    val expireTime: String? = null
)
