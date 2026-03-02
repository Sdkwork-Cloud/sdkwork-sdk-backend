package types


type PlusSku struct {
	TenantId int `json:"tenantId"`
	OrganizationId int `json:"organizationId"`
	DataScope string `json:"dataScope"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	V int `json:"v"`
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
