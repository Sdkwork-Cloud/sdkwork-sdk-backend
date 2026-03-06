package types

// 优惠券模板VO，定义优惠券属性
type PlusCouponVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
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
