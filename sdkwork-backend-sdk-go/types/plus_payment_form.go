package types

// Payment creation form
type PlusPaymentForm struct {
	Purpose string `json:"purpose"`
	OrderId int `json:"orderId"`
	TransactionId string `json:"transactionId"`
	OutTradeNo string `json:"outTradeNo"`
	Channel string `json:"channel"`
	Status string `json:"status"`
	Amount float64 `json:"amount"`
	SuccessTime string `json:"successTime"`
	Remark string `json:"remark"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	ProductType string `json:"productType"`
	Provider string `json:"provider"`
}
