package types

// 棋牌游戏挑战赛管理表单
type PlusGameChallengeManageForm struct {
	Status string `json:"status"`
	WinnerUserId int `json:"winnerUserId"`
	RoomId int `json:"roomId"`
	MatchId int `json:"matchId"`
	Reason string `json:"reason"`
}
