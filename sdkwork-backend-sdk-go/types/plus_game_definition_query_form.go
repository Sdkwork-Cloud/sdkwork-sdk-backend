package types

// 棋牌游戏玩法定义查询表单
type PlusGameDefinitionQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	Code string `json:"code"`
	CodeLike string `json:"codeLike"`
	NameLike string `json:"nameLike"`
	GameType string `json:"gameType"`
	Category string `json:"category"`
	GameModeCode string `json:"gameModeCode"`
	Enabled bool `json:"enabled"`
	Ranked bool `json:"ranked"`
	SupportsReplay bool `json:"supportsReplay"`
	SupportsTournament bool `json:"supportsTournament"`
}
