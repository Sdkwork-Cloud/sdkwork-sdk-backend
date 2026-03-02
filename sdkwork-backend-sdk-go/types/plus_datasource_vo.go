package types

// 数据源信息VO
type PlusDatasourceVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Type int `json:"type"`
	Status int `json:"status"`
	Description string `json:"description"`
	ConnectionConfig interface{} `json:"connectionConfig"`
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
	SchemaIds []int `json:"schemaIds"`
}
