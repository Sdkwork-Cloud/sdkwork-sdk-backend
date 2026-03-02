package types

// Position VO
type PlusPositionVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	ParentId int `json:"parentId"`
	Name string `json:"name"`
	Description string `json:"description"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	Code string `json:"code"`
	Level int `json:"level"`
	SortOrder int `json:"sortOrder"`
	IsActive bool `json:"isActive"`
	OrganizationName string `json:"organizationName"`
	MemberIds []int `json:"memberIds"`
}
