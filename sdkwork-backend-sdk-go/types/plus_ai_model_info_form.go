package types

// AI model information creation form
type PlusAiModelInfoForm struct {
	ObjectId string `json:"objectId"`
	Model string `json:"model"`
	ModelId string `json:"modelId"`
	ModelKey string `json:"modelKey"`
	VendorModel string `json:"vendorModel"`
	Name string `json:"name"`
	Description string `json:"description"`
	Channel string `json:"channel"`
	Vendor string `json:"vendor"`
	ModelVersion string `json:"modelVersion"`
	Family string `json:"family"`
	OpenSource bool `json:"openSource"`
	ApiEndpoint string `json:"apiEndpoint"`
	ModelType string `json:"modelType"`
	PricingType string `json:"pricingType"`
	LifecycleStage string `json:"lifecycleStage"`
	ReleaseDate string `json:"releaseDate"`
	DeprecatedAt string `json:"deprecatedAt"`
	ContextTokens int `json:"contextTokens"`
	MaxInputTokens int `json:"maxInputTokens"`
	MaxOutputTokens int `json:"maxOutputTokens"`
	SupportReasoning bool `json:"supportReasoning"`
	SupportMultimodal bool `json:"supportMultimodal"`
	SupportFunctionCall bool `json:"supportFunctionCall"`
	SupportStructuredOutput bool `json:"supportStructuredOutput"`
	SupportRealtime bool `json:"supportRealtime"`
	SupportFineTuning bool `json:"supportFineTuning"`
	PopularityScore int `json:"popularityScore"`
	OwnedBy string `json:"ownedBy"`
	Scenes SceneContent `json:"scenes"`
	TokenLimit ModelLimitInfo `json:"tokenLimit"`
	FunctionInfo ModelFunctionInfo `json:"functionInfo"`
	PriceInfo ModelPrice `json:"priceInfo"`
	Metadata ModelMetadata `json:"metadata"`
	ProductSupportInfo map[string]interface{} `json:"productSupportInfo"`
	SupportedVoices string `json:"supportedVoices"`
	DefaultTemperature float64 `json:"defaultTemperature"`
	DefaultTopP float64 `json:"defaultTopP"`
	DefaultFrequencyPenalty float64 `json:"defaultFrequencyPenalty"`
	DefaultPresencePenalty float64 `json:"defaultPresencePenalty"`
	Status string `json:"status"`
	UsageCount int `json:"usageCount"`
	TotalTokens int `json:"totalTokens"`
	AvgResponseTime int `json:"avgResponseTime"`
	Tags TagsContent `json:"tags"`
	ConfigParams string `json:"configParams"`
}
