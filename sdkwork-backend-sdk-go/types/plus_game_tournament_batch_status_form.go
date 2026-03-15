package types

// 棋牌游戏赛事参赛者批量状态管理表单
type PlusGameTournamentBatchStatusForm struct {
	UserIds []int `json:"userIds"`
	PlayerItems []PlusGameTournamentBatchStatusPlayerForm `json:"playerItems"`
	Status string `json:"status"`
	StartRankNo int `json:"startRankNo"`
}
