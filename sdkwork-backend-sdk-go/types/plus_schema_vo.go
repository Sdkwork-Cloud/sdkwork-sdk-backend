package types

// 数据库Schema定义VO
type PlusSchemaVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Status int `json:"status"`
	TableCount int `json:"tableCount"`
	LastSyncTime string `json:"lastSyncTime"`
	IsDefault bool `json:"isDefault"`
	DatasourceId int `json:"datasourceId"`
	TableIds []int `json:"tableIds"`
}
