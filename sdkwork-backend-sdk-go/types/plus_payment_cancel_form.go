package types

// Payment cancel form
type PlusPaymentCancelForm struct {
	PaymentId int `json:"paymentId"`
	OutTradeNo string `json:"outTradeNo"`
	Amount float64 `json:"amount"`
	Reason string `json:"reason"`
}
