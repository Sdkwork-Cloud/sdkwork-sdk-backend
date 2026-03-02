package types

// 虚拟角色VO
type PlusCharacterVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	Type string `json:"type"`
	Avatar ImageMediaResource `json:"avatar"`
	ThreeViewImage ImageMediaResource `json:"threeViewImage"`
	GridShotsImage ImageMediaResource `json:"gridShotsImage"`
	AvatarVideo VideoMediaResource `json:"avatarVideo"`
	AgentId int `json:"agentId"`
	Description string `json:"description"`
	Status string `json:"status"`
	Personality string `json:"personality"`
	Background string `json:"background"`
	InteractionSettings string `json:"interactionSettings"`
	Version string `json:"version"`
	UserId int `json:"userId"`
}
