package types

// 棋牌游戏赛事参赛者批量编排项
type PlusGameTournamentBatchArrangePlayerForm struct {
	UserId int `json:"userId"`
	SeedNo int `json:"seedNo"`
	TeamNo int `json:"teamNo"`
}
