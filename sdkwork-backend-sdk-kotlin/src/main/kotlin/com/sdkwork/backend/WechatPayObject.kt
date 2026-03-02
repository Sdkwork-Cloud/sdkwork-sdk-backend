package com.sdkwork.backend

data class WechatPayObject(
    val prepayId: String? = null,
    val mwebUrl: String? = null,
    val codeUrl: String? = null,
    val timeStamp: String? = null,
    val nonceStr: String? = null,
    val signType: String? = null,
    val paySign: String? = null,
    val outTradeNo: String? = null,
    val tradeType: String? = null
)
