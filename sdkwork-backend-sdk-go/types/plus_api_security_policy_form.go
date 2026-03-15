package types

// API瀹夊叏绛栫暐琛ㄥ崟
type PlusApiSecurityPolicyForm struct {
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
