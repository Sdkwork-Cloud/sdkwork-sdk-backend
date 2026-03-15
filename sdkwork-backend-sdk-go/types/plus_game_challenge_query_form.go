package types

// 棋牌游戏挑战赛查询表单
type PlusGameChallengeQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	ChallengerUserId int `json:"challengerUserId"`
	TargetUserId int `json:"targetUserId"`
	ArenaId int `json:"arenaId"`
	WinnerUserId int `json:"winnerUserId"`
	GameType string `json:"gameType"`
	Status string `json:"status"`
	SourceType string `json:"sourceType"`
}
