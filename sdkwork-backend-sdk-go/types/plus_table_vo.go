package types

// 数据库表定义VO
type PlusTableVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	ColumnCount int `json:"columnCount"`
	RowCount int `json:"rowCount"`
	LastSyncTime string `json:"lastSyncTime"`
	PrimaryKeys string `json:"primaryKeys"`
	Engine string `json:"engine"`
	CreateSql string `json:"createSql"`
	Comment string `json:"comment"`
	SchemaId int `json:"schemaId"`
	SchemaName string `json:"schemaName"`
	Columns []PlusColumnVO `json:"columns"`
}
