package types

// 技能分包创建/更新表单
type PlusAgentSkillPackageForm struct {
	UserId int `json:"userId"`
	PackageKey string `json:"packageKey"`
	Name string `json:"name"`
	Summary string `json:"summary"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	CoverImage string `json:"coverImage"`
	CategoryId int `json:"categoryId"`
	Enabled bool `json:"enabled"`
	Featured bool `json:"featured"`
	SortWeight int `json:"sortWeight"`
	Tags []string `json:"tags"`
}
