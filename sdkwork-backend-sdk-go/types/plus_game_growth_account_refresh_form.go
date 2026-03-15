package types

// Growth account refresh form
type PlusGameGrowthAccountRefreshForm struct {
	UserId int `json:"userId"`
	AccountType string `json:"accountType"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
}
