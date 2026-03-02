package types

// Profile Item
type ProfileItem struct {
	Name string `json:"name"`
	Label string `json:"label"`
	Values []string `json:"values"`
	Custom bool `json:"custom"`
	UpdateCount int `json:"updateCount"`
	Samples []string `json:"samples"`
	Description string `json:"description"`
}
