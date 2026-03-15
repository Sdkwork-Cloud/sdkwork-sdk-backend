package types

// 棋牌游戏赛事参赛者VO
type PlusGameTournamentPlayerVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	PlayerId int `json:"playerId"`
	TournamentId int `json:"tournamentId"`
	UserId int `json:"userId"`
	GameType string `json:"gameType"`
	ClubId int `json:"clubId"`
	TeamNo int `json:"teamNo"`
	Status string `json:"status"`
	SeedNo int `json:"seedNo"`
	RankNo int `json:"rankNo"`
	NicknameSnapshot string `json:"nicknameSnapshot"`
	AvatarUrl string `json:"avatarUrl"`
	ScoreValue float64 `json:"scoreValue"`
	TotalMatchCount int `json:"totalMatchCount"`
	WinCount int `json:"winCount"`
	LoseCount int `json:"loseCount"`
	RegisteredAt string `json:"registeredAt"`
	CheckedInAt string `json:"checkedInAt"`
	FinishedAt string `json:"finishedAt"`
}
