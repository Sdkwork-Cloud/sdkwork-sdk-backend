package types

// AI工具VO类
type PlusAiToolVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	Status string `json:"status"`
	Enabled bool `json:"enabled"`
	HttpApiDefinition HttpApiDefinition `json:"httpApiDefinition"`
	ToolDefinition PlusToolDefinition `json:"toolDefinition"`
}
