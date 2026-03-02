package types

// AI Conversation Value Object - Represents a conversation session between a user and an AI agent
type PlusConversationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Title string `json:"title"`
	Type string `json:"type"`
	Description string `json:"description"`
	UserId int `json:"userId"`
	Status string `json:"status"`
	AgentId int `json:"agentId"`
	AgentType string `json:"agentType"`
	AgentBizType string `json:"agentBizType"`
	Scene string `json:"scene"`
	Summary string `json:"summary"`
	LastMessageId int `json:"lastMessageId"`
	MessageCount int `json:"messageCount"`
	UnreadCount int `json:"unreadCount"`
	Tags TagsContent `json:"tags"`
	SystemContext string `json:"systemContext"`
	UserContext string `json:"userContext"`
	LastInteractionTime string `json:"lastInteractionTime"`
	ModelId int `json:"modelId"`
	Model string `json:"model"`
	KnowledgeBaseId int `json:"knowledgeBaseId"`
	DataSourceId int `json:"dataSourceId"`
	ChatOptions PlusChatOptions `json:"chatOptions"`
	Pinned bool `json:"pinned"`
	SortOrder int `json:"sortOrder"`
}
