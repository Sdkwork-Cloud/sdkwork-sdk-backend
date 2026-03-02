package types

// 退款记录VO，记录所有退款交易信息，支持多种退款场景
type PlusRefundVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	OrderId int `json:"orderId"`
	PaymentId int `json:"paymentId"`
	OutRefundNo string `json:"outRefundNo"`
	OutTradeNo string `json:"outTradeNo"`
	RefundId string `json:"refundId"`
	Amount float64 `json:"amount"`
	Type string `json:"type"`
	Status string `json:"status"`
	ApplyTime string `json:"applyTime"`
	CompleteTime string `json:"completeTime"`
	Remark string `json:"remark"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
}
