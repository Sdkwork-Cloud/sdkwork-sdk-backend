package types


type PlusChatOptions struct {
	StreamUsage bool `json:"streamUsage"`
	Model string `json:"model"`
	FrequencyPenalty float64 `json:"frequency_penalty"`
	LogitBias map[string]int `json:"logit_bias"`
	Logprobs bool `json:"logprobs"`
	TopLogprobs int `json:"top_logprobs"`
	MaxTokens int `json:"max_tokens"`
	MaxCompletionTokens int `json:"max_completion_tokens"`
	N int `json:"n"`
	Modalities []string `json:"modalities"`
	Audio AudioParameters `json:"audio"`
	PresencePenalty float64 `json:"presence_penalty"`
	ResponseFormat ResponseFormat `json:"response_format"`
	StreamOptions StreamOptions `json:"stream_options"`
	Stream bool `json:"stream"`
	Seed int `json:"seed"`
	Stop []string `json:"stop"`
	Temperature float64 `json:"temperature"`
	TopP float64 `json:"top_p"`
	Tools []FunctionTool `json:"tools"`
	ToolChoice interface{} `json:"tool_choice"`
	User string `json:"user"`
	ParallelToolCalls bool `json:"parallel_tool_calls"`
	Store bool `json:"store"`
	Metadata map[string]string `json:"metadata"`
	ReasoningEffort string `json:"reasoning_effort"`
	Verbosity string `json:"verbosity"`
	WebSearchOptions WebSearchOptions `json:"web_search_options"`
}
