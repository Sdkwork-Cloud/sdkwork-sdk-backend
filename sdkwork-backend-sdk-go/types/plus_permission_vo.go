package types

// RBAC Permission Value Object (stores system permission metadata)
type PlusPermissionVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	Code string `json:"code"`
	Description string `json:"description"`
	Status string `json:"status"`
	SortOrder int `json:"sortOrder"`
	ResourceUrl string `json:"resourceUrl"`
	HttpMethod string `json:"httpMethod"`
}
