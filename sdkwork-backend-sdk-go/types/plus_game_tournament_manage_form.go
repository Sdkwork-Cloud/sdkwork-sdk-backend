package types

// 棋牌游戏赛事管理表单
type PlusGameTournamentManageForm struct {
	Status string `json:"status"`
	SignUpStartAt string `json:"signUpStartAt"`
	SignUpEndAt string `json:"signUpEndAt"`
	StartAt string `json:"startAt"`
	EndAt string `json:"endAt"`
	WinnerUserId int `json:"winnerUserId"`
	WinnerClubId int `json:"winnerClubId"`
}
