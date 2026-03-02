package types

// 项目信息VO对象(维护项目基本信息、状态及关联关系)
type PlusProjectVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	Code string `json:"code"`
	Description string `json:"description"`
	Status string `json:"status"`
	LeaderId int `json:"leaderId"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	BudgetAmount int `json:"budgetAmount"`
	IsDeleted bool `json:"isDeleted"`
}
