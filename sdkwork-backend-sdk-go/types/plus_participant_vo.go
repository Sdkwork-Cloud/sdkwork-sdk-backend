package types

// 聊天参与者视图对象
type PlusParticipantVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Type string `json:"type"`
	Name string `json:"name"`
	Face ImageMediaResource `json:"face"`
	UserId int `json:"userId"`
	AgentId int `json:"agentId"`
	Role string `json:"role"`
	ContextType string `json:"contextType"`
	ContextId int `json:"contextId"`
	ConversationId int `json:"conversationId"`
	GroupType string `json:"groupType"`
	ConversationType string `json:"conversationType"`
	IsCreator bool `json:"isCreator"`
	IsOnline bool `json:"isOnline"`
	LastActiveTime string `json:"lastActiveTime"`
	IsTemporary bool `json:"isTemporary"`
}
