package types

// Channel proxy VO
type PlusChannelProxyVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	UserId int `json:"userId"`
	Name string `json:"name"`
	Channel string `json:"channel"`
	Proxy string `json:"proxy"`
	DefaultModel string `json:"defaultModel"`
	Status string `json:"status"`
	Description string `json:"description"`
}
