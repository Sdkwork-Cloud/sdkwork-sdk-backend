package types

// Channel proxy creation form
type PlusChannelProxyForm struct {
	Name string `json:"name"`
	Channel string `json:"channel"`
	Proxy string `json:"proxy"`
	DefaultModel string `json:"defaultModel"`
	Status string `json:"status"`
	Description string `json:"description"`
}
