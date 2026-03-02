package types


type PlusRole struct {
	TenantId int `json:"tenantId"`
	OrganizationId int `json:"organizationId"`
	DataScope string `json:"dataScope"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	V int `json:"v"`
	Code string `json:"code"`
	Name string `json:"name"`
	Description string `json:"description"`
	Status string `json:"status"`
	Permissions []PlusPermission `json:"permissions"`
	PermissionCodes []string `json:"permissionCodes"`
}
