package types

// 实物商品订单VO
type GoodsOrderVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	OrderId int `json:"orderId"`
	OrderSn string `json:"orderSn"`
	Success bool `json:"success"`
	Message string `json:"message"`
}
