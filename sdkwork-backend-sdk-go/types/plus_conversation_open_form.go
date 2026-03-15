package types

// P lu sC on ve rs at io nO pe nF or m
type PlusConversationOpenForm struct {
	ConversationId string `json:"conversationId"`
	Uuid string `json:"uuid"`
	UserId int `json:"userId"`
	AgentId int `json:"agentId"`
	KnowledgeBaseId int `json:"knowledgeBaseId"`
	DataSourceId int `json:"dataSourceId"`
	ChatOptions PlusChatOptions `json:"chatOptions"`
}
