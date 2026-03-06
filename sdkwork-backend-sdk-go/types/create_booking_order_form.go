package types

// Create booking order form
type CreateBookingOrderForm struct {
	Items []OrderContentItem `json:"items"`
	ExpireTime string `json:"expireTime"`
}
