package types

// 聊天补全创建请求参数
type ChatCompletionCreateForm struct {
	Model string `json:"model"`
	Messages []ChatCompletionMessage `json:"messages"`
	Temperature float64 `json:"temperature"`
	N int `json:"n"`
	Stream bool `json:"stream"`
	Stop []string `json:"stop"`
	User string `json:"user"`
	Tool string `json:"tool"`
	TopP float64 `json:"top_p"`
	MaxTokens int `json:"max_tokens"`
	PresencePenalty float64 `json:"presence_penalty"`
	FrequencyPenalty float64 `json:"frequency_penalty"`
	LogitBias map[string]int `json:"logit_bias"`
	ResponseFormat bool `json:"response_format"`
	SystemFingerprint string `json:"system_fingerprint"`
	ChatContext ChatContext `json:"chat_context"`
}
