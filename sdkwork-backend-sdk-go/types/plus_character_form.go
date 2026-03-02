package types

// Character creation form
type PlusCharacterForm struct {
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
