package types

// Order item creation form
type PlusOrderItemForm struct {
	OrderId int `json:"orderId"`
	ProductType string `json:"productType"`
	ProductId int `json:"productId"`
	SkuId int `json:"skuId"`
	Quantity int `json:"quantity"`
	UnitPrice float64 `json:"unitPrice"`
	TotalAmount float64 `json:"totalAmount"`
	ExpireTime string `json:"expireTime"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
}
