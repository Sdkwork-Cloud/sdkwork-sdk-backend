package types

// AI model information creation form
type PlusAiModelInfoForm struct {
	ObjectId string `json:"objectId"`
	Model string `json:"model"`
	Name string `json:"name"`
	Description string `json:"description"`
	Channel string `json:"channel"`
	ModelVersion string `json:"modelVersion"`
	Family string `json:"family"`
	ApiEndpoint string `json:"apiEndpoint"`
	ModelType string `json:"modelType"`
	CreatedAt int `json:"createdAt"`
	OwnedBy string `json:"ownedBy"`
	TokenLimit ModelLimitInfo `json:"tokenLimit"`
	PriceInfo ModelPrice `json:"priceInfo"`
	Metadata ModelMetadata `json:"metadata"`
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
