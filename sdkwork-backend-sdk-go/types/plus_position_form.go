package types

// Position creation form
type PlusPositionForm struct {
	ParentId int `json:"parentId"`
	Name string `json:"name"`
	Description string `json:"description"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	Code string `json:"code"`
	Level int `json:"level"`
	SortOrder int `json:"sortOrder"`
	IsActive bool `json:"isActive"`
}
