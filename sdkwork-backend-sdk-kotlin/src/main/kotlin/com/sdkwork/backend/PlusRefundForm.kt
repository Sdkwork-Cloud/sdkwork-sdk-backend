package com.sdkwork.backend

data class PlusRefundForm(
    val orderId: Int? = null,
    val paymentId: Int? = null,
    val outRefundNo: String? = null,
    val outTradeNo: String? = null,
    val refundId: String? = null,
    val amount: Double? = null,
    val type: String? = null,
    val status: String? = null,
    val applyTime: String? = null,
    val completeTime: String? = null,
    val remark: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null
)
