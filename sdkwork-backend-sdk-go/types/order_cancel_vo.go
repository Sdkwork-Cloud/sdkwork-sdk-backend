package types

// 订单取消操作VO
type OrderCancelVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Success bool `json:"success"`
	Message string `json:"message"`
	OperationTime string `json:"operationTime"`
	OrderId int `json:"orderId"`
	CancelReason string `json:"cancelReason"`
	Refundable bool `json:"refundable"`
	RefundAmount string `json:"refundAmount"`
	CancelTime string `json:"cancelTime"`
}
