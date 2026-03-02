package types

// 支付记录VO，记录所有支付交易信息
type PlusPaymentVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
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
