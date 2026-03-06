package types

// Channel VO
type PlusChannelVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	UserId int `json:"userId"`
	Name string `json:"name"`
	Channel string `json:"channel"`
	Types []string `json:"types"`
	SupportResources []string `json:"supportResources"`
	Status string `json:"status"`
	Description string `json:"description"`
}
