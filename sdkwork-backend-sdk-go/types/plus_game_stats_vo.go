package types

// 棋牌游戏玩家统计VO
type PlusGameStatsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	StatsId int `json:"statsId"`
	UserId int `json:"userId"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
	ScopeType string `json:"scopeType"`
	ScopeOwnerId int `json:"scopeOwnerId"`
	ClubId int `json:"clubId"`
	RegionCode string `json:"regionCode"`
	NicknameSnapshot string `json:"nicknameSnapshot"`
	AvatarUrl string `json:"avatarUrl"`
	RankingType string `json:"rankingType"`
	TotalMatchCount int `json:"totalMatchCount"`
	WinCount int `json:"winCount"`
	LoseCount int `json:"loseCount"`
	DrawCount int `json:"drawCount"`
	EscapeCount int `json:"escapeCount"`
	TotalRoundCount int `json:"totalRoundCount"`
	TotalActionCount int `json:"totalActionCount"`
	TotalMoveCount int `json:"totalMoveCount"`
	TotalDurationSeconds int `json:"totalDurationSeconds"`
	Score int `json:"score"`
	RatingScore int `json:"ratingScore"`
	ChipsBalance int `json:"chipsBalance"`
	ProfitAmount int `json:"profitAmount"`
	WinRate float64 `json:"winRate"`
	CurrentWinStreak int `json:"currentWinStreak"`
	BestWinStreak int `json:"bestWinStreak"`
	HighestRatingScore int `json:"highestRatingScore"`
	BestRankNo int `json:"bestRankNo"`
	BestDailyRankNo int `json:"bestDailyRankNo"`
	BestWeeklyRankNo int `json:"bestWeeklyRankNo"`
	BestMonthlyRankNo int `json:"bestMonthlyRankNo"`
	BestQuarterlyRankNo int `json:"bestQuarterlyRankNo"`
	BestYearlyRankNo int `json:"bestYearlyRankNo"`
	HonorCount int `json:"honorCount"`
	LeaderboardPosition int `json:"leaderboardPosition"`
	LastMatchAt string `json:"lastMatchAt"`
	ChallengeTotalCount int `json:"challengeTotalCount"`
	ChallengeWinCount int `json:"challengeWinCount"`
	ChallengeLoseCount int `json:"challengeLoseCount"`
	ArenaAttackWinCount int `json:"arenaAttackWinCount"`
	ArenaDefenseWinCount int `json:"arenaDefenseWinCount"`
	ArenaDefenseLoseCount int `json:"arenaDefenseLoseCount"`
	ArenaBestDefenseStreak int `json:"arenaBestDefenseStreak"`
}
