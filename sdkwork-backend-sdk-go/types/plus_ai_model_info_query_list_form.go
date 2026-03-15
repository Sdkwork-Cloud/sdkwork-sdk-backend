package types

// AI model list query form
type PlusAiModelInfoQueryListForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	Keyword string `json:"keyword"`
	Channel string `json:"channel"`
	ModelType string `json:"modelType"`
	Status string `json:"status"`
	Family string `json:"family"`
	Vendor string `json:"vendor"`
	OpenSource bool `json:"openSource"`
	PricingType string `json:"pricingType"`
	LifecycleStage string `json:"lifecycleStage"`
	MinContextTokens int `json:"minContextTokens"`
	SupportReasoning bool `json:"supportReasoning"`
	SupportMultimodal bool `json:"supportMultimodal"`
	SupportFunctionCall bool `json:"supportFunctionCall"`
	SupportRealtime bool `json:"supportRealtime"`
	SupportFineTuning bool `json:"supportFineTuning"`
}
