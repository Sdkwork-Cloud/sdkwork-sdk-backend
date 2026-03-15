package types

// 妫嬬墝娓告垙鐜╁缁熻鏌ヨ琛ㄥ崟
type PlusGameStatsQueryForm struct {
	UserId int `json:"userId"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
	ScopeType string `json:"scopeType"`
	ScopeOwnerId int `json:"scopeOwnerId"`
}
