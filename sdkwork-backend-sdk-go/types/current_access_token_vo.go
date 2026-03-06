package types

// 当前上下文访问令牌结果
type CurrentAccessTokenVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AppId int `json:"appId"`
	AppName string `json:"appName"`
	Platform string `json:"platform"`
	TenantId int `json:"tenantId"`
	OrganizationId int `json:"organizationId"`
	TenantAccessToken TokenResult `json:"tenantAccessToken"`
	OrganizationAccessToken TokenResult `json:"organizationAccessToken"`
}
