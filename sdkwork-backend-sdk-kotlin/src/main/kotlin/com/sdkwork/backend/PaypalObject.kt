package com.sdkwork.backend

data class PaypalObject(
    val token: String? = null,
    val payerId: String? = null,
    val paymentUrl: String? = null,
    val invoice: String? = null,
    val amount: String? = null,
    val currency: String? = null,
    val paymentStatus: String? = null,
    val transactionId: String? = null,
    val returnUrl: String? = null,
    val cancelUrl: String? = null
)
