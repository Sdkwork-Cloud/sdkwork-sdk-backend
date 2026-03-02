package types

// Conversation creation form
type PlusConversationForm struct {
	Uuid string `json:"uuid"`
	Title string `json:"title"`
	Description string `json:"description"`
	UserId int `json:"userId"`
	Status string `json:"status"`
	AgentId int `json:"agentId"`
	Summary string `json:"summary"`
	LastMessageId int `json:"lastMessageId"`
	MessageCount int `json:"messageCount"`
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
