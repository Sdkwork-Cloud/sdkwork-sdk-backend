package types

// SKU creation form
type PlusSkuForm struct {
	Title string `json:"title"`
	ProductId int `json:"productId"`
	SkuCode string `json:"skuCode"`
	Images ImageMediaResourceList `json:"images"`
	Resources AssetMediaResourceList `json:"resources"`
	Price float64 `json:"price"`
	OriginalPrice float64 `json:"originalPrice"`
	Stock int `json:"stock"`
	SalesCount int `json:"salesCount"`
	Status string `json:"status"`
	CategoryId int `json:"categoryId"`
	Attributes []AttributeItem `json:"attributes"`
}
