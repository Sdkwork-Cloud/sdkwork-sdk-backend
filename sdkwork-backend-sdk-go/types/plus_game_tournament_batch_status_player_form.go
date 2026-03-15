package types

// 棋牌游戏赛事参赛者批量状态项
type PlusGameTournamentBatchStatusPlayerForm struct {
	UserId int `json:"userId"`
	Status string `json:"status"`
	RankNo int `json:"rankNo"`
	ScoreValue float64 `json:"scoreValue"`
	TotalMatchCount int `json:"totalMatchCount"`
	WinCount int `json:"winCount"`
	LoseCount int `json:"loseCount"`
}
