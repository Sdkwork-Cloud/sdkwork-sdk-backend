package types

// 积分充值订单VO
type PointsOrderVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	OrderId int `json:"orderId"`
	OrderSn string `json:"orderSn"`
	Success bool `json:"success"`
	Message string `json:"message"`
}
