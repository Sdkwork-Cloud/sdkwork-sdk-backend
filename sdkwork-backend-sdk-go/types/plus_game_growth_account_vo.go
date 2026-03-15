package types

// Growth account view object
type PlusGameGrowthAccountVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	AccountId int `json:"accountId"`
	UserId int `json:"userId"`
	AccountType string `json:"accountType"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
	CurrentLevelConfigId int `json:"currentLevelConfigId"`
	CurrentLevelNo int `json:"currentLevelNo"`
	CurrentLevelCode string `json:"currentLevelCode"`
	CurrentLevelName string `json:"currentLevelName"`
	CurrentTitle string `json:"currentTitle"`
	CurrentBadgeCode string `json:"currentBadgeCode"`
	CurrentExp int `json:"currentExp"`
	TotalExp int `json:"totalExp"`
	CurrentLevelStartExp int `json:"currentLevelStartExp"`
	NextLevelRequiredExp int `json:"nextLevelRequiredExp"`
	ExpToNextLevel int `json:"expToNextLevel"`
	ProgressPercent float64 `json:"progressPercent"`
	PeakLevelNo int `json:"peakLevelNo"`
	PeakExp int `json:"peakExp"`
	LevelUpCount int `json:"levelUpCount"`
	RewardClaimedCount int `json:"rewardClaimedCount"`
	LastGainAt string `json:"lastGainAt"`
	LastLevelUpAt string `json:"lastLevelUpAt"`
	LastResetAt string `json:"lastResetAt"`
	Active bool `json:"active"`
	LastClaimedLevelNo int `json:"lastClaimedLevelNo"`
	LastRewardClaimedAt string `json:"lastRewardClaimedAt"`
	LastRewardIssuedAt string `json:"lastRewardIssuedAt"`
	LastClaimedRewardLevelCode string `json:"lastClaimedRewardLevelCode"`
	LastClaimedRewardLevelName string `json:"lastClaimedRewardLevelName"`
	LastClaimedRewardSummary map[string]interface{} `json:"lastClaimedRewardSummary"`
	LastClaimedRewardConfig map[string]interface{} `json:"lastClaimedRewardConfig"`
	ExtData map[string]interface{} `json:"extData"`
}
