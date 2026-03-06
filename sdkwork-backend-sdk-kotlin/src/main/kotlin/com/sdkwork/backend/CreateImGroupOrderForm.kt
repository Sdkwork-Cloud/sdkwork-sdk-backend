package com.sdkwork.backend

data class CreateImGroupOrderForm(
    val items: List<OrderContentItem>? = null,
    val expireTime: String? = null
)
