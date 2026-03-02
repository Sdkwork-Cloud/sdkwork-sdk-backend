package types

// 订单完成操作VO
type OrderCompleteVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Success bool `json:"success"`
	Message string `json:"message"`
	OperationTime string `json:"operationTime"`
	OrderId int `json:"orderId"`
	CompleteTime string `json:"completeTime"`
	Reviewed bool `json:"reviewed"`
	PointsEarned int `json:"pointsEarned"`
}
