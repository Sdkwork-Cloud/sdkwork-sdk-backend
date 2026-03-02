package types

// Agent-tool relationship creation form
type PlusAiAgentToolForm struct {
	AgentId int `json:"agentId"`
	ToolId int `json:"toolId"`
	SortOrder int `json:"sortOrder"`
	Enabled bool `json:"enabled"`
}
