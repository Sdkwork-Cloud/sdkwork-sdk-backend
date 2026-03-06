package com.sdkwork.backend

data class CreateVirtualOrderForm(
    val items: List<OrderContentItem>? = null,
    val expireTime: String? = null
)
