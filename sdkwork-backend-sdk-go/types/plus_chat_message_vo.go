package types

// Chat Message Value Object - Represents a message in an AI conversation (user input or AI response)
type PlusChatMessageVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Body MessageBody `json:"body"`
	Role string `json:"role"`
	Type string `json:"type"`
	Status string `json:"status"`
	ConversationId int `json:"conversationId"`
	ConversationUuid string `json:"conversationUuid"`
	UserId int `json:"userId"`
	SenderId int `json:"senderId"`
	Sender Participant `json:"sender"`
	Receiver Participant `json:"receiver"`
	ReceiverId int `json:"receiverId"`
	GroupId int `json:"groupId"`
	ParentMessageId int `json:"parentMessageId"`
	Children []PlusChatMessageVO `json:"children"`
	Metadata map[string]interface{} `json:"metadata"`
	TokenCount int `json:"tokenCount"`
	SendAt string `json:"sendAt"`
	ReceiveAt string `json:"receiveAt"`
	ReadAt string `json:"readAt"`
	ProcessingTime int `json:"processingTime"`
	IsError bool `json:"isError"`
	ErrorCode string `json:"errorCode"`
	ErrorMessage string `json:"errorMessage"`
	ModelId int `json:"modelId"`
	Model string `json:"model"`
	Temperature float64 `json:"temperature"`
	UsedRag bool `json:"usedRag"`
	ChatOptions PlusChatOptions `json:"chatOptions"`
	ChannelId string `json:"channelId"`
	AgentId int `json:"agentId"`
	KnowledgeBaseId int `json:"knowledgeBaseId"`
	DatasourceId int `json:"datasourceId"`
	AgentType string `json:"agentType"`
	AgentBizType string `json:"agentBizType"`
	ChannelMsgId string `json:"channelMsgId"`
	ChannelClientMsgId string `json:"channelClientMsgId"`
	ChannelMsgSeq int `json:"channelMsgSeq"`
	ConversationType string `json:"conversationType"`
	FeedbackMetadata FeedbackMetadata `json:"feedbackMetadata"`
}
