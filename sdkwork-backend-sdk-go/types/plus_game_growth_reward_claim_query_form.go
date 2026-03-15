package types

// Growth reward claim audit query form
type PlusGameGrowthRewardClaimQueryForm struct {
	AccountId int `json:"accountId"`
	UserId int `json:"userId"`
	AccountType string `json:"accountType"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
}
