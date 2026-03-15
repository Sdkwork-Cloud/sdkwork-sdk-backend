package types

// Growth level configuration view object
type PlusGameGrowthLevelConfigVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ConfigId int `json:"configId"`
	AccountType string `json:"accountType"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
	LevelNo int `json:"levelNo"`
	LevelCode string `json:"levelCode"`
	LevelName string `json:"levelName"`
	Title string `json:"title"`
	BadgeCode string `json:"badgeCode"`
	IconUrl string `json:"iconUrl"`
	RequiredExp int `json:"requiredExp"`
	ExpStartValue int `json:"expStartValue"`
	ExpEndValue int `json:"expEndValue"`
	WinExpReward int `json:"winExpReward"`
	LoseExpReward int `json:"loseExpReward"`
	DrawExpReward int `json:"drawExpReward"`
	EscapeExpPenalty int `json:"escapeExpPenalty"`
	Status string `json:"status"`
	Visible bool `json:"visible"`
	Description string `json:"description"`
	RewardConfig map[string]interface{} `json:"rewardConfig"`
	BenefitConfig map[string]interface{} `json:"benefitConfig"`
	ExtData map[string]interface{} `json:"extData"`
}
