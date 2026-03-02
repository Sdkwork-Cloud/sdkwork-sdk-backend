package types

// Install app list
type PlusTenantForm struct {
	Name string `json:"name"`
	Code string `json:"code"`
	Status string `json:"status"`
	Description string `json:"description"`
	AdminUserId int `json:"adminUserId"`
	ExpireTime string `json:"expireTime"`
	InstallAppList InstallAppList `json:"installAppList"`
}
