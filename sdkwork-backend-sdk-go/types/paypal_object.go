package types

// PayPal支付创建订单返回对象
type PaypalObject struct {
	Token string `json:"token"`
	PayerId string `json:"payerId"`
	PaymentUrl string `json:"paymentUrl"`
	Invoice string `json:"invoice"`
	Amount string `json:"amount"`
	Currency string `json:"currency"`
	PaymentStatus string `json:"paymentStatus"`
	TransactionId string `json:"transactionId"`
	ReturnUrl string `json:"returnUrl"`
	CancelUrl string `json:"cancelUrl"`
}
