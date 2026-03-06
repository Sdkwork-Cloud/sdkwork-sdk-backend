package types


type PlusAgent struct {
	Name string `json:"name"`
	Id int `json:"id"`
	Definition AgentDefinition `json:"definition"`
	Description string `json:"description"`
	Metadata AgentMetadata `json:"metadata"`
	Uuid string `json:"uuid"`
	SystemPrompt Prompt `json:"systemPrompt"`
	Tools []PromptToolDescription `json:"tools"`
	ChatContext ChatContext `json:"chatContext"`
	ChatOptions ChatOptions `json:"chatOptions"`
	ExecutionContext AgentExecutionContext `json:"executionContext"`
	Instructions []string `json:"instructions"`
	FaceURL string `json:"faceURL"`
	Prompts map[string]Prompt `json:"prompts"`
	AccountConfig LlmAccountConfig `json:"accountConfig"`
	ChatMemory IPlusChatMemory `json:"chatMemory"`
	ToolCallbackProvider ToolCallbackProvider `json:"toolCallbackProvider"`
	PromptPath string `json:"promptPath"`
	PromptContextOptimizer PromptContextOptimizer `json:"promptContextOptimizer"`
	NextActions []string `json:"nextActions"`
}
