package types

// 棋牌游戏赛事参赛者管理表单
type PlusGameTournamentPlayerManageForm struct {
	Status string `json:"status"`
	SeedNo int `json:"seedNo"`
	RankNo int `json:"rankNo"`
	TeamNo int `json:"teamNo"`
	ScoreValue float64 `json:"scoreValue"`
	TotalMatchCount int `json:"totalMatchCount"`
	WinCount int `json:"winCount"`
	LoseCount int `json:"loseCount"`
}
