package types

// 棋牌游戏挑战赛VO
type PlusGameChallengeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ChallengeId int `json:"challengeId"`
	ChallengeNo string `json:"challengeNo"`
	ArenaId int `json:"arenaId"`
	SourceType string `json:"sourceType"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	Status string `json:"status"`
	ChallengerUserId int `json:"challengerUserId"`
	TargetUserId int `json:"targetUserId"`
	WinnerUserId int `json:"winnerUserId"`
	LoserUserId int `json:"loserUserId"`
	StakeScore int `json:"stakeScore"`
	ChallengerStakeLocked int `json:"challengerStakeLocked"`
	TargetStakeLocked int `json:"targetStakeLocked"`
	LeaderboardId int `json:"leaderboardId"`
	RoomId int `json:"roomId"`
	MatchId int `json:"matchId"`
	Reason string `json:"reason"`
	ChallengedAt string `json:"challengedAt"`
	AcceptedAt string `json:"acceptedAt"`
	SettledAt string `json:"settledAt"`
	ExpiredAt string `json:"expiredAt"`
	CanceledAt string `json:"canceledAt"`
}
