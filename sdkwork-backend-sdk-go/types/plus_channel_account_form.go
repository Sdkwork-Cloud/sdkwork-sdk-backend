package types

// Channel account creation form
type PlusChannelAccountForm struct {
	Name string `json:"name"`
	Channel string `json:"channel"`
	Configs ChannelConfigInfo `json:"configs"`
	Status string `json:"status"`
	Description string `json:"description"`
}
