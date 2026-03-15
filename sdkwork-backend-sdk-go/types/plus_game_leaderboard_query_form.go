package types

// 棋牌游戏排行榜查询表单
type PlusGameLeaderboardQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
	ScopeOwnerId int `json:"scopeOwnerId"`
	RankingType string `json:"rankingType"`
	PeriodType string `json:"periodType"`
	ScopeType string `json:"scopeType"`
}
