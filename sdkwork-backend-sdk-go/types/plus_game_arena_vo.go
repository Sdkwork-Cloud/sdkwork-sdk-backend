package types

// 棋牌游戏擂台VO
type PlusGameArenaVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ArenaId int `json:"arenaId"`
	ArenaNo string `json:"arenaNo"`
	Name string `json:"name"`
	Description string `json:"description"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	Status string `json:"status"`
	OwnerUserId int `json:"ownerUserId"`
	CurrentChampionUserId int `json:"currentChampionUserId"`
	CurrentChallengeId int `json:"currentChallengeId"`
	StakeScore int `json:"stakeScore"`
	TotalChallengeCount int `json:"totalChallengeCount"`
	SuccessfulDefenseCount int `json:"successfulDefenseCount"`
	FailedDefenseCount int `json:"failedDefenseCount"`
	CurrentDefenseStreak int `json:"currentDefenseStreak"`
	BestDefenseStreak int `json:"bestDefenseStreak"`
	TotalRewardScore int `json:"totalRewardScore"`
	RoomId int `json:"roomId"`
	MatchId int `json:"matchId"`
	OpenedAt string `json:"openedAt"`
	LastChallengeAt string `json:"lastChallengeAt"`
	LastSettledAt string `json:"lastSettledAt"`
	ClosedAt string `json:"closedAt"`
}
