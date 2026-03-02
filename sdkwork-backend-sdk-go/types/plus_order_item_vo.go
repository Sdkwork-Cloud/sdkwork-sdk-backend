package types

// 订单项Value Object，支持多种商品类型：1.实物商品 2.虚拟商品(如电子书、课程等) 3.会员服务
type PlusOrderItemVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
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
