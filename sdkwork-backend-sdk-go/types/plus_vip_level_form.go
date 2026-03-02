package types

// VIP level creation form
type PlusVipLevelForm struct {
	Name string `json:"name"`
	LevelValue int `json:"levelValue"`
	RequiredPoints int `json:"requiredPoints"`
	Description string `json:"description"`
}
