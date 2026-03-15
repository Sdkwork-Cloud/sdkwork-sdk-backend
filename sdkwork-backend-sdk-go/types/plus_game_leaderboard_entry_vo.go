package types

// 棋牌游戏排行榜明细VO
type PlusGameLeaderboardEntryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	EntryId int `json:"entryId"`
	LeaderboardId int `json:"leaderboardId"`
	UserId int `json:"userId"`
	RankingType string `json:"rankingType"`
	PeriodType string `json:"periodType"`
	ScopeType string `json:"scopeType"`
	ScopeOwnerId int `json:"scopeOwnerId"`
	SeasonKey string `json:"seasonKey"`
	NicknameSnapshot string `json:"nicknameSnapshot"`
	AvatarUrl string `json:"avatarUrl"`
	RankNo int `json:"rankNo"`
	PreviousRankNo int `json:"previousRankNo"`
	PeakRankNo int `json:"peakRankNo"`
	Status string `json:"status"`
	ScoreValue float64 `json:"scoreValue"`
	ScoreDelta float64 `json:"scoreDelta"`
	TieBreakerValue float64 `json:"tieBreakerValue"`
	DisplayValue string `json:"displayValue"`
	TotalMatchCount int `json:"totalMatchCount"`
	WinCount int `json:"winCount"`
	LoseCount int `json:"loseCount"`
	DrawCount int `json:"drawCount"`
	StreakCount int `json:"streakCount"`
	RewardGranted bool `json:"rewardGranted"`
	RewardIssuedAt string `json:"rewardIssuedAt"`
	BadgeCode string `json:"badgeCode"`
}
