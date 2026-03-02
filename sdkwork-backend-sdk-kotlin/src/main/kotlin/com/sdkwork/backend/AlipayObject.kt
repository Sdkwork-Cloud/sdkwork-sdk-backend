package com.sdkwork.backend

data class AlipayObject(
    val payUrl: String? = null,
    val sign: String? = null,
    val outTradeNo: String? = null,
    val tradeNo: String? = null,
    val appId: String? = null,
    val method: String? = null,
    val qrCode: String? = null
)
