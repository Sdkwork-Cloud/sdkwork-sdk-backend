package types

// 购物车条目VO
type PlusShoppingCartItemVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	CartId int `json:"cartId"`
	CartGroupUuid string `json:"cartGroupUuid"`
	ProductId int `json:"productId"`
	SkuId int `json:"skuId"`
	Quantity int `json:"quantity"`
	Price float64 `json:"price"`
	Selected bool `json:"selected"`
}
