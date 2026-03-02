package types

// Role creation form
type PlusRoleForm struct {
	Code string `json:"code"`
	Name string `json:"name"`
	Description string `json:"description"`
	Status string `json:"status"`
}
