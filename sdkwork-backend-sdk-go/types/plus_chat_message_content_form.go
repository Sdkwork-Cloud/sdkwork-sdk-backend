package types

// Chat message creation form
type PlusChatMessageContentForm struct {
	Role string `json:"role"`
	Type string `json:"type"`
	Status string `json:"status"`
	ConversationId int `json:"conversationId"`
	ConversationUuid string `json:"conversationUuid"`
	AgentId int `json:"agentId"`
	AgentType string `json:"agentType"`
	AgentBizType string `json:"agentBizType"`
	Content MessageBody `json:"content"`
	Metadata map[string]interface{} `json:"metadata"`
}
