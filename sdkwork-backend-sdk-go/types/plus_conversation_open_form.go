package types

// AI Conversation Form - 用于创建或更新用户与AI代理之间的对话会话
type PlusConversationOpenForm struct {
	ConversationId string `json:"conversationId"`
	Uuid string `json:"uuid"`
	Title string `json:"title"`
	UserId int `json:"userId"`
	AgentId int `json:"agentId"`
	KnowledgeBaseId int `json:"knowledgeBaseId"`
	DataSourceId int `json:"dataSourceId"`
	ChatOptions PlusChatOptions `json:"chatOptions"`
}
