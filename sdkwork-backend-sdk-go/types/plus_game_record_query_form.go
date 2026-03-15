package types

// 棋牌游戏战绩查询表单
type PlusGameRecordQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	UserId int `json:"userId"`
	RoomId int `json:"roomId"`
	MatchId int `json:"matchId"`
	TournamentId int `json:"tournamentId"`
	ClubId int `json:"clubId"`
	SeatNo int `json:"seatNo"`
	Winner bool `json:"winner"`
	Escaped bool `json:"escaped"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	ResultType string `json:"resultType"`
}
