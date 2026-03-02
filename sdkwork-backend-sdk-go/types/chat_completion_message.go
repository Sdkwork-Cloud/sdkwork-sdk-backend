package types

// 聊天消息对象，包含消息的角色、内容和工具调用信息
type ChatCompletionMessage struct {
	Role string `json:"role"`
	Content string `json:"content"`
	Audio ChatCompletionAudio `json:"audio"`
	ToolCalls []ChatCompletionMessageToolCall `json:"tool_calls"`
}
