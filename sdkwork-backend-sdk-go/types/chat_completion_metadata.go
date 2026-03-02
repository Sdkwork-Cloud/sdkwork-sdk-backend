package types

// 聊天完成元数据
type ChatCompletionMetadata struct {
	Actions []string `json:"actions"`
	Agent map[string]interface{} `json:"agent"`
	ParentMessageId int `json:"parent_message_id"`
	ParentMessageUuid string `json:"parent_message_uuid"`
}
