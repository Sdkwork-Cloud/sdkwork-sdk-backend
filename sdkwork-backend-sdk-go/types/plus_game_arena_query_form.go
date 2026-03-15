package types

// 棋牌游戏擂台查询表单
type PlusGameArenaQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	OwnerUserId int `json:"ownerUserId"`
	CurrentChampionUserId int `json:"currentChampionUserId"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	Status string `json:"status"`
}
