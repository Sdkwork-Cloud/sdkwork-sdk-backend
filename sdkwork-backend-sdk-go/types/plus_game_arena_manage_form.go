package types

// 棋牌游戏擂台管理表单
type PlusGameArenaManageForm struct {
	OwnerUserId int `json:"ownerUserId"`
	CurrentChampionUserId int `json:"currentChampionUserId"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	Status string `json:"status"`
	Name string `json:"name"`
	Description string `json:"description"`
	StakeScore int `json:"stakeScore"`
	RoomId int `json:"roomId"`
	MatchId int `json:"matchId"`
	Reason string `json:"reason"`
}
