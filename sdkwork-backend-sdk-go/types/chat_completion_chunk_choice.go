package types

// 流式聊天完成响应中的选项对象，包含模型生成的响应内容块
type ChatCompletionChunkChoice struct {
	Index int `json:"index"`
	Delta ChatCompletionChunkDelta `json:"delta"`
	Logprobs LogProbInfo `json:"logprobs"`
	FinishReason string `json:"finish_reason"`
}
