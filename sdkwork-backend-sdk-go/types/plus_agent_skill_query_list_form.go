package types

// 技能分页查询参数
type PlusAgentSkillQueryListForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	Keyword string `json:"keyword"`
	UserId int `json:"userId"`
	CategoryId int `json:"categoryId"`
	PackageId int `json:"packageId"`
	MarketStatus string `json:"marketStatus"`
	Visibility string `json:"visibility"`
	SourceType string `json:"sourceType"`
	ReviewStatus string `json:"reviewStatus"`
	Builtin bool `json:"builtin"`
	Enabled bool `json:"enabled"`
	Featured bool `json:"featured"`
}
