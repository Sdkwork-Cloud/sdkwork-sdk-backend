package types

// Shopping cart group information
type CartGroup struct {
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	Items []CartItem `json:"items"`
	TotalQuantity int `json:"totalQuantity"`
	TotalPrice float64 `json:"totalPrice"`
}
