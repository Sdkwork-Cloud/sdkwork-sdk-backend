package types

// 订单内容项
type OrderContentItem struct {
	Id int `json:"id"`
	ProductId int `json:"productId"`
	SkuId int `json:"skuId"`
	Name string `json:"name"`
	Type string `json:"type"`
	Quantity int `json:"quantity"`
	UnitPrice float64 `json:"unitPrice"`
	TotalPrice float64 `json:"totalPrice"`
}
