package types

// 棋牌游戏赛事参赛者批量编排表单
type PlusGameTournamentBatchArrangeForm struct {
	UserIds []int `json:"userIds"`
	ArrangePlayers []PlusGameTournamentBatchArrangePlayerForm `json:"arrangePlayers"`
	SeedNoStart int `json:"seedNoStart"`
	TeamNoStart int `json:"teamNoStart"`
	GroupSize int `json:"groupSize"`
	OverwriteExistingSeedNo bool `json:"overwriteExistingSeedNo"`
	OverwriteExistingTeamNo bool `json:"overwriteExistingTeamNo"`
}
