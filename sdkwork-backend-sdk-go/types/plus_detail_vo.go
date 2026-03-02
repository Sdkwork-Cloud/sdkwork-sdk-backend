package types

// Detail Value Object (Generic detailed content for various entities)
type PlusDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	Content DetailContent `json:"content"`
	ProductId int `json:"productId"`
	SkuId int `json:"skuId"`
}
