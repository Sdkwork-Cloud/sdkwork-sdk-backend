package types

// 棋牌游戏积分流水查询表单
type PlusGameScoreRecordQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	UserId int `json:"userId"`
	GameType string `json:"gameType"`
	ChangeType string `json:"changeType"`
	TournamentId int `json:"tournamentId"`
	RoomId int `json:"roomId"`
	MatchId int `json:"matchId"`
	LeaderboardId int `json:"leaderboardId"`
	BizNo string `json:"bizNo"`
	OperatorUserId int `json:"operatorUserId"`
}
