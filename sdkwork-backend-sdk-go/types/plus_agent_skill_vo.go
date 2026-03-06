package types

// 技能管理VO
type PlusAgentSkillVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	TenantId int `json:"tenantId"`
	OrganizationId int `json:"organizationId"`
	UserId int `json:"userId"`
	SkillKey string `json:"skillKey"`
	Name string `json:"name"`
	Summary string `json:"summary"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	CoverImage string `json:"coverImage"`
	CategoryId int `json:"categoryId"`
	CategoryName string `json:"categoryName"`
	PackageId int `json:"packageId"`
	PackageName string `json:"packageName"`
	Provider string `json:"provider"`
	Version string `json:"version"`
	Runtime string `json:"runtime"`
	Entrypoint string `json:"entrypoint"`
	ManifestUrl string `json:"manifestUrl"`
	RepositoryUrl string `json:"repositoryUrl"`
	HomepageUrl string `json:"homepageUrl"`
	DocumentationUrl string `json:"documentationUrl"`
	LicenseName string `json:"licenseName"`
	SourceType string `json:"sourceType"`
	MarketStatus string `json:"marketStatus"`
	Visibility string `json:"visibility"`
	ReviewStatus string `json:"reviewStatus"`
	ReviewComment string `json:"reviewComment"`
	ReviewedBy int `json:"reviewedBy"`
	ReviewedAt string `json:"reviewedAt"`
	Builtin bool `json:"builtin"`
	Enabled bool `json:"enabled"`
	Featured bool `json:"featured"`
	RecommendWeight int `json:"recommendWeight"`
	Price float64 `json:"price"`
	Currency string `json:"currency"`
	InstallCount int `json:"installCount"`
	RatingAvg float64 `json:"ratingAvg"`
	RatingCount int `json:"ratingCount"`
	Tags []string `json:"tags"`
	Capabilities []string `json:"capabilities"`
	ConfigSchema map[string]interface{} `json:"configSchema"`
	DefaultConfig map[string]interface{} `json:"defaultConfig"`
	LatestPublishedAt string `json:"latestPublishedAt"`
}
