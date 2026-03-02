package types

// Product SKU Value Object
type PlusSkuVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	ProductId int `json:"productId"`
	SkuCode string `json:"skuCode"`
	Name string `json:"name"`
	Title string `json:"title"`
	Price float64 `json:"price"`
	OriginalPrice float64 `json:"originalPrice"`
	Stock int `json:"stock"`
	Sales int `json:"sales"`
	Status int `json:"status"`
	Image string `json:"image"`
	Specs string `json:"specs"`
}
