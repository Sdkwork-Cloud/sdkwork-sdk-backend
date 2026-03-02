package types

// Mall Home Value Object - Represents the home page data of the mall including various product lists
type PlusMallHomeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	GridCategories []PlusCategoryVO `json:"gridCategories"`
	Products []PlusProductVO `json:"products"`
	Banners []PlusProductVO `json:"banners"`
	HotProducts []PlusProductVO `json:"hotProducts"`
	NewProducts []PlusProductVO `json:"newProducts"`
	RecommendProducts []PlusProductVO `json:"recommendProducts"`
	HotSalesProducts []PlusProductVO `json:"hotSalesProducts"`
}
