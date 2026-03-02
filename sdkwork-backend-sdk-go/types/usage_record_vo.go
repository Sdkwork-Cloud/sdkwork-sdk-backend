package types

// AI模型使用记录VO，用于记录各种AI模型调用的使用情况
type UsageRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserId int `json:"userId"`
	RequestId string `json:"requestId"`
	ModelName string `json:"modelName"`
	Channel string `json:"channel"`
	UsageType string `json:"usageType"`
	BillingType string `json:"billingType"`
	PromptTokens int `json:"promptTokens"`
	CompletionTokens int `json:"completionTokens"`
	CachedTokens int `json:"cachedTokens"`
	TotalTokens int `json:"totalTokens"`
	CallCount int `json:"callCount"`
	ProcessingTime int `json:"processingTime"`
	ImageCount int `json:"imageCount"`
	ImageSize string `json:"imageSize"`
	VideoDuration int `json:"videoDuration"`
	AudioDuration int `json:"audioDuration"`
	Cost float64 `json:"cost"`
	CurrencyCode string `json:"currencyCode"`
	Status string `json:"status"`
	RequestTime string `json:"requestTime"`
	ResponseTime string `json:"responseTime"`
	PromptId int `json:"promptId"`
	ToolId int `json:"toolId"`
}
