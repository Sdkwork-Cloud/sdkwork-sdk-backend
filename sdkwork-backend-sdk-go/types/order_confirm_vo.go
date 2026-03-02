package types

// 订单确认操作VO
type OrderConfirmVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Success bool `json:"success"`
	Message string `json:"message"`
	OperationTime string `json:"operationTime"`
	OrderId int `json:"orderId"`
	ConfirmTime string `json:"confirmTime"`
	EstimatedShipTime string `json:"estimatedShipTime"`
}
