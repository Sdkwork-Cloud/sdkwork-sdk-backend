package types

// RBAC Permission Form (stores system permission metadata for data transfer and validation)
type PlusPermissionForm struct {
	Name string `json:"name"`
	Code string `json:"code"`
	Description string `json:"description"`
	Status string `json:"status"`
	SortOrder int `json:"sortOrder"`
	ResourceUrl string `json:"resourceUrl"`
	HttpMethod string `json:"httpMethod"`
}
