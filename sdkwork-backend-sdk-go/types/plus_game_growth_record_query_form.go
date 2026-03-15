package types

// Growth record query form
type PlusGameGrowthRecordQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	UserId int `json:"userId"`
	AccountType string `json:"accountType"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	SeasonKey string `json:"seasonKey"`
	RoomId int `json:"roomId"`
	MatchId int `json:"matchId"`
	TournamentId int `json:"tournamentId"`
	SourceType string `json:"sourceType"`
}
