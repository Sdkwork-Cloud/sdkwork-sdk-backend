package com.sdkwork.backend

data class PlusSystemInvoiceApplyForm(
    val title: String? = null,
    val taxId: String? = null,
    val type: String? = null,
    val amount: Double? = null,
    val content: String? = null,
    val email: String? = null,
    val address: String? = null
)
