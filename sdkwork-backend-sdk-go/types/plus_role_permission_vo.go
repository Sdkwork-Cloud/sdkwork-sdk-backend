package types

// Role-Permission association VO (stores many-to-many relationship between roles and permissions)
type PlusRolePermissionVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	RoleId int `json:"roleId"`
	RoleUuid string `json:"roleUuid"`
	PermissionId int `json:"permissionId"`
	PermissionUuid string `json:"permissionUuid"`
	Enabled bool `json:"enabled"`
	Description string `json:"description"`
	OperatorId int `json:"operatorId"`
	Status string `json:"status"`
}
