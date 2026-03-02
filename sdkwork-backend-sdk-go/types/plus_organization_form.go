package types

// Install app list
type PlusOrganizationForm struct {
	Name string `json:"name"`
	Code string `json:"code"`
	Status string `json:"status"`
	Description string `json:"description"`
	ParentId int `json:"parentId"`
	InstallAppList InstallAppList `json:"installAppList"`
}
