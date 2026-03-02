package types

// Chat participant creation form
type PlusParticipantForm struct {
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
