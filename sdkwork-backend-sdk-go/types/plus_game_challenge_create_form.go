package types

// 棋牌游戏挑战赛创建表单
type PlusGameChallengeCreateForm struct {
	ChallengerUserId int `json:"challengerUserId"`
	TargetUserId int `json:"targetUserId"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	StakeScore int `json:"stakeScore"`
	SourceType string `json:"sourceType"`
	ArenaId int `json:"arenaId"`
	LeaderboardId int `json:"leaderboardId"`
	Reason string `json:"reason"`
}
