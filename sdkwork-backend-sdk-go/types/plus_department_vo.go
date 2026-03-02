package types

// Department VO
type PlusDepartmentVO struct {
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
	SortOrder int `json:"sortOrder"`
	IsActive bool `json:"isActive"`
	OrganizationId int `json:"organizationId"`
	MemberIds []int `json:"memberIds"`
}
