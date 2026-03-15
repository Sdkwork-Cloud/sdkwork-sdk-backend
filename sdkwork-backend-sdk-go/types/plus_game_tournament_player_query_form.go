package types

// 棋牌游戏赛事参赛者查询表单
type PlusGameTournamentPlayerQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	TournamentId int `json:"tournamentId"`
	UserId int `json:"userId"`
	Status string `json:"status"`
}
