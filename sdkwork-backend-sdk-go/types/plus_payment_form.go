package types

// Payment creation form
type PlusPaymentForm struct {
	Purpose string `json:"purpose"`
	OrderId int `json:"orderId"`
	TransactionId string `json:"transactionId"`
	OutTradeNo string `json:"outTradeNo"`
	Channel string `json:"channel"`
	Provider string `json:"provider"`
	Status string `json:"status"`
	Amount float64 `json:"amount"`
	SuccessTime string `json:"successTime"`
	Remark string `json:"remark"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	ProductType string `json:"productType"`
}
