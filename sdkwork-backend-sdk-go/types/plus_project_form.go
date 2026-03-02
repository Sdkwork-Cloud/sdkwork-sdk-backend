package types

// Project creation form
type PlusProjectForm struct {
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
