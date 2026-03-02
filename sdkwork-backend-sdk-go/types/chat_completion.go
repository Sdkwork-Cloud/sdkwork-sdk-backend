package types

// 大模型的聊天完成响应结果
type ChatCompletion struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Created int `json:"created"`
	Model string `json:"model"`
	Choices []ChatCompletionChoice `json:"choices"`
	Usage CompletionUsage `json:"usage"`
	Metadata ChatCompletionMetadata `json:"metadata"`
	Content string `json:"content"`
	Agent PlusAgent `json:"agent"`
	SystemFingerprint string `json:"system_fingerprint"`
}
