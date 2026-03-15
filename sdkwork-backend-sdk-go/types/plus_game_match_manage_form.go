package types

// 棋牌游戏对局管理表单
type PlusGameMatchManageForm struct {
	Status string `json:"status"`
	CurrentRoundNo int `json:"currentRoundNo"`
	MaxRoundCount int `json:"maxRoundCount"`
	CurrentTurnSeatNo int `json:"currentTurnSeatNo"`
	DealerSeatNo int `json:"dealerSeatNo"`
	WinnerSeatNo int `json:"winnerSeatNo"`
	WinnerUserId int `json:"winnerUserId"`
	LeaderboardEligible bool `json:"leaderboardEligible"`
	ValidForStats bool `json:"validForStats"`
	ResultConfirmed bool `json:"resultConfirmed"`
	AbnormalFinished bool `json:"abnormalFinished"`
	InvalidReason string `json:"invalidReason"`
}
