package types

// Shopping cart item information
type CartItem struct {
	Id int `json:"id"`
	Sku PlusSku `json:"sku"`
	Quantity int `json:"quantity"`
	UnitPrice float64 `json:"unitPrice"`
	TotalPrice float64 `json:"totalPrice"`
	Selected bool `json:"selected"`
}
