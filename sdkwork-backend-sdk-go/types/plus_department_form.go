package types

// Department creation form
type PlusDepartmentForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	Code string `json:"code"`
	SortOrder int `json:"sortOrder"`
	IsActive bool `json:"isActive"`
	ParentId int `json:"parentId"`
}
