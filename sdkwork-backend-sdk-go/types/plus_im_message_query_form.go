package types

// IM消息分页查询参数
type PlusImMessageQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	ConversationId int `json:"conversationId"`
	SenderId int `json:"senderId"`
	ReceiverId int `json:"receiverId"`
	GroupId int `json:"groupId"`
	Type string `json:"type"`
}
