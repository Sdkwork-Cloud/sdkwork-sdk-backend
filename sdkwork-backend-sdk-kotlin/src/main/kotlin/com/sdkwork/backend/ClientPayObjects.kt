package com.sdkwork.backend

data class ClientPayObjects(
    val wechat: WechatPayObject? = null,
    val alipay: AlipayObject? = null,
    val applePay: ApplePayObject? = null,
    val paypal: PaypalObject? = null,
    val stripe: StripeObject? = null,
    val unionPay: UnionPayObject? = null
)
