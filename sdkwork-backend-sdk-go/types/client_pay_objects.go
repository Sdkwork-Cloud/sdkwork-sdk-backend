package types

// Client Payment Objects Container
type ClientPayObjects struct {
	Wechat WechatPayObject `json:"wechat"`
	Alipay AlipayObject `json:"alipay"`
	ApplePay ApplePayObject `json:"applePay"`
	Paypal PaypalObject `json:"paypal"`
	Stripe StripeObject `json:"stripe"`
	UnionPay UnionPayObject `json:"unionPay"`
}
