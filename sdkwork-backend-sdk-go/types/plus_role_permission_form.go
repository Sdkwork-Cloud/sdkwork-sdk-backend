package types

// Role-permission association creation form
type PlusRolePermissionForm struct {
	RoleId int `json:"roleId"`
	RoleUuid string `json:"roleUuid"`
	PermissionId int `json:"permissionId"`
	PermissionUuid string `json:"permissionUuid"`
	Enabled bool `json:"enabled"`
	Description string `json:"description"`
	OperatorId int `json:"operatorId"`
}
