package com.sdkwork.backend

data class PlusOrderVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val orderType: String? = null,
    val userId: Int? = null,
    val orderSn: String? = null,
    val transactionId: String? = null,
    val outTradeNo: String? = null,
    val totalAmount: Double? = null,
    val paidAmount: Double? = null,
    val paidPointsAmount: Int? = null,
    val status: String? = null,
    val payTime: String? = null,
    val expireTime: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val payObjects: ClientPayObjects? = null
)
