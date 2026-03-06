package types


type ChatOptions struct {
	Model string `json:"model"`
	Temperature float64 `json:"temperature"`
	TopP float64 `json:"topP"`
	TopK int `json:"topK"`
	MaxTokens int `json:"maxTokens"`
	StopSequences []string `json:"stopSequences"`
	FrequencyPenalty float64 `json:"frequencyPenalty"`
	PresencePenalty float64 `json:"presencePenalty"`
}
