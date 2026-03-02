package types


type PlusPermission struct {
	TenantId int `json:"tenantId"`
	OrganizationId int `json:"organizationId"`
	DataScope string `json:"dataScope"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	V int `json:"v"`
	Name string `json:"name"`
	Code string `json:"code"`
	Description string `json:"description"`
	Status string `json:"status"`
	SortOrder int `json:"sortOrder"`
	ResourceUrl string `json:"resourceUrl"`
	HttpMethod string `json:"httpMethod"`
}
