package types


type CompletionTokensDetails struct {
	ReasoningTokens int `json:"reasoning_tokens"`
	AudioTokens int `json:"audio_tokens"`
	AcceptedPredictionTokens int `json:"accepted_prediction_tokens"`
	RejectedPredictionTokens int `json:"rejected_prediction_tokens"`
}
