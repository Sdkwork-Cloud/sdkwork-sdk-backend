package types

// Refund form
type PlusRefundForm struct {
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
