package types

// Table creation form
type PlusTableForm struct {
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
}
