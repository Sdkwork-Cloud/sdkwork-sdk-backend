package types

// Chat message creation form
type PlusChatMessageForm struct {
	Content MessageBody `json:"content"`
	Role string `json:"role"`
	Type string `json:"type"`
	Status string `json:"status"`
	ConversationId int `json:"conversationId"`
	UserId int `json:"userId"`
	ParentMessageId int `json:"parentMessageId"`
	Metadata map[string]interface{} `json:"metadata"`
	TokenCount int `json:"tokenCount"`
	ProcessingTime int `json:"processingTime"`
	IsError bool `json:"isError"`
	ErrorCode string `json:"errorCode"`
	ErrorMessage string `json:"errorMessage"`
	ModelId int `json:"modelId"`
	Model string `json:"model"`
	Temperature float64 `json:"temperature"`
	UsedRag bool `json:"usedRag"`
	ChatOptions PlusChatOptions `json:"chatOptions"`
}
