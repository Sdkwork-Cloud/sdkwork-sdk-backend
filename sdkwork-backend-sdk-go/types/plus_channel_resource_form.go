package types

// Channel resource creation form
type PlusChannelResourceForm struct {
	Resource string `json:"resource"`
	Channel string `json:"channel"`
	ChannelAccountId int `json:"channelAccountId"`
}
