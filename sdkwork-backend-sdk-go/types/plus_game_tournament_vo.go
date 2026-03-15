package types

// 棋牌游戏赛事VO
type PlusGameTournamentVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	TournamentId int `json:"tournamentId"`
	TournamentNo string `json:"tournamentNo"`
	Name string `json:"name"`
	ShortName string `json:"shortName"`
	Description string `json:"description"`
	GameType string `json:"gameType"`
	GameModeCode string `json:"gameModeCode"`
	TournamentType string `json:"tournamentType"`
	Status string `json:"status"`
	OrganizerUserId int `json:"organizerUserId"`
	ClubId int `json:"clubId"`
	SeasonKey string `json:"seasonKey"`
	RegionCode string `json:"regionCode"`
	MinPlayerCount int `json:"minPlayerCount"`
	MaxPlayerCount int `json:"maxPlayerCount"`
	TeamSize int `json:"teamSize"`
	RegistrationRequired bool `json:"registrationRequired"`
	Ranked bool `json:"ranked"`
	ReplayEnabled bool `json:"replayEnabled"`
	SignUpStartAt string `json:"signUpStartAt"`
	SignUpEndAt string `json:"signUpEndAt"`
	StartAt string `json:"startAt"`
	EndAt string `json:"endAt"`
	WinnerUserId int `json:"winnerUserId"`
	WinnerClubId int `json:"winnerClubId"`
	TotalParticipantCount int `json:"totalParticipantCount"`
	TotalMatchCount int `json:"totalMatchCount"`
	RegisteredCount int `json:"registeredCount"`
	CheckedInCount int `json:"checkedInCount"`
	PlayingCount int `json:"playingCount"`
	AdvancedCount int `json:"advancedCount"`
	EliminatedCount int `json:"eliminatedCount"`
	FinishedCount int `json:"finishedCount"`
	WithdrawnCount int `json:"withdrawnCount"`
}
