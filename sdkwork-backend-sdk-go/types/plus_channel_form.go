package types

// Channel creation form
type PlusChannelForm struct {
	Name string `json:"name"`
	Channel string `json:"channel"`
	Types []string `json:"types"`
	SupportResources []string `json:"supportResources"`
	Status string `json:"status"`
	Description string `json:"description"`
}
