package types

// 棋牌游戏排行榜VO
type PlusGameLeaderboardVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	LeaderboardId int `json:"leaderboardId"`
	LeaderboardNo string `json:"leaderboardNo"`
	Name string `json:"name"`
	ShortName string `json:"shortName"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	RankingType string `json:"rankingType"`
	PeriodType string `json:"periodType"`
	ScopeType string `json:"scopeType"`
	ScopeOwnerId int `json:"scopeOwnerId"`
	ScopeName string `json:"scopeName"`
	SeasonKey string `json:"seasonKey"`
	ClubId int `json:"clubId"`
	TournamentId int `json:"tournamentId"`
	RegionCode string `json:"regionCode"`
	Status string `json:"status"`
	RankedOnly bool `json:"rankedOnly"`
	IncludeFriendRoom bool `json:"includeFriendRoom"`
	IncludeTournamentRoom bool `json:"includeTournamentRoom"`
	IncludeClubRoom bool `json:"includeClubRoom"`
	MinMatchCount int `json:"minMatchCount"`
	MinWinRateMatchCount int `json:"minWinRateMatchCount"`
	TotalParticipantCount int `json:"totalParticipantCount"`
	PeriodStartAt string `json:"periodStartAt"`
	PeriodEndAt string `json:"periodEndAt"`
	PublishedAt string `json:"publishedAt"`
	SettledAt string `json:"settledAt"`
	Entries []PlusGameLeaderboardEntryVO `json:"entries"`
}
