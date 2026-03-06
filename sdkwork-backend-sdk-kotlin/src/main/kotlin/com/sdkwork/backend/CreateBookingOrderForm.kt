package com.sdkwork.backend

data class CreateBookingOrderForm(
    val items: List<OrderContentItem>? = null,
    val expireTime: String? = null
)
