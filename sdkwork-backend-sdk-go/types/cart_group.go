package types

// 购物车分组信息
type CartGroup struct {
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	Items []CartItem `json:"items"`
	TotalQuantity int `json:"totalQuantity"`
	TotalPrice float64 `json:"totalPrice"`
}
