package types

// 聊天完成Stream方式的响应对象，用于流式传输的聊天模型响应
type ChatCompletionChunk struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Created int `json:"created"`
	Model string `json:"model"`
	Choices []ChatCompletionChunkChoice `json:"choices"`
	Usage CompletionUsage `json:"usage"`
	Metadata ChatCompletionMetadata `json:"metadata"`
	Content string `json:"content"`
	Agent PlusAgent `json:"agent"`
	ReasoningContent string `json:"reasoningContent"`
	SystemFingerprint string `json:"system_fingerprint"`
}
