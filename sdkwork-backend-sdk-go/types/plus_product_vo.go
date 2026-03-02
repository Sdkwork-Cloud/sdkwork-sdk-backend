package types

// Product Value Object - Represents a product in the system with basic information, pricing, inventory, and relationships
type PlusProductVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	UserId int `json:"userId"`
	Title string `json:"title"`
	Code string `json:"code"`
	Subtitle string `json:"subtitle"`
	Resources AssetMediaResourceList `json:"resources"`
	Tags TagsContent `json:"tags"`
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
