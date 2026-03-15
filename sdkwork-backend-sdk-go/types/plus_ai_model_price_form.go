package types

// Model price creation form
type PlusAiModelPriceForm struct {
	ObjectId string `json:"objectId"`
	Model string `json:"model"`
	ModelId int `json:"modelId"`
	Channel string `json:"channel"`
	ModelKey string `json:"modelKey"`
	ProductCode string `json:"productCode"`
	FeatureCode string `json:"featureCode"`
	BillingType string `json:"billingType"`
	PriceItemType string `json:"priceItemType"`
	TierName string `json:"tierName"`
	RulePriority int `json:"rulePriority"`
	Unit string `json:"unit"`
	UnitSize float64 `json:"unitSize"`
	Price float64 `json:"price"`
	InputPrice float64 `json:"inputPrice"`
	BatchInputPrice float64 `json:"batchInputPrice"`
	CachedInputPrice float64 `json:"cachedInputPrice"`
	BatchCachedInputPrice float64 `json:"batchCachedInputPrice"`
	OutputPrice float64 `json:"outputPrice"`
	BatchOutputPrice float64 `json:"batchOutputPrice"`
	Currency string `json:"currency"`
	MinUsage float64 `json:"minUsage"`
	MaxUsage float64 `json:"maxUsage"`
	EffectiveFrom string `json:"effectiveFrom"`
	EffectiveTo string `json:"effectiveTo"`
	DefaultRule bool `json:"defaultRule"`
	Status string `json:"status"`
	Metadata map[string]interface{} `json:"metadata"`
}
