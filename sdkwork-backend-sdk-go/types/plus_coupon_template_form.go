package types

// Coupon template creation form
type PlusCouponTemplateForm struct {
	Name string `json:"name"`
	TemplateCode string `json:"templateCode"`
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
	ValidityType string `json:"validityType"`
	ValidityDays int `json:"validityDays"`
	CanShare bool `json:"canShare"`
	ScopeType string `json:"scopeType"`
	ScopeValue string `json:"scopeValue"`
}
