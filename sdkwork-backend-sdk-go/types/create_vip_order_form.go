package types

// Create VIP order form
type CreateVipOrderForm struct {
	Items []OrderContentItem `json:"items"`
	ExpireTime string `json:"expireTime"`
}
