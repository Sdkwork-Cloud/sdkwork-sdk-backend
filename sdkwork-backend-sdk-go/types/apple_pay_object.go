package types

// Apple Pay支付创建订单返回对象
type ApplePayObject struct {
	PaymentData string `json:"paymentData"`
	MerchantId string `json:"merchantId"`
	TransactionId string `json:"transactionId"`
	DisplayName string `json:"displayName"`
	Network string `json:"network"`
	Type string `json:"type"`
	Amount string `json:"amount"`
	CurrencyCode string `json:"currencyCode"`
}
