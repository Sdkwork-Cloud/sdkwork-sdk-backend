package types

// Schema creation form
type PlusSchemaForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	Status int `json:"status"`
	TableCount int `json:"tableCount"`
	LastSyncTime string `json:"lastSyncTime"`
	IsDefault bool `json:"isDefault"`
	DatasourceId int `json:"datasourceId"`
}
