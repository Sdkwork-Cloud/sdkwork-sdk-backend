package types

// Data source creation form (includes name, type, connection config)
type PlusDatasourceForm struct {
	Name string `json:"name"`
	Type int `json:"type"`
	Status int `json:"status"`
	Description string `json:"description"`
	ConnectionConfig DatasourceConfig `json:"connectionConfig"`
	Url string `json:"url"`
	Owner string `json:"owner"`
	LastConnectedAt string `json:"lastConnectedAt"`
	ConnectionTimeout int `json:"connectionTimeout"`
	Tags TagsContent `json:"tags"`
	DbVersion string `json:"dbVersion"`
	SecurityLevel int `json:"securityLevel"`
	AccessCount int `json:"accessCount"`
	Icon string `json:"icon"`
	Color string `json:"color"`
}
