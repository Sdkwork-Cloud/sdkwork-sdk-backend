package types

// 棋牌游戏对局VO
type PlusGameMatchVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	MatchId int `json:"matchId"`
	DefinitionId int `json:"definitionId"`
	RoomId int `json:"roomId"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
	MatchNo string `json:"matchNo"`
	RoomType string `json:"roomType"`
	Status string `json:"status"`
	Ranked bool `json:"ranked"`
	TotalPlayerCount int `json:"totalPlayerCount"`
	ClubId int `json:"clubId"`
	TournamentId int `json:"tournamentId"`
	RegionCode string `json:"regionCode"`
	CurrentRoundNo int `json:"currentRoundNo"`
	MaxRoundCount int `json:"maxRoundCount"`
	CurrentTurnSeatNo int `json:"currentTurnSeatNo"`
	DealerSeatNo int `json:"dealerSeatNo"`
	WinnerSeatNo int `json:"winnerSeatNo"`
	WinnerUserId int `json:"winnerUserId"`
	ReplayId int `json:"replayId"`
	ActionCount int `json:"actionCount"`
	MoveCount int `json:"moveCount"`
	LeaderboardEligible bool `json:"leaderboardEligible"`
	ValidForStats bool `json:"validForStats"`
	ResultConfirmed bool `json:"resultConfirmed"`
	AbnormalFinished bool `json:"abnormalFinished"`
	InvalidReason string `json:"invalidReason"`
	StartedAt string `json:"startedAt"`
	SettledAt string `json:"settledAt"`
	EndedAt string `json:"endedAt"`
	DurationSeconds int `json:"durationSeconds"`
}
