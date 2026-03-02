package types


type PlusAgent struct {
	Name string `json:"name"`
	Id int `json:"id"`
	Definition AgentDefinition `json:"definition"`
	Uuid string `json:"uuid"`
	NextActions []string `json:"nextActions"`
	ChatMemory IPlusChatMemory `json:"chatMemory"`
	ExecutionContext AgentExecutionContext `json:"executionContext"`
	AccountConfig LlmAccountConfig `json:"accountConfig"`
	ToolCallbackProvider ToolCallbackProvider `json:"toolCallbackProvider"`
	PromptContextOptimizer PromptContextOptimizer `json:"promptContextOptimizer"`
	PromptPath string `json:"promptPath"`
	Description string `json:"description"`
	Metadata AgentMetadata `json:"metadata"`
	FaceURL string `json:"faceURL"`
	Prompts map[string]Prompt `json:"prompts"`
	SystemPrompt Prompt `json:"systemPrompt"`
	Instructions []string `json:"instructions"`
	ChatOptions ChatOptions `json:"chatOptions"`
	ChatContext ChatContext `json:"chatContext"`
	Tools []PromptToolDescription `json:"tools"`
}
