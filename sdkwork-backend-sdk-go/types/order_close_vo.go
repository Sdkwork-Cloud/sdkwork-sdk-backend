package types

// 订单关闭操作VO
type OrderCloseVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Success bool `json:"success"`
	Message string `json:"message"`
	OperationTime string `json:"operationTime"`
	OrderId int `json:"orderId"`
	CloseReason string `json:"closeReason"`
	CloseTime string `json:"closeTime"`
	Reopenable bool `json:"reopenable"`
}
