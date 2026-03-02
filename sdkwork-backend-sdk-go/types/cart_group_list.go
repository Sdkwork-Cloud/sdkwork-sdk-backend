package types

// 购物车分组列表
type CartGroupList struct {
	Groups []CartGroup `json:"groups"`
	TotalQuantity int `json:"totalQuantity"`
	TotalPrice float64 `json:"totalPrice"`
	SelectedQuantity int `json:"selectedQuantity"`
	SelectedPrice float64 `json:"selectedPrice"`
	AllItems []CartItem `json:"allItems"`
}
