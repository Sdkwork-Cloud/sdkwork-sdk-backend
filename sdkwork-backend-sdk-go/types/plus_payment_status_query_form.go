package types

// Payment status query form
type PlusPaymentStatusQueryForm struct {
	OutTradeNo string `json:"outTradeNo"`
	Provider string `json:"provider"`
	Amount float64 `json:"amount"`
}
