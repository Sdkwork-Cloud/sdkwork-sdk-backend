package types

// 技能分包管理VO
type PlusAgentSkillPackageVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	TenantId int `json:"tenantId"`
	OrganizationId int `json:"organizationId"`
	UserId int `json:"userId"`
	PackageKey string `json:"packageKey"`
	Name string `json:"name"`
	Summary string `json:"summary"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	CoverImage string `json:"coverImage"`
	CategoryId int `json:"categoryId"`
	CategoryName string `json:"categoryName"`
	Tags []string `json:"tags"`
	Enabled bool `json:"enabled"`
	Featured bool `json:"featured"`
	SortWeight int `json:"sortWeight"`
	SkillCount int `json:"skillCount"`
	LatestPublishedAt string `json:"latestPublishedAt"`
}
