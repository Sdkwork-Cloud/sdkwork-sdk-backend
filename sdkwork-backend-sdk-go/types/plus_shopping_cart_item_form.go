package types

// Shopping cart item creation form
type PlusShoppingCartItemForm struct {
	CartId int `json:"cartId"`
	CartGroupUuid string `json:"cartGroupUuid"`
	ProductId int `json:"productId"`
	SkuId int `json:"skuId"`
	Quantity int `json:"quantity"`
	Price float64 `json:"price"`
	Selected bool `json:"selected"`
}
