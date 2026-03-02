package types

// 聊天消息内容VO
type PlusChatMessageContentVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Version int `json:"version"`
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
