package types

// Stripe支付创建订单返回对象
type StripeObject struct {
	SessionId string `json:"sessionId"`
	PaymentUrl string `json:"paymentUrl"`
	ClientSecret string `json:"clientSecret"`
	PaymentIntentId string `json:"paymentIntentId"`
	PublishableKey string `json:"publishableKey"`
	ReturnUrl string `json:"returnUrl"`
	Amount string `json:"amount"`
	Currency string `json:"currency"`
}
