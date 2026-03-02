package types

// AI智能体与工具关联关系VO类，用于维护AI智能体与工具之间的多对多关联关系
type PlusAiAgentToolVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	AgentId int `json:"agentId"`
	ToolId int `json:"toolId"`
	SortOrder int `json:"sortOrder"`
	Enabled bool `json:"enabled"`
	AgentName string `json:"agentName"`
	ToolName string `json:"toolName"`
}
