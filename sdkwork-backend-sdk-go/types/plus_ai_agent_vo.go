package types

// AI Agent Value Object (Represents an AI model agent with configuration and associations)
type PlusAiAgentVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
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
	KnowledgeBaseId int `json:"knowledgeBaseId"`
	PromptId int `json:"promptId"`
	CategoryId int `json:"categoryId"`
	ChatOptions PlusChatOptions `json:"chatOptions"`
	Config PlusAiAgentConfig `json:"config"`
	UsageCount int `json:"usageCount"`
}
