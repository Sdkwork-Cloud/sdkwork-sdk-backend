package types

// AI Conversation Query List Form - 用于查询用户与AI代理之间的对话会话列表
type PlusConversationQueryListForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	InitDefaults bool `json:"initDefaults"`
}
