package types

// Create goods order form
type CreateGoodsOrderForm struct {
	Items []CartItem `json:"items"`
	ExpireTime string `json:"expireTime"`
}
