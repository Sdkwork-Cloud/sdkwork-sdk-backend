package types

// 聊天完成响应中的选项对象
type ChatCompletionChoice struct {
	Index int `json:"index"`
	Message ChatCompletionMessage `json:"message"`
	Logprobs LogProbInfo `json:"logprobs"`
	FinishReason string `json:"finish_reason"`
}
