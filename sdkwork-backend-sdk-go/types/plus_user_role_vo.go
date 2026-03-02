package types

// 用户角色关联关系VO
type PlusUserRoleVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	UserId int `json:"userId"`
	RoleId int `json:"roleId"`
}
