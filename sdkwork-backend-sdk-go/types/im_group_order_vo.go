package types

// IM群订单VO
type ImGroupOrderVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	OrderId int `json:"orderId"`
	OrderSn string `json:"orderSn"`
	Success bool `json:"success"`
	Message string `json:"message"`
}
