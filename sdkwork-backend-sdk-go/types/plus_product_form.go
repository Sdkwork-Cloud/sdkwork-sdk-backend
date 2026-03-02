package types

// Product creation form
type PlusProductForm struct {
	Title string `json:"title"`
	Code string `json:"code"`
	Subtitle string `json:"subtitle"`
	Resources AssetMediaResourceList `json:"resources"`
	Price float64 `json:"price"`
	OriginalPrice float64 `json:"originalPrice"`
	Stock int `json:"stock"`
	SalesCount int `json:"salesCount"`
	Status string `json:"status"`
	OnSaleAt string `json:"onSaleAt"`
	Description string `json:"description"`
	CategoryId int `json:"categoryId"`
	BaseAttributes Attributes `json:"baseAttributes"`
	SpecAttributes Attributes `json:"specAttributes"`
}
