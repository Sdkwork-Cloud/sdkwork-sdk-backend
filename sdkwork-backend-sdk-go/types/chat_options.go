package types


type ChatOptions struct {
	TopP float64 `json:"topP"`
	TopK int `json:"topK"`
	PresencePenalty float64 `json:"presencePenalty"`
	MaxTokens int `json:"maxTokens"`
	StopSequences []string `json:"stopSequences"`
	FrequencyPenalty float64 `json:"frequencyPenalty"`
	Model string `json:"model"`
	Temperature float64 `json:"temperature"`
}
