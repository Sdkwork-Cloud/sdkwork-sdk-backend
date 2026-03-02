package types

// Shopping cart creation form
type PlusShoppingCartForm struct {
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	Name string `json:"name"`
	Description string `json:"description"`
	GroupList CartGroupList `json:"groupList"`
	Status string `json:"status"`
}
