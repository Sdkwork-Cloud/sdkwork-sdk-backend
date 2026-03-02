package types

// Query form with optional filters
type PlusChannelAccountQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	Channel string `json:"channel"`
	Status string `json:"status"`
	ResourceType string `json:"resourceType"`
	ResourceTypes []string `json:"resourceTypes"`
}
