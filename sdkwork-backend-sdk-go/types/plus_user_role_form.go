package types

// User-role relationship creation form
type PlusUserRoleForm struct {
	UserId int `json:"userId"`
	RoleId int `json:"roleId"`
}
