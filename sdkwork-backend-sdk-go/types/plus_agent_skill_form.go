package types

// 技能创建/更新表单
type PlusAgentSkillForm struct {
	UserId int `json:"userId"`
	SkillKey string `json:"skillKey"`
	Name string `json:"name"`
	Summary string `json:"summary"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	CoverImage string `json:"coverImage"`
	CategoryId int `json:"categoryId"`
	PackageId int `json:"packageId"`
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
	Visibility string `json:"visibility"`
	Enabled bool `json:"enabled"`
	Price float64 `json:"price"`
	Currency string `json:"currency"`
	Tags []string `json:"tags"`
	Capabilities []string `json:"capabilities"`
	ConfigSchema map[string]interface{} `json:"configSchema"`
	DefaultConfig map[string]interface{} `json:"defaultConfig"`
}
