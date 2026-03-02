package types

// 购物车VO
type PlusShoppingCartVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	Name string `json:"name"`
	Description string `json:"description"`
	GroupList CartGroupList `json:"groupList"`
	Status string `json:"status"`
}
