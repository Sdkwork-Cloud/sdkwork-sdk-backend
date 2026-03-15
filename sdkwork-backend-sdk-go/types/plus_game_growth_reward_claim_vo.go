package types

// Growth reward claim audit view object
type PlusGameGrowthRewardClaimVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AccountId int `json:"accountId"`
	UserId int `json:"userId"`
	AccountType string `json:"accountType"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
	CurrentLevelNo int `json:"currentLevelNo"`
	LevelNo int `json:"levelNo"`
	LevelCode string `json:"levelCode"`
	LevelName string `json:"levelName"`
	Title string `json:"title"`
	BadgeCode string `json:"badgeCode"`
	ClaimedAt string `json:"claimedAt"`
	RewardIssuedAt string `json:"rewardIssuedAt"`
	OperatorUserId int `json:"operatorUserId"`
	RewardConfig map[string]interface{} `json:"rewardConfig"`
	RewardSummary map[string]interface{} `json:"rewardSummary"`
}
