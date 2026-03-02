package types

// IM消息实体类
type PlusMessage struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	SendAt string `json:"sendAt"`
	ConversationId int `json:"conversationId"`
	Type string `json:"type"`
	Sender Participant `json:"sender"`
	Receiver Participant `json:"receiver"`
	GroupId int `json:"groupId"`
	MsgId string `json:"msgId"`
	ClientMsgId string `json:"clientMsgId"`
	Body MessageBody `json:"body"`
	Metadata map[string]interface{} `json:"metadata"`
	Content string `json:"content"`
}
