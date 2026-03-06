package types

// 技能分包查询参数
type PlusAgentSkillPackageQueryListForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	Keyword string `json:"keyword"`
	UserId int `json:"userId"`
	CategoryId int `json:"categoryId"`
	Enabled bool `json:"enabled"`
	Featured bool `json:"featured"`
}
