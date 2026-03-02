package types


type ChatMessageQueryListForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	ConversationId int `json:"conversationId"`
	ConversationUuid string `json:"conversationUuid"`
	LastSyncMessageId string `json:"lastSyncMessageId"`
}
