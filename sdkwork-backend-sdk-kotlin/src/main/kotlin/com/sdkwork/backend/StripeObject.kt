package com.sdkwork.backend

data class StripeObject(
    val sessionId: String? = null,
    val paymentUrl: String? = null,
    val clientSecret: String? = null,
    val paymentIntentId: String? = null,
    val publishableKey: String? = null,
    val returnUrl: String? = null,
    val amount: String? = null,
    val currency: String? = null
)
