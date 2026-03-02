package types

// 聊天消息对象，包含消息的角色、内容和工具调用信息
type ChatCompletionChunkDelta struct {
	Role string `json:"role"`
	Content string `json:"content"`
	Audio ChatCompletionAudio `json:"audio"`
	ReasoningContent string `json:"reasoning_content"`
	ToolCalls []ChatCompletionMessageToolCall `json:"tool_calls"`
}
