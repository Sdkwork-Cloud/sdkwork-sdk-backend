package types

// Column view object
type PlusColumnVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	DataType string `json:"dataType"`
	ColumnType string `json:"columnType"`
	OrdinalPosition int `json:"ordinalPosition"`
	IsNullable bool `json:"isNullable"`
	IsPrimaryKey bool `json:"isPrimaryKey"`
	IsAutoIncrement bool `json:"isAutoIncrement"`
	DefaultValue string `json:"defaultValue"`
	Comment string `json:"comment"`
	CharacterSet string `json:"characterSet"`
	CollationRule string `json:"collationRule"`
	TableId int `json:"tableId"`
}
