package types

// Coupon template creation form
type PlusCouponForm struct {
	Name string `json:"name"`
	RedeemCode string `json:"redeemCode"`
	PointCost int `json:"pointCost"`
	Type string `json:"type"`
	Description string `json:"description"`
	Amount int `json:"amount"`
	Discount float64 `json:"discount"`
	MinConsume int `json:"minConsume"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	Total int `json:"total"`
	GetLimit int `json:"getLimit"`
	Status string `json:"status"`
	ScopeType string `json:"scopeType"`
	ScopeValue string `json:"scopeValue"`
}
