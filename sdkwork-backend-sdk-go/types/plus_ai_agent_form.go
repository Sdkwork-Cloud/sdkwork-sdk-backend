package types

// AI agent creation form with configuration details
type PlusAiAgentForm struct {
	Name string `json:"name"`
	FaceImage ImageMediaResource `json:"faceImage"`
	FaceVideo VideoMediaResource `json:"faceVideo"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	Channel string `json:"channel"`
	ChannelId string `json:"channelId"`
	Icon string `json:"icon"`
	Description string `json:"description"`
	Tags TagsContent `json:"tags"`
	Type string `json:"type"`
	BizType string `json:"bizType"`
	Status string `json:"status"`
	BaseConfig PlusAiAgentConfig `json:"baseConfig"`
	KnowledgeConfig AgentKnowledgeConfig `json:"knowledgeConfig"`
	MemoryConfig AgentMemoryConfig `json:"memoryConfig"`
	SpeechConfig SpeechConfig `json:"speechConfig"`
	ToolConfig AgentToolConfig `json:"toolConfig"`
	Members TeamAgentMembers `json:"members"`
	CateId int `json:"cateId"`
	KnowledgeBaseId int `json:"knowledgeBaseId"`
	ChatOptions PlusChatOptions `json:"chatOptions"`
	Prompt AiAgentSystemPrompt `json:"prompt"`
}
