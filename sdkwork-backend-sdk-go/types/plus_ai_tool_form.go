package types

// Tool creation form
type PlusAiToolForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	Status string `json:"status"`
	Enabled bool `json:"enabled"`
	HttpApiDefinition HttpApiDefinition `json:"httpApiDefinition"`
	ToolDefinition PlusToolDefinition `json:"toolDefinition"`
}
