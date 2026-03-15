package com.sdkwork.backend

data class PlusPaymentForm(
    val purpose: String? = null,
    val orderId: Int? = null,
    val transactionId: String? = null,
    val outTradeNo: String? = null,
    val channel: String? = null,
    val provider: String? = null,
    val status: String? = null,
    val amount: Double? = null,
    val successTime: String? = null,
    val remark: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val productType: String? = null
)
