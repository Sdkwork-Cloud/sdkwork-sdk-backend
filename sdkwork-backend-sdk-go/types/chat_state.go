package types


type ChatState struct {
	Content string `json:"content"`
	ReasoningContent string `json:"reasoningContent"`
	Thinking bool `json:"thinking"`
}
