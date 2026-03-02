package types

// 租户Value Object
type PlusTenantVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Code string `json:"code"`
	Status string `json:"status"`
	Description string `json:"description"`
	AdminUserId int `json:"adminUserId"`
	ExpireTime string `json:"expireTime"`
	InstallAppList InstallAppList `json:"installAppList"`
}
