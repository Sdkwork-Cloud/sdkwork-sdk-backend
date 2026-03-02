package com.sdkwork.backend

data class PlusPaymentCancelForm(
    val paymentId: Int? = null,
    val outTradeNo: String? = null,
    val amount: Double? = null,
    val reason: String? = null
)
