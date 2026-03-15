package types


type PlusAgent struct {
	Name string `json:"name"`
	Id int `json:"id"`
	Definition AgentDefinition `json:"definition"`
	Description string `json:"description"`
	Metadata AgentMetadata `json:"metadata"`
	Uuid string `json:"uuid"`
	SystemPrompt Prompt `json:"systemPrompt"`
	AccountConfig LlmAccountConfig `json:"accountConfig"`
	Tools []PromptToolDescription `json:"tools"`
	ExecutionContext AgentExecutionContext `json:"executionContext"`
	ChatContext ChatContext `json:"chatContext"`
	ChatOptions ChatOptions `json:"chatOptions"`
	Instructions []string `json:"instructions"`
	FaceURL string `json:"faceURL"`
	Prompts map[string]Prompt `json:"prompts"`
	ToolCallbackProvider ToolCallbackProvider `json:"toolCallbackProvider"`
	PromptPath string `json:"promptPath"`
	PromptContextOptimizer PromptContextOptimizer `json:"promptContextOptimizer"`
	NextActions []string `json:"nextActions"`
	ChatMemory IPlusChatMemory `json:"chatMemory"`
}
