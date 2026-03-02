package types

// 组织VO对象
type PlusOrganizationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Code string `json:"code"`
	Status string `json:"status"`
	Description string `json:"description"`
	ParentId int `json:"parentId"`
	InstallAppList InstallAppList `json:"installAppList"`
}
