package com.sdkwork.backend

data class ApplePayObject(
    val paymentData: String? = null,
    val merchantId: String? = null,
    val transactionId: String? = null,
    val displayName: String? = null,
    val network: String? = null,
    val type: String? = null,
    val amount: String? = null,
    val currencyCode: String? = null
)
