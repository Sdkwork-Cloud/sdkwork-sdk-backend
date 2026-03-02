package types

// Member level creation form
type PlusMemberLevelForm struct {
	CardId int `json:"cardId"`
	LevelName string `json:"levelName"`
	RequiredPoints int `json:"requiredPoints"`
	Description string `json:"description"`
	Status string `json:"status"`
}
