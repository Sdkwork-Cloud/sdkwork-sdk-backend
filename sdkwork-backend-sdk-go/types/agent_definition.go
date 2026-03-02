package types


type AgentDefinition struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	Instructions string `json:"instructions"`
	Description string `json:"description"`
	Type string `json:"type"`
	BizType string `json:"bizType"`
	Agents TeamAgentMembers `json:"agents"`
	ToolConfig AgentToolConfig `json:"toolConfig"`
	BaseConfig PlusAiAgentConfig `json:"baseConfig"`
	KnowledgeConfig AgentKnowledgeConfig `json:"knowledgeConfig"`
	MemoryConfig AgentMemoryConfig `json:"memoryConfig"`
	SpeechConfig SpeechConfig `json:"speechConfig"`
	ChatOptions ChatOptions `json:"chatOptions"`
}
