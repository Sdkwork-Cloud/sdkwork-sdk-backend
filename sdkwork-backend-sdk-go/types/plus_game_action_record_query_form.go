package types

// 棋牌游戏动作流水查询表单
type PlusGameActionRecordQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	RoomId int `json:"roomId"`
	MatchId int `json:"matchId"`
	PlayerUserId int `json:"playerUserId"`
	ActionType string `json:"actionType"`
	ActionCode string `json:"actionCode"`
}
