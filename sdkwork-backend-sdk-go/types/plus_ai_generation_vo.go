package types

// AI Generation VO
type PlusAiGenerationVO struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	UserId int `json:"userId"`
	Title string `json:"title"`
	RequestId string `json:"requestId"`
	Type string `json:"type"`
	Model string `json:"model"`
	Channel string `json:"channel"`
	InputParams GenerationInput `json:"inputParams"`
	OutputResult GenerationOutput `json:"outputResult"`
	Status string `json:"status"`
	Progress int `json:"progress"`
	ChannelTaskId string `json:"channelTaskId"`
	ChannelTaskStatus string `json:"channelTaskStatus"`
	Cost float64 `json:"cost"`
	ErrorCode string `json:"errorCode"`
	ErrorMessage string `json:"errorMessage"`
	RetryCount int `json:"retryCount"`
	MaxRetry int `json:"maxRetry"`
	StartedAt string `json:"startedAt"`
	CompletedAt string `json:"completedAt"`
	ConversationId int `json:"conversationId"`
	MessageId int `json:"messageId"`
	ParentId int `json:"parentId"`
	BatchId string `json:"batchId"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
}
