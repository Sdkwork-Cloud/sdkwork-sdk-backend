package com.sdkwork.backend

data class PlusCouponForm(
    val name: String? = null,
    val type: String? = null,
    val description: String? = null,
    val amount: Int? = null,
    val discount: Double? = null,
    val minConsume: Int? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val total: Int? = null,
    val getLimit: Int? = null,
    val status: String? = null
)
