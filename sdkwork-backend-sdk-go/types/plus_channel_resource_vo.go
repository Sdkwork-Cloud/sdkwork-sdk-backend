package types

// Channel Resource VO (Manages resources associated with communication channels, including type and provider mappings)
type PlusChannelResourceVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Resource string `json:"resource"`
	Channel string `json:"channel"`
	ChannelAccountId int `json:"channelAccountId"`
}
