package types


type PlusToolDefinition struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Type string `json:"type"`
	Name string `json:"name"`
	Description string `json:"description"`
	InputSchema string `json:"inputSchema"`
	BuildIn bool `json:"buildIn"`
	HttpDefinition HttpApiDefinition `json:"httpDefinition"`
}
