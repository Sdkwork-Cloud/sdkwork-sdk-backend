package types

// Configuration for AI agent behavior and settings
type PlusAiAgentConfig struct {
	Welcome string `json:"welcome"`
	Questions []string `json:"questions"`
	SaveFiles bool `json:"saveFiles"`
	EnableMemory bool `json:"enableMemory"`
	MaxHistoryMessages int `json:"maxHistoryMessages"`
	UseKnowledgeBase bool `json:"useKnowledgeBase"`
	Properties map[string]interface{} `json:"properties"`
}
