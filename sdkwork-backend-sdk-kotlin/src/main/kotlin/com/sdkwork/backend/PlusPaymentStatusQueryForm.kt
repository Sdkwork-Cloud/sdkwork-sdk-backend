package com.sdkwork.backend

data class PlusPaymentStatusQueryForm(
    val outTradeNo: String? = null,
    val provider: String? = null,
    val amount: Double? = null
)
