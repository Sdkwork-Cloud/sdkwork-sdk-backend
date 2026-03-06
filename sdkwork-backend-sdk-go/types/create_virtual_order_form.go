package types

// Create virtual order form
type CreateVirtualOrderForm struct {
	Items []OrderContentItem `json:"items"`
	ExpireTime string `json:"expireTime"`
}
