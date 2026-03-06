package types

// 工作区信息VO
type PlusWorkspaceVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	Code string `json:"code"`
	Title string `json:"title"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	Color string `json:"color"`
	Type string `json:"type"`
	Status string `json:"status"`
	OwnerId int `json:"ownerId"`
	LeaderId int `json:"leaderId"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	MaxMembers int `json:"maxMembers"`
	CurrentMembers int `json:"currentMembers"`
	MaxStorage int `json:"maxStorage"`
	UsedStorage int `json:"usedStorage"`
	Settings map[string]interface{} `json:"settings"`
	IsDeleted bool `json:"isDeleted"`
	IsPublic bool `json:"isPublic"`
	IsTemplate bool `json:"isTemplate"`
}
