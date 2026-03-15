package types

// Shopping cart group list
type CartGroupList struct {
	Groups []CartGroup `json:"groups"`
	TotalQuantity int `json:"totalQuantity"`
	TotalPrice float64 `json:"totalPrice"`
	SelectedQuantity int `json:"selectedQuantity"`
	SelectedPrice float64 `json:"selectedPrice"`
	AllItems []CartItem `json:"allItems"`
}
