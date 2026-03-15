package types

// Account creation form
type PlusAccountForm struct {
	AccountType string `json:"accountType"`
	UserId int `json:"userId"`
	AvailableBalance float64 `json:"availableBalance"`
	FrozenBalance float64 `json:"frozenBalance"`
	AvailablePoints int `json:"availablePoints"`
	FrozenPoints int `json:"frozenPoints"`
	Status string `json:"status"`
}
