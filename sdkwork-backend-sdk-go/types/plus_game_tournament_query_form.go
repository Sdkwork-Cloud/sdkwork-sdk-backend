package types

// 棋牌游戏赛事查询表单
type PlusGameTournamentQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	GameType string `json:"gameType"`
	Status string `json:"status"`
}
