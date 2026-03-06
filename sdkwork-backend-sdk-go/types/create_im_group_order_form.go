package types

// Create IM group order form
type CreateImGroupOrderForm struct {
	Items []OrderContentItem `json:"items"`
	ExpireTime string `json:"expireTime"`
}
