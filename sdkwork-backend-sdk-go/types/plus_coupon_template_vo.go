package types

// Coupon Template Value Object
type PlusCouponTemplateVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
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
