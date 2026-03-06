package types

// API安全策略VO
type PlusApiSecurityPolicyVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	PolicyCode string `json:"policyCode"`
	ApiType string `json:"apiType"`
	PathPattern string `json:"pathPattern"`
	HttpMethod string `json:"httpMethod"`
	MatchMode string `json:"matchMode"`
	AuthMode string `json:"authMode"`
	AllowAnonymous bool `json:"allowAnonymous"`
	RequiredRoles string `json:"requiredRoles"`
	RequiredPermissions string `json:"requiredPermissions"`
	Priority int `json:"priority"`
	Enabled bool `json:"enabled"`
	Description string `json:"description"`
}
